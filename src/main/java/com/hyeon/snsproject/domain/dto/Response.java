package com.hyeon.snsproject.domain.dto;

/*
    모든 API의 Response를 공통으로 감싸는 Response DTO
 */

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Response<T> {

    private String resultCode;

    private T result; // result 필드의 타입은 Response 객체 생성 시 자유롭게 정의 가능

    // error 메서드 정의
    public static <T> Response error(T data) {
        return new Response("ERROR", data);
    }

    // success 메서드 정의
    public static <T> Response success(T data) {
        return new Response("SUCCESS", data);
    }
}
