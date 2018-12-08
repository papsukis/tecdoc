package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.EngineNumberAllocationtoVehicleTypes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.EngineNumberAllocationtoVehicleTypesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineNumberAllocationtoVehicleTypesRepository extends JpaRepository<EngineNumberAllocationtoVehicleTypes, EngineNumberAllocationtoVehicleTypesId> {


}
