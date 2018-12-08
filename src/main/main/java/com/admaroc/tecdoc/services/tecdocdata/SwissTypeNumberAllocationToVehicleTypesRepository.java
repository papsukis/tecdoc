package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.SwissTypeNumberAllocationToVehicleTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwissTypeNumberAllocationToVehicleTypesRepository extends JpaRepository<SwissTypeNumberAllocationToVehicleTypes, Integer> {


}
