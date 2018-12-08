package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AxleBodyTypes;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AxleBodyTypesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AxleBodyTypesRepository extends JpaRepository<AxleBodyTypes, AxleBodyTypesId> {


}
