package com.Solera.APIRest.APIwithTDD.Repository;

import com.Solera.APIRest.APIwithTDD.Models.PartsClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepository extends CrudRepository<PartsClass, Long> {
}
