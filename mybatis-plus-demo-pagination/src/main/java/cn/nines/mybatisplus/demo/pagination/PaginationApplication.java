package cn.nines.mybatisplus.demo.pagination;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: PaginationApplication
 * @Description: 启动类
 * @author: Nines
 * @date: 2019年11月24日 20:14
 */
@SpringBootApplication
@MapperScan("cn.nines.mybatisplus.demo.pagination.mapper")
public class PaginationApplication {

    public static void main(String[] args){
        SpringApplication.run(PaginationApplication.class, args);
    }

}
