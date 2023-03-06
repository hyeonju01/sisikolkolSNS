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
        return "빌드 성공이랍니다..";
    }

}
