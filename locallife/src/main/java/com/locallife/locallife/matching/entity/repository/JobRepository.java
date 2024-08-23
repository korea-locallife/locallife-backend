package com.locallife.locallife.matching.entity.repository;

import com.locallife.locallife.matching.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
