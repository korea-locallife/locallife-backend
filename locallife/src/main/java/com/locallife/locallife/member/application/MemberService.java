package com.locallife.locallife.member.application;

import com.locallife.locallife.member.application.dto.request.ApplyRequest;
import com.locallife.locallife.member.entity.Member;
import com.locallife.locallife.member.entity.dao.MemberRepository;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    private final Random random = new Random();

    public void createApplication(final ApplyRequest applyRequest, final Long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow();
        boolean result = random.nextDouble() < 0.3;

        memberRepository.save(Member.builder()
                .loginId(member.getLoginId())
                .password(member.getPassword())
                .name(member.getName())
                .phone(member.getPhone())
                .email(member.getEmail())
                .gender(member.getGender())
                .birthday(member.getBirthday())
                .result(result)
                .portfolio(applyRequest.portfolio())
                .certification(applyRequest.certification())
                .build());
    }

    public Member getApplyResult(final Long memberId) {
        return memberRepository.findById(memberId).orElseThrow();
    }

}
