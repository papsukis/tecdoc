package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVTypesAndEngineAllocation;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVTypesAndEngineAllocationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVTypesAndEngineAllocationRepository extends JpaRepository<CVTypesAndEngineAllocation, CVTypesAndEngineAllocationId> {


}
