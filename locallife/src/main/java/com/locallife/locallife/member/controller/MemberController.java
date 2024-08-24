package com.locallife.locallife.member.controller;

import com.locallife.locallife.member.application.MemberService;
import com.locallife.locallife.member.application.dto.request.ApplyRequest;
import com.locallife.locallife.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/{memberId}/apply")
    public ResponseEntity<Void> createApplication(@RequestBody ApplyRequest applyRequest,
                                                  @PathVariable Long memberId) {
        memberService.createApplication(applyRequest, memberId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{memberId}/result")
    public ResponseEntity<Member> getApplyResult(@PathVariable Long memberId) {
        return ResponseEntity.ok(memberService.getApplyResult(memberId));
    }
}
