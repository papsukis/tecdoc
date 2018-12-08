package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.LinkagesNotToBeDisplayedInCertainCountries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkagesNotToBeDisplayedInCertainCountriesRepository extends JpaRepository<LinkagesNotToBeDisplayedInCertainCountries, Integer> {

}
