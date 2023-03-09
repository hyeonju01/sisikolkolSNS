package com.hyeon.snsproject.controller;

import com.hyeon.snsproject.domain.dto.Response;
import com.hyeon.snsproject.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 회원가입
//    @PostMapping("/join")
//    public Response<JoinUserResponse> join(@RequestBody JoinUserRequest joinUserRequest) {
//        JoinUserResponse joinUserResponse = userService.join(joinUserRequest);
//        return Response.success(joinUserResponse);
//    }
//
//    // 로그인
//    @PostMapping("/login")
//    public Response<LoginUserResponse> login(@RequestBody LoginUserRequest loginUserRequest) {
//        /*
//        컨트롤러 로그인 로직 작성
//         */
//        return Response.success(LoginUserResponse);
//    }

}
