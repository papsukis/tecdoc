package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfBodyTypesToModelSeries;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfBodyTypesToModelSeriesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfBodyTypesToModelSeriesRepository extends JpaRepository<AllocationOfBodyTypesToModelSeries, AllocationOfBodyTypesToModelSeriesId> {


}
