package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfSwedishNumberPlatesToVehicleTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfSwedishNumberPlatesToVehicleTypesRepository extends JpaRepository<AllocationOfSwedishNumberPlatesToVehicleTypes, Integer> {


}
