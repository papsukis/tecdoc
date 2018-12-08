package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.VehicleCountrySpecifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCountrySpecificationsRepository extends JpaRepository<VehicleCountrySpecifications, Integer> {

}
