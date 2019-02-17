package com.wlqq.winter.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_entity")
public class UserEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("user_name")
    private String username;

    @TableField("password")
    private String password;
}
