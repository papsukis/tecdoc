package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.CountryGroups;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.CountryGroupsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryGroupsRepository extends JpaRepository<CountryGroups, CountryGroupsId> {

}
