package com.atguigu.auth.controller;

import com.atguigu.auth.service.SysRoleService;
import com.atguigu.model.system.SysRole;
import common.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * projectName:  guigu-oa-parent
 *
 * @author 杨宇超
 * time 2023-03-02 16:58 周四
 * description:
 */
@RestController
@RequestMapping("/admin/system/sysRole")
@RequiredArgsConstructor
public class SysRoleController {
    private final SysRoleService sysRoleService;

    @GetMapping("findAll")
    public Result<List<SysRole>> findAll() {
        List<SysRole> roleList = sysRoleService.list();
        return Result.ok(roleList);
    }
}
