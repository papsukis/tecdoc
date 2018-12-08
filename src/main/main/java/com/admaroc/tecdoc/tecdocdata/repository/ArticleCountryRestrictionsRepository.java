package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ArticleCountryRestrictions;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleCountryRestrictionsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleCountryRestrictionsRepository extends JpaRepository<ArticleCountryRestrictions, ArticleCountryRestrictionsId> {

}
