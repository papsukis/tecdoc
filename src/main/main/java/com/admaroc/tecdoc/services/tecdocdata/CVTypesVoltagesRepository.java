package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.CVTypesVoltages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVTypesVoltagesRepository extends JpaRepository<CVTypesVoltages, Integer> {


}
