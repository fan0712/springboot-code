package cn.ys;

import cn.ys.mapper.BooksMapper;
import cn.ys.pojo.Books;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Quickstart7ApplicationTests {

    @Autowired
    private BooksMapper mapper;
    @Test
    void contextLoads() {
        Books book = mapper.selectById(1);
        System.out.println(book);

    }

}
