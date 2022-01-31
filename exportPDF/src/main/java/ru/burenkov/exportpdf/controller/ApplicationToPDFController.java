package ru.burenkov.exportpdf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.burenkov.exportpdf.entity.ApplicationForCredit;
import ru.burenkov.exportpdf.services.ApplicationForCreditService;
import ru.burenkov.exportpdf.services.ApplicationToPDFExporter;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequiredArgsConstructor
public class ApplicationToPDFController {
    private final ApplicationForCreditService applicationForCreditService;

    @GetMapping("/generate/{id}")
    public String pdfExport (HttpServletResponse response, @PathVariable Long id) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);


        ApplicationForCredit application = applicationForCreditService.getById(id);
        if (application.getAccept()){
        ApplicationToPDFExporter applicationToPDFExporter = new ApplicationToPDFExporter(application);
        applicationToPDFExporter.export(response);}

        return String.valueOf(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
    }
}
