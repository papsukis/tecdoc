package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.KeyTablesEntries;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.KeyTablesEntriesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyTablesEntriesRepository extends JpaRepository<KeyTablesEntries, KeyTablesEntriesId> {


}
