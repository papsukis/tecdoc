package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfTypeMineNumbersToVehicleTypes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfTypeMineNumbersToVehicleTypesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfTypeMineNumbersToVehicleTypesRepository extends JpaRepository<AllocationOfTypeMineNumbersToVehicleTypes, AllocationOfTypeMineNumbersToVehicleTypesId> {


}
