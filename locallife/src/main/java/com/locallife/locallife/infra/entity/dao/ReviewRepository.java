package com.locallife.locallife.infra.entity.dao;

import com.locallife.locallife.infra.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
