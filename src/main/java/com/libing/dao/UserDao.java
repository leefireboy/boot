package com.libing.dao;

import com.libing.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by libing on 2017/4/8.
 */
@Mapper
public interface UserDao {

    User selectOneById(Long id);

}
