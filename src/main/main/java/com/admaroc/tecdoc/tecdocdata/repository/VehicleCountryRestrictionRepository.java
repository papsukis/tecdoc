package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.VehicleCountryRestriction;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.VehicleCountryRestrictionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCountryRestrictionRepository extends JpaRepository<VehicleCountryRestriction, VehicleCountryRestrictionId> {

}
