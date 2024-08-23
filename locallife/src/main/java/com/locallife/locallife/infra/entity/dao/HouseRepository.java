package com.locallife.locallife.infra.entity.dao;

import com.locallife.locallife.infra.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long> {
}
