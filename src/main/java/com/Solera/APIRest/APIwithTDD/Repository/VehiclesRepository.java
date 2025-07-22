package com.Solera.APIRest.APIwithTDD.Repository;

import com.Solera.APIRest.APIwithTDD.Models.VehiclesClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclesRepository extends CrudRepository<VehiclesClass, Long> {
}
