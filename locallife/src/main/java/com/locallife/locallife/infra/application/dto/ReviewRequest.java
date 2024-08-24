package com.locallife.locallife.infra.application.dto;

import lombok.Builder;

@Builder
public record ReviewRequest(
        String description,
        String local
) {
}
