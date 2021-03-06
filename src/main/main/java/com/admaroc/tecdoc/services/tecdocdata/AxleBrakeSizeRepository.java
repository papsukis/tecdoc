package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.AxleBrakeSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AxleBrakeSizeRepository extends JpaRepository<AxleBrakeSize, Integer> {


}
