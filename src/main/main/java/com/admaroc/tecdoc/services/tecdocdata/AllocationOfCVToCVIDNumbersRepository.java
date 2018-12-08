package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfCVToCVIDNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfCVToCVIDNumbersRepository extends JpaRepository<AllocationOfCVToCVIDNumbers, Integer> {


}
