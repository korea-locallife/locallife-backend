package com.locallife.locallife.member.entity.dao;

import com.locallife.locallife.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
