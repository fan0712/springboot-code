package cn.ys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BooksController {

    @ResponseBody
    @RequestMapping("/books")
    public String helloBooks(){
        return "hello books";
    }
}
