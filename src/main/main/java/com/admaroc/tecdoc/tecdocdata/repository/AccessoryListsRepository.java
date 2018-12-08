package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AccessoryLists;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AccessoryListsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessoryListsRepository extends JpaRepository<AccessoryLists, AccessoryListsId> {


}
