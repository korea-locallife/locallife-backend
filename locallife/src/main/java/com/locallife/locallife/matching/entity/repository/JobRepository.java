package com.locallife.locallife.matching.entity.repository;

import com.locallife.locallife.matching.entity.Job;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findAllByLocal(final String local);
}
