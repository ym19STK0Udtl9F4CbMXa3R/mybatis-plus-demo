import cn.nines.mybatisplus.Application;
import cn.nines.mybatisplus.dao.UserMapper;
import cn.nines.mybatisplus.pojo.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName: QuickTest
 * @Description: 快速测试
 * @author: Nines
 * @date: 2019年11月21日 22:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class QuickTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals();及其重载方法:
// 1. 如果两者一致, 程序继续往下运行. 2. 如果两者不一致, 中断测试方法, 抛出异常信息 AssertionFailedError .
        Assert.assertEquals(7, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectOne(){
        System.out.println("----- selectOne method test ------");
        Wrapper<User> queryWrapper = Wrappers.query();
        ((QueryWrapper<User>) queryWrapper).likeRight("email", "test");
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectById(){
        System.out.println("----- selectById method test ------");
        User user = userMapper.selectById(6);
        System.out.println(user);
    }

    @Test
    public void testAddUser(){
        System.out.println("----- addUser method test ------");
        User user = new User();
        user.setName("张三");
        user.setAge(33);
        user.setEmail("zs@qq.com");
        int result = userMapper.insert(user);
        System.out.println(result);
    }

    @Test
    public void testUpdateUserById(){
        System.out.println("----- updateUserById method test ------");
        User user = new User();
        user.setId(1197530616956760066L);
        user.setName("张三");
        user.setAge(33);
        user.setEmail("zs@163.com");
        int result = userMapper.updateById(user);
        System.out.println(result);
    }

    @Test
    public void testDeleteUserById(){
        System.out.println("----- deleteUserById method test ------");
        int result = userMapper.deleteById(1197530616956760066L);
        System.out.println(result);
    }

}
