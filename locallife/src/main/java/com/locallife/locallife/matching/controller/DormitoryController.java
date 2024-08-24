package com.locallife.locallife.matching.controller;

import com.locallife.locallife.matching.application.DormitoryService;
import com.locallife.locallife.matching.entity.Dormitory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/matching")
public class DormitoryController {
    private final DormitoryService dormitoryService;

    @GetMapping("/dormitories")
    public ResponseEntity<List<Dormitory>> getDormitoryAll() {
        return ResponseEntity.ok(dormitoryService.getDormitoryAll());
    }

}
