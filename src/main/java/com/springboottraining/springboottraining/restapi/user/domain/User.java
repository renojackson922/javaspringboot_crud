package com.springboottraining.springboottraining.restapi.user.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 사용자 정보
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
@Getter
@Setter
public class User {
    // 사용자 아이디
    private String uid;

    // 로그인 아이디
    private String loginId;

    // 이름
    private String nm;

    // 생년월일
    private LocalDate birth;

    // 이메일
    private String email;

    // 휴대번호
    private String moblphon;

    // 로그인 수
    private Integer loginCnt;

    // 등록일시
    private LocalDateTime registDttm;
}
