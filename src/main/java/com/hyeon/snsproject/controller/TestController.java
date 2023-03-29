package com.hyeon.snsproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/buildTest")
    public String success() {
        return "2023-03-29 젠킨스 CI/CD 테스트 - 1";
    }

}
