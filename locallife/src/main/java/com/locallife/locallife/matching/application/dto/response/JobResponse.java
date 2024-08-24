package com.locallife.locallife.matching.application.dto.response;

import com.locallife.locallife.matching.entity.DormitoryJob;
import com.locallife.locallife.matching.entity.Job;
import java.util.List;
import java.util.stream.IntStream;
import lombok.Builder;

@Builder
public record JobResponse(
        Long jobId,
        String category,
        String local,
        String description,
        Long distance,
        Long timeByCar,
        Long timeByTransport
) {
    public static List<JobResponse> of(final List<Job> jobs, final List<DormitoryJob> dormitoryJobs) {
        return IntStream.range(0, jobs.size())
                .mapToObj(i -> JobResponse.builder()
                        .jobId(jobs.get(i).getId())
                        .category(jobs.get(i).getCategory())
                        .local(jobs.get(i).getLocal())
                        .description(jobs.get(i).getDescription())
                        .distance(dormitoryJobs.get(i).getDistance())
                        .timeByCar(dormitoryJobs.get(i).getTimeByCar())
                        .timeByTransport(dormitoryJobs.get(i).getTimeByTransport())
                        .build())
                .toList();
    }
}
