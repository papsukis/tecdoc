package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.PartsLists;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.PartsListsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsListsRepository extends JpaRepository<PartsLists, PartsListsId> {


}
