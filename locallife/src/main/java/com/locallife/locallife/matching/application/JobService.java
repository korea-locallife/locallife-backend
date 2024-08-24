package com.locallife.locallife.matching.application;

import com.locallife.locallife.matching.application.dto.response.JobResponse;
import com.locallife.locallife.matching.entity.DormitoryJob;
import com.locallife.locallife.matching.entity.Job;
import com.locallife.locallife.matching.entity.repository.DormitoryJobRepository;
import com.locallife.locallife.matching.entity.repository.JobRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class JobService {
    private final JobRepository jobRepository;
    private final DormitoryJobRepository dormitoryJobRepository;

    public List<JobResponse> getJobInfo(final String local) {
        List<Job> jobs = jobRepository.findAllByLocal(local);
        List<Long> jobIds = jobs.stream()
                .map(Job::getId)
                .toList();
        List<DormitoryJob> dormitoryJobs = dormitoryJobRepository.findAllByJobIdIn(jobIds);
        return JobResponse.of(jobs, dormitoryJobs);
    }

    public Job getJobInfoDetail(final Long jobId) {
        Job job = jobRepository.findById(jobId).orElseThrow();
        return job;
    }
}
