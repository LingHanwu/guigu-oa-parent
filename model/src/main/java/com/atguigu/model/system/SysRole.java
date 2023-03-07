package com.atguigu.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.atguigu.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;


@Data
@TableName("sys_role")
@Schema(name = "sys_role", description = "角色")
public class SysRole extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "角色名称")

    //@NotBlank(message = "角色名称不能为空")
    @TableField("role_name")
    private String roleName;
    @Schema(description = "角色编码")

    @TableField("role_code")
    private String roleCode;
    @Schema(description = "描述")

    @TableField("description")
    private String description;

}

