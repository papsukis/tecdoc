package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfAxleTypesToCVTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfAxleTypesToCVTypesRepository extends JpaRepository<AllocationOfAxleTypesToCVTypes, Integer> {


}
