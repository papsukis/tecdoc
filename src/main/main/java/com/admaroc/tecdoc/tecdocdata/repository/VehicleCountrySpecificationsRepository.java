package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.VehicleCountrySpecifications;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.VehicleCountrySpecificationsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCountrySpecificationsRepository extends JpaRepository<VehicleCountrySpecifications, VehicleCountrySpecificationsId> {

}
