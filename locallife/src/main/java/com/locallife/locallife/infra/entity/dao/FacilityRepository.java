package com.locallife.locallife.infra.entity.dao;

import com.locallife.locallife.infra.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Long> {
}
