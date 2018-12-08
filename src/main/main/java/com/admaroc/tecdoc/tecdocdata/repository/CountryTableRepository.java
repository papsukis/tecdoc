package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CountryTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryTableRepository extends JpaRepository<CountryTable, String> {

}
