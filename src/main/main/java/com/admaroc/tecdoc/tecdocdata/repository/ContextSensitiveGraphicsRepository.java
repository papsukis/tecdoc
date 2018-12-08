package com.admaroc.tecdoc.tecdocdata.repository;

import com.admaroc.tecdoc.tecdocdata.model.ContextSensitiveGraphics;
import com.admaroc.tecdoc.tecdocdata.model.compositeKeys.ContextSensitiveGraphicsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContextSensitiveGraphicsRepository extends JpaRepository<ContextSensitiveGraphics, ContextSensitiveGraphicsId> {

}
