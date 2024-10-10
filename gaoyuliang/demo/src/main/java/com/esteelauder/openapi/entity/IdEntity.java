package com.esteelauder.openapi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class IdEntity {
    @TableId(
            type = IdType.AUTO
    )
    protected Long id;
}
