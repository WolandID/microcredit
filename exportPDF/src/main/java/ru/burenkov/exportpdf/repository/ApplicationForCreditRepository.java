package ru.burenkov.exportpdf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.burenkov.exportpdf.entity.ApplicationForCredit;


@Repository
public interface ApplicationForCreditRepository extends JpaRepository<ApplicationForCredit,Long>{}



