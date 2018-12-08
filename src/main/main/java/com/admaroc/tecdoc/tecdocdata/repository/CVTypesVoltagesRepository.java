package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVTypesVoltages;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVTypesVoltagesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVTypesVoltagesRepository extends JpaRepository<CVTypesVoltages, CVTypesVoltagesId> {


}
