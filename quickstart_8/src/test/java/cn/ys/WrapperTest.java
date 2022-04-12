package cn.ys;

import cn.ys.mapper.UserMapper;
import cn.ys.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WrapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test1(){
        //查询用户名中包含a 年龄20-30之间  邮箱不为null的的用户信息
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        QueryWrapper<User> like = queryWrapper.like("user_name", "a")

                  //不包含20、30
//                .gt("age",20)
//                .lt("age",30)

                //包含20和30
                .between("age",20,30)
                
                .isNotNull("email");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

}
