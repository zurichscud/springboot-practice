package org.lai.springboot.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("t_user")
public class User {
    @TableId
    private String id;

    @TableField("username")
    private String name;

    private String password;

    @TableField("is_admin")
    private Boolean isAdmin;

    @TableField("`order`")
    private Integer order;

    @TableField(exist = false)
    private String msg;
}
