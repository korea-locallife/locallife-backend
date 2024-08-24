package com.locallife.locallife.infra.application;

import com.locallife.locallife.infra.entity.Facility;
import com.locallife.locallife.infra.entity.dao.FacilityRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InfraService {
    private final FacilityRepository facilityRepository;

    public List<Facility> getFacilityInfo(final String local) {
        return facilityRepository.findAllByLocal(local);
    }
}
