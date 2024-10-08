package com.locallife.locallife.infra.application;

import com.locallife.locallife.infra.entity.Facility;
import com.locallife.locallife.infra.entity.Transport;
import com.locallife.locallife.infra.entity.dao.FacilityRepository;
import com.locallife.locallife.infra.entity.dao.ReviewRepository;
import com.locallife.locallife.infra.entity.dao.TransportRepository;
import com.locallife.locallife.member.entity.dao.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class InfraService {
    private final FacilityRepository facilityRepository;
    private final TransportRepository transportRepository;
    private final ReviewRepository reviewRepository;
    private final MemberRepository memberRepository;

    public List<Facility> getFacilityInfo(final String local) {
        return facilityRepository.findAllByLocal(local);
    }

    public List<Transport> getTransportInfo(final String local) {
        return transportRepository.findAllByLocal(local);
    }
}
