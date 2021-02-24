package com.springboottraining.springboottraining.restapi.user.service.impl;

import com.springboottraining.springboottraining.restapi.user.domain.User;
import com.springboottraining.springboottraining.restapi.user.domain.UserSearch;
import com.springboottraining.springboottraining.restapi.user.mapper.UserMapper;
import com.springboottraining.springboottraining.restapi.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 사용자 관리
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public List<User> selectUserList(UserSearch userSearch) {return this.userMapper.selectUserList(userSearch);}

    @Override
    public User selectUser(User user) {return this.userMapper.selectUser(user);}

    @Override
    public int insertUser(User user) {return this.userMapper.insertUser(user);}

    @Override
    public int updateUser(User user) {return this.userMapper.updateUser(user);}

    @Override
    public int deleteUser(User user) {return this.userMapper.deleteUser(user);}

    @Override
    public int deleteUserList(List<User> userList) {return this.userMapper.deleteUserList(userList);}
}
