package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AxleBrakeSize;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AxleBrakeSizeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AxleBrakeSizeRepository extends JpaRepository<AxleBrakeSize, AxleBrakeSizeId> {


}
