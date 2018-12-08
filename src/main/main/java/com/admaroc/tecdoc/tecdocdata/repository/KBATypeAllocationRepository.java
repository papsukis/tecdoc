package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.KBATypeAllocation;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.KBATypeAllocationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KBATypeAllocationRepository extends JpaRepository<KBATypeAllocation, KBATypeAllocationId> {


}
