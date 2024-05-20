package com.cc.service;

import com.cc.dao.UserDao;
import com.cc.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/29
 * Time: 11:39
 * Description:
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User findById(Integer id){
        return userDao.queryById(id);
    }

}
