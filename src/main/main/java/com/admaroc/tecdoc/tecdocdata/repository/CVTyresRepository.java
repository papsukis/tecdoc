package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVTyres;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CVTyresId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVTyresRepository extends JpaRepository<CVTyres, CVTyresId> {


}
