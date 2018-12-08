package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.AllocationOfGraphicsToArticleNumbers;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.AllocationOfGraphicsToArticleNumbersId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationOfGraphicsToArticleNumbersRepository extends JpaRepository<AllocationOfGraphicsToArticleNumbers, AllocationOfGraphicsToArticleNumbersId> {


}
