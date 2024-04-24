create table animal
(
    id          int unsigned auto_increment comment '主键自增'
        primary key,
    image       varchar(256) null comment '图片',
    class_name  varchar(32)  null comment '品种',
    sex         int          not null comment '性别',
    adopt       int          not null comment '是否被领养',
    adopt_time  datetime     null comment '领养时间',
    create_time datetime     not null comment '救助时间',
    update_time datetime     not null comment '最后更新时间',
    check (`sex` in (0, 1, 2)),
    check (`adopt` in (0, 1))
)
    comment '动物表';


