package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ArticleCriteria;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleCriteriaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleCriteriaRepository extends JpaRepository<ArticleCriteria, ArticleCriteriaId> {


}
