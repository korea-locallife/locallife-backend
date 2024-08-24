package com.locallife.locallife.infra.controller;

import com.locallife.locallife.infra.application.InfraService;
import com.locallife.locallife.infra.application.dto.ReviewRequest;
import com.locallife.locallife.infra.entity.Facility;
import com.locallife.locallife.infra.entity.Review;
import com.locallife.locallife.infra.entity.Transport;
import java.util.List;
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
@RequestMapping("/infra")
public class InfraController {
    private final InfraService infraService;

    @GetMapping("/facility/{local}")
    public ResponseEntity<List<Facility>> getFacilityInfo(@PathVariable String local) {
        return ResponseEntity.ok(infraService.getFacilityInfo(local));
    }

    @GetMapping("/transport/{local}")
    public ResponseEntity<List<Transport>> getTransportInfo(@PathVariable String local) {
        return ResponseEntity.ok(infraService.getTransportInfo(local));
    }

    @GetMapping("/review")
    public ResponseEntity<List<Review>> getReviewAll() {
        return ResponseEntity.ok(infraService.getReviewAll());
    }

    @GetMapping("/review/{local}")
    public ResponseEntity<List<Review>> getReviewInfo(@PathVariable String local) {
        return ResponseEntity.ok(infraService.getReviewInfo(local));
    }

    @PostMapping("/review/{applyId}")
    public ResponseEntity<Void> createReview(@RequestBody ReviewRequest reviewRequest, @PathVariable Long applyId) {
        infraService.createReview(reviewRequest, applyId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
