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
    private String memberId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column
    private String email;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String gender;

    @Builder
    private Member(final String memberId, final String password, final String name, final String phone,
                  final String email, final String age, final String gender) {
        this.memberId = memberId;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }
}
