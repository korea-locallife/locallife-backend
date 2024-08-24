package com.locallife.locallife.infra.controller;

import com.locallife.locallife.infra.application.ReviewService;
import com.locallife.locallife.infra.application.dto.ReviewRequest;
import com.locallife.locallife.infra.entity.Review;
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
@RequestMapping("/infra/review")
public class ReviewController {
    private final ReviewService reviewService;
    @GetMapping
    public ResponseEntity<List<Review>> getReviewAll() {
        return ResponseEntity.ok(reviewService.getReviewAll());
    }

    @GetMapping("/{local}")
    public ResponseEntity<List<Review>> getReviewInfo(@PathVariable String local) {
        return ResponseEntity.ok(reviewService.getReviewInfo(local));
    }

    @PostMapping("/{memberId}")
    public ResponseEntity<Void> createReview(@RequestBody ReviewRequest reviewRequest, @PathVariable Long memberId) {
        reviewService.createReview(reviewRequest, memberId);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
