package com.atguigu.auth.mapper;

import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * projectName:  guigu-oa-parent
 *
 * @author 杨宇超
 * time 2023-03-02 16:40 周四
 * description:
 */
@SpringBootTest
public class SysRoleMapperTest {

    @Resource
    SysRoleMapper sysRoleMapper;

    @Test
    public void testSelectList() {
        System.out.println(("----- selectAll method test ------"));
//        UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
//        所以不填写就是无任何条件
        List<SysRole> users = sysRoleMapper.selectList(null);
        users.forEach(System.out::println);
    }


    @Test
    void test01() {
        //设置分页参数
        Page<SysRole> page = new Page<>(1, 5);
        sysRoleMapper.selectPage(page, null);
//获取分页数据
        List<SysRole> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());

    }

}
