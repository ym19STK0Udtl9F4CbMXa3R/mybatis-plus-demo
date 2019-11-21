package cn.nines.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: Application
 * @Description: springboot启动类
 * @author: Nines
 * @date: 2019年11月21日 22:07
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cn.nines.mybatisplus.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
