CREATE TABLE t_user (
                        id VARCHAR(255) NOT NULL,               -- 主键ID，手动输入
                        username VARCHAR(255) NOT NULL,         -- 用户名
                        password VARCHAR(255) NOT NULL,         -- 密码
                        is_admin BOOLEAN,                       -- 是否管理员
                        `order` INT,                            -- 排序字段，注意使用关键字时要加反引号
                        PRIMARY KEY (id)                        -- 定义主键
);
