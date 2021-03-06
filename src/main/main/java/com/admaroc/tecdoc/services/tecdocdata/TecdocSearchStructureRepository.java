package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.TecdocSearchStructure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecdocSearchStructureRepository extends JpaRepository<TecdocSearchStructure, Integer> {

}
