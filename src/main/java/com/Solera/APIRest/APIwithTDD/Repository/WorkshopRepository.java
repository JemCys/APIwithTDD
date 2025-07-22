package com.Solera.APIRest.APIwithTDD.Repository;

import com.Solera.APIRest.APIwithTDD.Models.WorkshopClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends CrudRepository<WorkshopClass, Long> {
}
