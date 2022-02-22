package ru.burenkov.exportpdf.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.burenkov.exportpdf.entity.ApplicationForCredit;
import ru.burenkov.exportpdf.exception.ApplicationForCreditException;
import ru.burenkov.exportpdf.mapper.ApplicationForCreditMapper;
import ru.burenkov.exportpdf.model.Application;
import ru.burenkov.exportpdf.repository.ApplicationForCreditRepository;

@Service
@RequiredArgsConstructor
public class ApplicationForCreditServiceImp implements ApplicationForCreditService {
    private final ApplicationForCreditRepository applicationForCreditRepository;
    private final ApplicationForCreditMapper applicationForCreditMapper;

    @Override
    public Application getById(Long id) {
        ApplicationForCredit applicationForCredit = applicationForCreditRepository.findById(id)
                .orElseThrow(() -> new ApplicationForCreditException("Application not found ID = " + id));
        return applicationForCreditMapper.applicationToApplicationForCredit(applicationForCredit);
    }
}

