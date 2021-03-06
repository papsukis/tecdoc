package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {


}
