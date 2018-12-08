package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.LinkagesNotToBeDisplayedInCertainCountries;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.LinkagesNotToBeDisplayedInCertainCountriesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkagesNotToBeDisplayedInCertainCountriesRepository extends JpaRepository<LinkagesNotToBeDisplayedInCertainCountries, LinkagesNotToBeDisplayedInCertainCountriesId> {

}
