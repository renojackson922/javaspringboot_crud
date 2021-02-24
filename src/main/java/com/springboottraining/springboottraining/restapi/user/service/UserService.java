package com.springboottraining.springboottraining.restapi.user.service;

import com.springboottraining.springboottraining.restapi.user.domain.User;
import com.springboottraining.springboottraining.restapi.user.domain.UserSearch;

import java.util.List;

/**
 * 사용자 관리
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
public interface UserService {
    /**
     * 검색 조건에 해당하는 사용자 목록을 반환합니다.
     *
     * @param userSearch
     * @return
     * */
    List<User> selectUserList(UserSearch userSearch);

    /**
     * 사용자 정보를 반환합니다.
     *
     * @param userSpv
     * @return
     * */
    User selectUser(User userSpv);

    /**
     * 사용자를 등록합니다.
     *
     * @param userSpv
     * @return
     * */
    int insertUser(User userSpv);

    /**
     * 사용자를 수정합니다.
     *
     * @param userSpv
     * @return
     * */
    int updateUser(User userSpv);

    /**
     * 사용자를 삭제합니다.
     *
     * @param userSpv
     * @return
     * */
    int deleteUser(User userSpv);

    /**
     * 선택된 다중 사용자를 삭제합니다.
     *
     * @param userSpvList
     * @return
     * */
    int deleteUserList(List<User> userSpvList);
}
