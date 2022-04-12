package cn.ys;

import cn.ys.mapper.BookMapper;
import cn.ys.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Quickstart6ApplicationTests {

    @Autowired
    private BookMapper mapper;


    @Test
    public void contextLoads() {
        Book book = mapper.selectBookById(1);
        System.out.println(book);
//        System.out.println("this is boot and mybatise");
    }

}
