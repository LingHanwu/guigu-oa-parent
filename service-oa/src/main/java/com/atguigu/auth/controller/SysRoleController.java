package com.atguigu.auth.controller;

import com.atguigu.auth.service.SysRoleService;
import com.atguigu.exception.GuiguException;
import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gtguigu.common.result.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
@Tag(name = "角色管理")
public class SysRoleController {
    private final SysRoleService sysRoleService;
    @Operation(summary = "获取全部角色列表")
    @GetMapping("findAll")
    public Result<List<SysRole>> findAll() {
        try {
            int a = 10/0;
        }catch(Exception e) {
            throw new GuiguException(20001,"出现自定义异常");
        }
        List<SysRole> roleList = sysRoleService.list();
        return Result.ok(roleList);
    }

    /**
     * 条件分页查询
     * @param page 当前页
     * @param limit 每页显示记录数
     * @param sysRoleQueryVo 条件对象
     */
    @GetMapping("{page}/{limit}")
    @Operation(summary = "条件分页查询")
    public Result pageQueryRole(@PathVariable Long page,
                                @PathVariable Long limit,
                                String roleName){

        //调用service的方法实现
        //1 创建Page对象，传递分页相关参数
        //page 当前页  limit 每页显示记录数
        Page<SysRole> pageParam = new Page<>(page,limit);

        //2 封装条件，判断条件是否为空，不为空进行封装
        LambdaQueryWrapper<SysRole> wrapper = new LambdaQueryWrapper<>();
        if(StringUtils.hasText(roleName)) {
            //封装 like模糊查询
            wrapper.like(SysRole::getRoleName,roleName);
        }
        //3 调用方法实现
        IPage<SysRole> pageModel = sysRoleService.page(pageParam, wrapper);
        return Result.ok(pageModel);

    }


    @Operation(summary = "获取")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        SysRole role = sysRoleService.getById(id);
        return Result.ok(role);
    }

    @Operation(summary = "新增角色")
    @PostMapping("save")
    public Result save(@RequestBody @Validated SysRole role) {
        sysRoleService.save(role);
        return Result.ok();
    }

    @Operation(summary = "修改角色")
    @PutMapping("update")
    public Result updateById(@RequestBody SysRole role) {
        sysRoleService.updateById(role);
        return Result.ok();
    }

    @Operation(summary = "删除角色")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable Long id) {
        sysRoleService.removeById(id);
        return Result.ok();
    }

    @Operation(summary = "根据id列表删除")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        sysRoleService.removeByIds(idList);
        return Result.ok();
    }
    




}
