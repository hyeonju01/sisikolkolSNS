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
        return "젠킨스 CICD 테스트가 성공했다면?..";
    }

}
