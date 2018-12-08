package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.PartsListCritera;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.PartsListCriteraId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsListCriteraRepository extends JpaRepository<PartsListCritera, PartsListCriteraId> {

}
