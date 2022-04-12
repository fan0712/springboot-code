package cn.ys.service.impl;


import cn.ys.mapper.UserMapper;
import cn.ys.pojo.User;
import cn.ys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUserById(3L);
    }
}
