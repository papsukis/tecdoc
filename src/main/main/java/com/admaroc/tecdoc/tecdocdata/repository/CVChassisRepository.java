package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVChassis;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVChassisId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVChassisRepository extends JpaRepository<CVChassis, CVChassisId> {


}
