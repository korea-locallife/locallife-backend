package com.locallife.locallife.infra.entity.dao;

import com.locallife.locallife.infra.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, Long> {
}
