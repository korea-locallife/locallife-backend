package com.locallife.locallife.infra.entity.dao;

import com.locallife.locallife.infra.entity.Facility;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility, Long> {
    List<Facility> findAllByLocal(final String local);
}
