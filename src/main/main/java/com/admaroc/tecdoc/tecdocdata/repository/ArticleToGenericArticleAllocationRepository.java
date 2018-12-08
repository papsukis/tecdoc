package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ArticleToGenericArticleAllocation;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ArticleToGenericArticleAllocationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleToGenericArticleAllocationRepository extends JpaRepository<ArticleToGenericArticleAllocation, ArticleToGenericArticleAllocationId> {


}
