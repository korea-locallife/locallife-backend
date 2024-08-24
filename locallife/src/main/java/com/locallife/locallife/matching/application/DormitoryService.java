package com.locallife.locallife.matching.application;

import com.locallife.locallife.matching.entity.Dormitory;
import com.locallife.locallife.matching.entity.repository.DormitoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class DormitoryService {
    private final DormitoryRepository dormitoryRepository;

    public List<Dormitory> getDormitoryAll() {
        return dormitoryRepository.findAll();
    }
}
