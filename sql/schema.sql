/**
 * 用户信息
 */
drop table if exists `user_info`;
create table `user_info` (
  `id` bigint(20) unsigned not null auto_increment comment '用户ID',
  `real_name` varchar(50) not null comment '用户真实姓名',
  `tel` char(30) not null comment '用户手机号',
  `tel_vice` char(30) comment '用户副手机号',
  `type` tinyint not null default 0 comment '用户身份：0-普通用户；1-VIP用户',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime null on update current_timestamp comment '更新时间',
  primary key(`id`),
  index `index_real_name` (`real_name`),
  index `index_tel` (`tel`)
) engine=innodb default charset=utf8 comment '用户信息';

/*
 * 用户账号
 */
drop table if exists `user_account`;
create table `user_account` (
  `id` bigint not null auto_increment comment 'ID',
  `account` varchar(100) not null comment '账号',
  `password` varchar(30) not null comment '密码',
  `user_id` bigint not null comment '用户ID',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime null on update current_timestamp comment '更新时间',
  primary key(`id`),
  index `index_account` (`account`)
) engine=innodb default charset=utf8 comment '用户账号';

/**
 * 管理员信息
 */
drop table if exists `admin_info`;
create table `admin_info` (
  `id` bigint(20) unsigned not null auto_increment comment '管理员ID',
  `nickname` varchar(50) not null default 'admin_nick' comment '昵称',
  `tel` char(30) null comment '手机号',
  `power` int not null default 0 comment '管理员权限',
  `type` tinyint not null default 0 comment '管理员类型：0-普通管理员；1-超级管理员',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime null on update current_timestamp comment '更新时间',
  primary key(`id`)
) engine=innodb default charset=utf8 comment '管理员信息';

/**
 * 管理员账号
 */
drop table if exists `admin_account`;
create table `admin_account` (
  `id` bigint not null auto_increment comment 'ID',
  `account` varchar(100) not null comment '账号',
  `password` varchar(30) not null comment '密码',
  `admin_id` bigint not null comment '管理员ID',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime null on update current_timestamp comment '更新时间',
  primary key(`id`),
  index `index_account` (`account`)
) engine=innodb default charset=utf8 comment '管理员账号';

/**
 * 订单列表
 */
drop table if exists `order_list`;
create table `order_list` (
  `id` bigint(30) unsigned not null auto_increment comment '订单ID',
  `user_id` bigint not null comment '用户ID',
  `source_addr` varchar(300) not null comment '原地址',
  'dist_addr' varchar(300) not null comment '目的地址',
  'source_username' varchar(50) not null comment '发送人姓名',
  `source_tel` varchar(30) not null comment '发送人手机号',
  'dist_username' varchar(50) not null comment '接收人姓名',
  `dist_tel` varchar(30) not null comment '接收人手机号',
  `item_desc` varchar(200) comment '物品描述',
  `item_weight` int not null comment '物品重量',
  `total_price` int not null default 0 comment '订单总价',
  `remark` varchar(500) comment '备注',
  `create_time` datetime not null default current_timestamp comment '创建时间',
  `update_time` datetime not null default current_timestamp on update current_timestamp comment '更新时间',
  primary key(`id`),
  index `index_user_id` (`user_id`),
  index `index_create_time` (`update_time`)
) engine=innodb default charset=utf8 comment '订单列表';