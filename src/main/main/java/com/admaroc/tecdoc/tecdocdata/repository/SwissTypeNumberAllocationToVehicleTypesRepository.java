package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.SwissTypeNumberAllocationToVehicleTypes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.SwissTypeNumberAllocationToVehicleTypesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwissTypeNumberAllocationToVehicleTypesRepository extends JpaRepository<SwissTypeNumberAllocationToVehicleTypes, SwissTypeNumberAllocationToVehicleTypesId> {


}
