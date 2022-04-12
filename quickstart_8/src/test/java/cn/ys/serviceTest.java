package cn.ys;

import cn.ys.pojo.User;
import cn.ys.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class serviceTest {
    @Autowired
    private UserService userService;
    @Test
    void testService(){
//        User byId = userService.getById(1L);
//        System.out.println(byId);

        long count = userService.count();
        System.out.println(count);
    }

    @Test
    void testServiceAdd(){
        ArrayList<User> users = new ArrayList<>();
        for (int i =0;i<10;i++){
            User user = new User();
            user.setName("zhangsan"+i);
            user.setAge(20+i);
            user.setEmail("yifan@qq.com"+i);
            users.add(user);
        }
        boolean b = userService.saveBatch(users);
        System.out.println(b);
    }
    @Test
    void testServicedel(){
        List<Long> longs = Arrays.asList(1L, 2L);
        boolean b = userService.removeBatchByIds(longs);
        System.out.println(b);
    }
    @Test
    void testServiceGet(){
        User user = userService.getUser(3L);
        System.out.println(user);
    }


}

