create table user
(
    id              int unsigned auto_increment comment '主键自增'
        primary key,
    nickname        varchar(16)  not null comment '昵称',
    username        varchar(32)  not null comment '账号',
    password        varchar(32)  not null comment '密码',
    email           varchar(32)  not null comment '邮箱',
    create_time     datetime     not null comment '创建时间',
    last_login_time datetime     null comment '最后登陆时间',
    animal_id       int unsigned null comment '外键',
    constraint username
        unique (username),
    constraint user_ibfk_1
        foreign key (animal_id) references animal (id)
)
    comment '用户表';

create index animal_id
    on user (animal_id);


