package com.atguigu.model.process;

import com.atguigu.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;

@Data
@TableName("oa_process_record")
@Schema(description = "oa_process_record")
public class ProcessRecord extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableField("process_id")
    @Schema(description = "审批流程id")
    private Long processId;
    @Schema(description = "审批描述")
    @TableField("description")
    private String description;
    @Schema(description = "状态")
    @TableField("status")
    private Integer status;
    @Schema(description = "操作用户id")
    @TableField("operate_user_id")
    private Long operateUserId;
    @Schema(description = "操作用户")
    @TableField("operate_user")
    private String operateUser;

}