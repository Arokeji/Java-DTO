package com.humberto.dtotutorial.repository;

import com.humberto.dtotutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
