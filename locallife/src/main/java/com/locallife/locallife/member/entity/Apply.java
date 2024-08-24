package com.locallife.locallife.member.entity;

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
public class Apply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Boolean result;

    @Column(nullable = false)
    private Long memberId;

    @Column(nullable = false)
    private Long dormitoryId;

    @Column(nullable = false)
    private Long jobId;

    @Column(nullable = false)
    private String description;

    @Column
    private String certification;

    @Builder
    private Apply(final Boolean result, final Long memberId, final Long dormitoryId, final Long jobId) {
        this.result = result;
        this.memberId = memberId;
        this.dormitoryId = dormitoryId;
        this.jobId = jobId;
    }
}
