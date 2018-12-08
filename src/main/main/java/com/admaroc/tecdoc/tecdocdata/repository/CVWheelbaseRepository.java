package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVWheelbase;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVWheelbaseId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVWheelbaseRepository extends JpaRepository<CVWheelbase, CVWheelbaseId> {


}
