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
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String local;

    @Column(nullable = false)
    private String count;

    @Column
    private String imageUrl;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String writer;

    @Column(nullable = false)
    private String scheduleImageUrl;

    @Builder
    private Job(final String name, final String description, final String category, final String local,
               final String count, final String imageUrl, final String title,
               final String writer, final String scheduleImageUrl) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.local = local;
        this.count = count;
        this.imageUrl = imageUrl;
        this.title = title;
        this.writer = writer;
        this.scheduleImageUrl = scheduleImageUrl;
    }
}
