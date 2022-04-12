package cn.ys;

import cn.ys.mapper.UserMapper;
import cn.ys.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Quickstart8ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {

    }

    @Test
    void testMapperInsert(){
        User user = new User();
        user.setName("zhangsan");
        user.setAge(19);
        user.setEmail("zhangsan@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    void testMapperdel(){
        int insert = userMapper.deleteById(1);
        System.out.println(insert);
    }

    @Test
    void testMapperupfata(){
        User user = new User();
        user.setAge(19);
//        user.setId(4L);
//        int insert = userMapper.update(user,null);
//        System.out.println(insert);
        int insert = userMapper.updateById(user);
        System.out.println(insert);
    }


    @Test
    void testMapperselect(){
        List<User> users = userMapper.selectList(null);
       users.forEach(System.out::println);
    }
    @Test
    void testXueHua(){
        User user = new User();
        user.setName("wangwu");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    void testXueHuadel(){
        int i = userMapper.deleteById(5L);
        System.out.println(1);
    }
}
