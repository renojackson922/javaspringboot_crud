package com.springboottraining.springboottraining.restapi.user.controller;

import com.springboottraining.springboottraining.restapi.user.domain.User;
import com.springboottraining.springboottraining.restapi.user.domain.UserSearch;
import com.springboottraining.springboottraining.restapi.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

/**
 * 사용자 관리
 *
 * @author lattepapa
 * @date 2021-02-24
 * */
@RequestMapping("/api/v1/user")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * 검색 조건에 해당하는 사용자 목록을 반환합니다.
     *
     * @param userSearch
     * @return
     * */
    @GetMapping
    public List<User> selectUserList(UserSearch userSearch) {return this.userService.selectUserList(userSearch);}

    /**
     * 사용자를 등록합니다.
     *
     * @param user
     * @return
     * */
    @PostMapping
    public ResponseEntity<User> insertUser(@RequestBody User user) {
        user.setUid(StringUtils.replace(UUID.randomUUID().toString(), "-", ""));

        int result = this.userService.insertUser(user);

        if (result > 0) {
            return ResponseEntity.created(linkTo(UserController.class).slash(user.getUid()).toUri()).build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    /**
     * 사용자를 수정합니다.
     *
     * @param uid
     * @param user
     * @return
     * */
    @PutMapping("{uid}")
    public ResponseEntity<User> updateUser(@PathVariable String uid, @RequestBody User user) {
        user.setUid(uid);
        int result = this.userService.updateUser(user);

        if (result > 0) {
            return ResponseEntity.created(linkTo(UserController.class).slash(uid).toUri()).build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * 사용자를 삭제합니다.
     *
     * @param uid
     * @return
     * */
    @DeleteMapping("{uid}")
    public ResponseEntity<String> deleteUser(@PathVariable String uid) {
        User user = new User();
        user.setUid(uid);
        int result = this.userService.deleteUser(user);

        if (result > 0) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * 선택된 다중 사용자를 삭제합니다.
     *
     * @param userList
     * @return
     * */
    @DeleteMapping
    public ResponseEntity<String> deleteUserList(@RequestBody List<User> userList) {
        int result = this.userService.deleteUserList(userList);

        if (result > 0) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
