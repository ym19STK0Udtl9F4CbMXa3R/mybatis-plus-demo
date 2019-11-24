import cn.nines.mybatisplus.demo.pagination.PaginationApplication;
import cn.nines.mybatisplus.demo.pagination.entity.User;
import cn.nines.mybatisplus.demo.pagination.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: PaginationTest
 * @Description: 测试类
 * @author: Nines
 * @date: 2019年11月24日 20:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PaginationApplication.class)
public class PaginationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectByPage(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("email", "com");

        // new Page<>(当前页，每页多少条)
        Page<User> page = new Page<>(3, 3);

        IPage<Map<String, Object>> mapIPage = userMapper.selectMapsPage(page, wrapper);

        System.out.println("总页数：" + mapIPage.getPages());
        System.out.println("总记录数：" + mapIPage.getTotal());

        List<Map<String, Object>> records = mapIPage.getRecords();
        records.forEach(System.out::println);
    }

}
