package ru.burenkov.exportpdf.services;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import ru.burenkov.exportpdf.model.Application;


import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;


public record ApplicationToPDFExporter(Application application) {

    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("Full Name", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Age", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Mounts", font));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Sum", font));

        table.addCell(cell);

        cell.setPhrase(new Phrase("Accept", font));
        table.addCell(cell);
    }

    private void writeTableData(PdfPTable table) {

        table.addCell(application.getFullName());
        table.addCell(String.valueOf(application.getAge()));
        table.addCell(String.valueOf(application.getMounts()));
        table.addCell(String.valueOf(application.getSum()));
        table.addCell(String.valueOf(application.getAccept()));

    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);

        Paragraph p = new Paragraph("Credit agreement", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);

        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100f);
        table.setWidths(new float[]{3.5f, 1.5f, 2.0f, 3.0f, 1.5f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();

    }
}
