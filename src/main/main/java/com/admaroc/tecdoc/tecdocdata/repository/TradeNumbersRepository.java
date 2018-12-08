package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.TradeNumbers;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.TradeNumbersId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeNumbersRepository extends JpaRepository<TradeNumbers, TradeNumbersId> {


}
