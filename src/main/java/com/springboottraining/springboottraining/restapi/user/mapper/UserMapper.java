package com.springboottraining.springboottraining.restapi.user.mapper;

import com.springboottraining.springboottraining.restapi.user.domain.User;
import com.springboottraining.springboottraining.restapi.user.domain.UserSearch;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 사용자 관리 MyBatis
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
@Mapper
public interface UserMapper {
    /**
     * 검색 조건에 해당하는 사용자 목록을 반환합니다.
     *
     * @param userSearch
     * @return
     */
    List<User> selectUserList(UserSearch userSearch);

    /**
     * 사용자 정보를 반환합니다.
     *
     * @param user
     * @return
     */
    User selectUser(User user);

    /**
     * 사용자를 등록합니다.
     *
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 사용자를 수정합니다.
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 사용자를 삭제합니다.
     *
     * @param user
     * @return
     */
    int deleteUser(User user);

    /**
     * 선택된 다중 사용자를 삭제합니다.
     *
     * @param user
     * @return
     * */
    int deleteUserList(List<User> user);
}
