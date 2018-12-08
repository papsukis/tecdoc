package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.EAN;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.EANId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EANRepository extends JpaRepository<EAN, EANId> {


}
