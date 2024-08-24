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
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column
    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String birthday;

    @Column
    private Boolean result;

    @Column
    private Long dormitoryId;

    @Column
    private Long jobId;

    @Column
    private String portfolio;

    @Column
    private String certification;

    @Builder
    private Member(final String loginId, final String password, final String name, final String phone,
                  final String email, final String gender, final String birthday,
                  final Boolean result, final String portfolio, final String certification) {
        this.loginId = loginId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.result = result;
        this.portfolio = portfolio;
        this.certification = certification;
    }
}
