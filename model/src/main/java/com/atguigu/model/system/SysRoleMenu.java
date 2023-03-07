package com.atguigu.model.system;

import com.atguigu.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;

@Data
@TableName("sys_role_menu")
@Schema(name = "sys_role_menu", description = "角色菜单")
public class SysRoleMenu extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "角色Id")
    @TableField("role_id")
    private Long roleId;
    @Schema(description = "菜单Id")
    @TableField("menu_id")
    private Long menuId;

}

