package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.NetherlandsNumberPlateToVehicleTypeAllocation;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.NetherlandsNumberPlateToVehicleTypeAllocationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetherlandsNumberPlateToVehicleTypeAllocationRepository extends JpaRepository<NetherlandsNumberPlateToVehicleTypeAllocation, NetherlandsNumberPlateToVehicleTypeAllocationId> {

}
