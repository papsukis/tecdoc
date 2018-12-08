package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CVProducerIDs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CVProducerIDsRepository extends JpaRepository<CVProducerIDs, Integer> {


}
