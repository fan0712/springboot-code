package cn.ys.controller;

import cn.ys.pojo.person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;

@RestController
@Validated
public class TestController {

    /**
     *  @Value 单个值注入 有局限性 不需要set方法就可以注入 不能注入复杂数据 不支持数据校验
     *  @ConfigurationProperties(value = "person")  批量注入  需要set方法  可以注入复杂数据 支持数据校验
     */


//    @Value("${person.id}")
//    private  Integer id;
//    @Value("${person.name}")
//    private String name;
//    @Value("${city}")
//    private String city;
//    @Value("${person.likes[0]}")
//    private String likes;

//    @Autowired
//    private person person;

    @Email
    @Value("${person.email}")
    private String email;

    //spel  spring的el表达式
    @Value("#{5*20}")
    private Integer num;

    @Value("${center.dataDir}")
    private String basedir;

    @Value("${lesson}")
    private String lesson;

    @RequestMapping("/test")
    public String testYaml(){
//        System.out.println("person id==="+id);
//        System.out.println("person name==="+name);
//        System.out.println("person city==="+city);
//        System.out.println("likes==="+likes);
//        for (int i=0;i<likes.length;i++){
//            System.out.println(likes[i]);
//        }


        System.out.println(lesson);
        System.out.println(basedir);
        System.out.println(email);
        System.out.println(num);
//        System.out.println(person);
        return "hello yaml";
    }
}
