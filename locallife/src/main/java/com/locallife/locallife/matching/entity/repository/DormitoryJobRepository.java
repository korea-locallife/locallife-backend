package com.locallife.locallife.matching.entity.repository;

import com.locallife.locallife.matching.entity.DormitoryJob;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DormitoryJobRepository extends JpaRepository<DormitoryJob, Long> {
    List<DormitoryJob> findAllByJobIdIn(List<Long> jobIds);
}
