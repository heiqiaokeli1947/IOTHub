package com.pengping.iothub.mapper;

import com.pengping.iothub.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    /**
     * 登录（直接使用注解指定传入参数名称）
     * @param userName
     * @param password
     * @return
     */
    public User login(@Param("userName") String userName, @Param("password") String password);

    /**
     * 根据Id查询用户信息
     * @param id
     * @return
     */
    public User queryUserByUserId(Long id);

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> queryUserAll();

    /**
     * 新增用户信息
     * @param user
     */
    public void insertUser(User user);


    /**
     * 根据id删除用户信息
     * @param id
     */
    public void deleteUserByUserId(Long id);
}
