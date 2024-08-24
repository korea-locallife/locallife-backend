package com.locallife.locallife.matching.entity.repository;

import com.locallife.locallife.matching.entity.Dormitory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DormitoryRepository extends JpaRepository<Dormitory, Long> {
    List<Dormitory> findAllByLocal(final String local);
}
