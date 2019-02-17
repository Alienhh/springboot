package com.wlqq.winter.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wlqq.winter.common.Result;
import com.wlqq.winter.dao.UserEntityDao;
import com.wlqq.winter.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEntityController {

    @Autowired
    private UserEntityDao userEntityDao;

    @RequestMapping("/user-entity/list")
    public Result list() {
        return Result.builder().status("OK").data(userEntityDao.selectList(new EntityWrapper<>())).build();
    }

    @RequestMapping("/user-entity/get")
    public Result get(Long id) {
        return Result.builder().status("OK").data(userEntityDao.selectById(id)).build();
    }

    @RequestMapping("/user-entity/del")
    public Result del(Long id) {
        return Result.builder().status("OK").data(userEntityDao.deleteById(id)).build();
    }

    @RequestMapping("/user-entity/insert")
    public Result insert(String userName, String password) {
        return Result.builder().status("OK").data(userEntityDao.insert(UserEntity.builder()
                .username(userName)
                .password(password)
                .build())).build();
    }

}
