package ru.burenkov.exportpdf.mapper;

import org.mapstruct.Mapper;
import ru.burenkov.exportpdf.entity.ApplicationForCredit;
import ru.burenkov.exportpdf.model.Application;

@Mapper(componentModel = "spring")
public interface ApplicationForCreditMapper {
    Application applicationToApplicationForCredit (ApplicationForCredit application);
}
