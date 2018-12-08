package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ProposedCriteria;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ProposedCriteriaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposedCriteriaRepository extends JpaRepository<ProposedCriteria, ProposedCriteriaId> {


}
