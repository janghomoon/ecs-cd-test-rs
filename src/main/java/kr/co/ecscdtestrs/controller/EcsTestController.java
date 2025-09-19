package kr.co.ecscdtestrs.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EcsTestController {

    @GetMapping("/deploy")
    public ResponseEntity<String> deploy() {
        return ResponseEntity.ok("Deployment started");
    }

    @GetMapping("/health")
    public String ping() {
        return "ok";
        // ping check
    }
}
