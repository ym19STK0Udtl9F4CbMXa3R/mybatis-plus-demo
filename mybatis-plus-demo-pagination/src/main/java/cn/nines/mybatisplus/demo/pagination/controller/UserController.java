package cn.nines.mybatisplus.demo.pagination.controller;


import cn.nines.mybatisplus.demo.pagination.entity.User;
import cn.nines.mybatisplus.demo.pagination.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Nines
 * @since 2019-11-23
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.list();
    }

    @GetMapping("/page")
    public List<User> selectByPage(int current, int size){
        Page<User> page = new Page<>(current, size);
        IPage<User> iPage = userService.page(page);
        return iPage.getRecords();
    }

    @GetMapping("/findPage")
    public Map findPage(String name, int current, int size){
        return userService.findPage(name, current, size);
    }

}
