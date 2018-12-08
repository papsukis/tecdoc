package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.StandardisedArticleDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardisedArticleDescriptionRepository extends JpaRepository<StandardisedArticleDescription, Integer> {


}
