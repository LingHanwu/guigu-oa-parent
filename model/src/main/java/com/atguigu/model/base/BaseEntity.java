package com.atguigu.model.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class BaseEntity implements Serializable {

    @Schema(description = "id")
    @TableId(type = IdType.AUTO)
    private Long id;
    @Schema(description = "创建时间")
    @TableField("create_time")
    private Date createTime;
    @Schema(description = "更新时间")
    @TableField("update_time")
    private Date updateTime;
    @Schema(description = "是否删除")
    @TableLogic
    @TableField("is_deleted")
    private Integer isDeleted;

    @Schema(description = "参数map")
    @TableField(exist = false)
    private Map<String,Object> param = new HashMap<>();
}
