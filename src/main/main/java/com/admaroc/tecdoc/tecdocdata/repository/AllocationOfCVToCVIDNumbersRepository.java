package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfCVToCVIDNumbers;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfCVToCVIDNumbersId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfCVToCVIDNumbersRepository extends JpaRepository<AllocationOfCVToCVIDNumbers, AllocationOfCVToCVIDNumbersId> {


}
