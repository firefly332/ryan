package com.esteelauder.openapi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
@Data
public class BasicEntity extends IdEntity{
    @TableField(
            fill = FieldFill.INSERT
    )
    protected String createdBy;
    @TableField(
            fill = FieldFill.INSERT
    )
    protected Date createdTime;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    protected String updatedBy;
    @TableField(
            fill = FieldFill.INSERT_UPDATE
    )
    protected Date updatedTime;
}
