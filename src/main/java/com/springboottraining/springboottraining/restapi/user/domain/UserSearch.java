package com.springboottraining.springboottraining.restapi.user.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 사용자 검색
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
@Getter
@Setter
public class UserSearch {
    // 검색 키워드
    private String keyword;
}
