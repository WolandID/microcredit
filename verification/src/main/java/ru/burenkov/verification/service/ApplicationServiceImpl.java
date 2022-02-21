package ru.burenkov.verification.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.burenkov.verification.entity.ApplicationEntity;
import ru.burenkov.verification.mapper.ApplicationMapper;
import ru.burenkov.verification.model.Application;
import ru.burenkov.verification.repository.ApplicationRepository;

@Service
@RequiredArgsConstructor
public class ApplicationServiceImpl implements ApplicationService{
    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;


    @Override
    public void add(Application application) {
        ApplicationEntity applicationEntity = applicationMapper.ApplicationToApplicationEntity(
                application);
        if(application.getAge() > 80 || application.getSum() > 50000000) {
            applicationEntity.setAccept(false);
        }else{
            applicationEntity.setAccept(true);

     }
        applicationRepository.save(applicationEntity);
    }
}
