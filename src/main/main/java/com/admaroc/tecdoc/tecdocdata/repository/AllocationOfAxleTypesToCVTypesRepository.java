package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfAxleTypesToCVTypes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfAxleTypesToCVTypesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfAxleTypesToCVTypesRepository extends JpaRepository<AllocationOfAxleTypesToCVTypes, AllocationOfAxleTypesToCVTypesId> {


}
