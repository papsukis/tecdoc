package com.admaroc.tecdoc.services.tecdocdata;

import com.admaroc.tecdoc.tecdocdata.model.ContextSensitiveGraphics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContextSensitiveGraphicsRepository extends JpaRepository<ContextSensitiveGraphics, Integer> {

}
