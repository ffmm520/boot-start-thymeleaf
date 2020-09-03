# 建表sql
CREATE TABLE `goods` (
                         `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一编号',
                         `name` varchar(255) DEFAULT '' COMMENT '商品名称',
                         `price` decimal(10,2) DEFAULT '0.00' COMMENT '商品价格',
                         `pic` varchar(255) DEFAULT '' COMMENT '图片文件名',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
