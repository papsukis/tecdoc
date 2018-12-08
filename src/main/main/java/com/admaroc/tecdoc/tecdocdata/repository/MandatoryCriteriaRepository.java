package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.MandatoryCriteria;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.MandatoryCriteriaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MandatoryCriteriaRepository extends JpaRepository<MandatoryCriteria, MandatoryCriteriaId> {


}
