package ru.burenkov.verification.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.burenkov.verification.entity.ApplicationEntity;
import ru.burenkov.verification.model.Application;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
//    ApplicationMapper INSTANCE = Mappers.getMapper(ApplicationMapper.class);

    ApplicationEntity ApplicationToApplicationEntity (Application application);
}
