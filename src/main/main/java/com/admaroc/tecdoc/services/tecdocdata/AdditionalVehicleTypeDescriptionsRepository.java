package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AdditionalVehicleTypeDescriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalVehicleTypeDescriptionsRepository extends JpaRepository<AdditionalVehicleTypeDescriptions, Integer> {


}
