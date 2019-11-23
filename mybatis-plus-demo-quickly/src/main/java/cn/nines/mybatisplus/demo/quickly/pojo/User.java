package cn.nines.mybatisplus.demo.quickly.pojo;

import lombok.Data;

/**
 * @ClassName: User
 * @Description: User实体类
 * @author: Nines
 * @date: 2019年11月21日 22:12
 */
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;

}
