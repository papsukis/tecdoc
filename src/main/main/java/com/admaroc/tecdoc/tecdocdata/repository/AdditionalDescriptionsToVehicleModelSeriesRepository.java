package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AdditionalDescriptionsToVehicleModelSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalDescriptionsToVehicleModelSeriesRepository extends JpaRepository<AdditionalDescriptionsToVehicleModelSeries, Integer> {


}
