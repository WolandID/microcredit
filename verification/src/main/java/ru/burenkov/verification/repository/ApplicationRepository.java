package ru.burenkov.verification.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.burenkov.verification.entity.ApplicationEntity;

@Repository
public interface ApplicationRepository extends CrudRepository<ApplicationEntity,Long> {
}
