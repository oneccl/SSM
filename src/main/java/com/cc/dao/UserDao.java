package com.cc.dao;

import com.cc.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2022/11/29
 * Time: 11:26
 * Description:
 */
@Repository
public interface UserDao {

    User queryById(Integer id);

}
