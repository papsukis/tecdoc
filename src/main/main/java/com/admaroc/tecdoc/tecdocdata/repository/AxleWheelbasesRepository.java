package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AxleWheelbases;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AxleWheelbasesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AxleWheelbasesRepository extends JpaRepository<AxleWheelbases, AxleWheelbasesId> {


}
