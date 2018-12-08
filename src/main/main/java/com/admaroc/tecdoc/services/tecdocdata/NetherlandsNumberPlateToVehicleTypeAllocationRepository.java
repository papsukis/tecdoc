package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.NetherlandsNumberPlateToVehicleTypeAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetherlandsNumberPlateToVehicleTypeAllocationRepository extends JpaRepository<NetherlandsNumberPlateToVehicleTypeAllocation, Integer> {

}
