package com.atguigu.auth.mapper;

import com.atguigu.model.system.SysRole;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
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

}
