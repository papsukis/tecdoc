package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfCriteriaToTheSearchStructure;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfCriteriaToTheSearchStructureId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfCriteriaToTheSearchStructureRepository extends JpaRepository<AllocationOfCriteriaToTheSearchStructure, AllocationOfCriteriaToTheSearchStructureId> {


}
