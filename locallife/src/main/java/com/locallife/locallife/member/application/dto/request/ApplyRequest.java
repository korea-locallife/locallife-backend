package com.locallife.locallife.member.application.dto.request;

import lombok.Builder;

@Builder
public record ApplyRequest(
        String certification,
        String portfolio
) {
}
