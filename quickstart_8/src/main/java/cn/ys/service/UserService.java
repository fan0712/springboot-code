package cn.ys.service;

import cn.ys.mapper.UserMapper;
import cn.ys.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<User> {

    User getUser(Long id);
}
