package com.locallife.locallife.matching.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DormitoryJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long dormitoryId;

    @Column(nullable = false)
    private Long jobId;

    @Column(nullable = false)
    private Long distance;

    @Column(nullable = false)
    private Long timeByCar;

    @Column(nullable = false)
    private Long timeByTransport;

    @Builder
    private DormitoryJob(final Long dormitoryId, final Long jobId, final Long distance, final Long timeByCar,
                        final Long timeByTransport) {
        this.dormitoryId = dormitoryId;
        this.jobId = jobId;
        this.distance = distance;
        this.timeByCar = timeByCar;
        this.timeByTransport = timeByTransport;
    }
}
