package ru.burenkov.exportpdf.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.burenkov.exportpdf.entity.ApplicationForCredit;
import ru.burenkov.exportpdf.repository.ApplicationForCreditRepository;

@Service
@RequiredArgsConstructor
public class ApplicationForCreditService {
    private final ApplicationForCreditRepository applicationForCreditRepository;

    public ApplicationForCredit getById(Long id) {
        ApplicationForCredit application = new ApplicationForCredit();
        if(id > 0){
            return application = applicationForCreditRepository.getById(id);
        }
        return null;

    }
}

