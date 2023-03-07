package com.atguigu.model.process;

import com.atguigu.model.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;

@Data
@TableName("oa_process_template")
@Schema(description = "oa_process_template")

public class ProcessTemplate extends BaseEntity {
    @Serial

    private static final long serialVersionUID = 1L;

    @Schema(description = "模板名称")
    @TableField("name")
    private String name;

    @Schema(description = "图标路径")
    @TableField("icon_url")
    private String iconUrl;

    @Schema(description = "processTypeId")
    @TableField("process_type_id")
    private Long processTypeId;

    @Schema(description = "表单属性")
    @TableField("form_props")
    private String formProps;

    @Schema(description = "表单选项")
    @TableField("form_options")
    private String formOptions;

    @Schema(description = "描述")
    @TableField("description")
    private String description;

    @Schema(description = "流程定义key")
    @TableField("process_definition_key")
    private String processDefinitionKey;

    @Schema(description = "流程定义上传路process_model_id")
    @TableField("process_definition_path")
    private String processDefinitionPath;

    @Schema(description = "流程定义模型id")
    @TableField("process_model_id")
    private String processModelId;

    @Schema(description = "状态")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String processTypeName;
}