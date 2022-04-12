package cn.ys.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;

@Component
@ConfigurationProperties(value = "person")
@Validated
public class person {
    private Integer id;
    private String name;
    private String [] likes;

    @Email
    private String email;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", likes=" + Arrays.toString(likes) +
                ", email='" + email + '\'' +
                '}';
    }
}
