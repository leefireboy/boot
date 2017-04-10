-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE IF NOT EXISTS test;
-- 使用数据库
use test;
-- 创建秒杀库存表
CREATE TABLE IF NOT EXISTS user (
  id bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  name varchar(120) NOT NULL COMMENT '用户名称',
  age int NOT NULL COMMENT '用户年龄',
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  enable boolean NOT NULL DEFAULT TRUE COMMENT '是否应用',
  PRIMARY KEY (id),
  KEY idx_create_time (create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 初始化数据
INSERT IGNORE INTO user(id, name, age) VALUES (1, 'admin', 25);