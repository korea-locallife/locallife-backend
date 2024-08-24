package com.locallife.locallife.matching.controller;

import com.locallife.locallife.matching.application.JobService;
import com.locallife.locallife.matching.application.dto.response.JobResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/matching/jobs")
public class JobController {
    private final JobService jobService;

    @GetMapping("/distance/{local}")
    public ResponseEntity<List<JobResponse>> getJobInfo(@PathVariable String local) {
        return ResponseEntity.ok(jobService.getJobInfo(local));
    }
}
