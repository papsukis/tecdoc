package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfBodyTypesToModelSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfBodyTypesToModelSeriesRepository extends JpaRepository<AllocationOfBodyTypesToModelSeries, Integer> {


}
