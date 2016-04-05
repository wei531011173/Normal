DROP DATABASE IF EXISTS `normal`;
create DATABASE normal;

use normal;

/* 短信价格表*/
DROP TABLE IF EXISTS `smsInfo`;
CREATE TABLE `smsInfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`posId` int(11) NOT NULL COMMENT '显示位置',
    `smsCount` int(11) NOT NULL COMMENT '短信条数',
    `detailInfo` varchar(5000)CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '描述',
    `money` int(11) NOT NULL COMMENT '金额',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

insert into smsInfo values(1,1,100,'aaaaaaa', 100);


/* 用户表*/
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`shopId` int(11) NOT NULL unique COMMENT '商店标识',
    `smsCount` int(11) NOT NULL COMMENT '短信条数',
    `buyTime` int(11) NOT NULL COMMENT '购买时间',
    `dayCount` int(11) NOT NULL COMMENT '订购天数',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;



/* 用户充值记录表*/
DROP TABLE IF EXISTS `userbuysmsinfo`;
CREATE TABLE `userbuysmsinfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`userId` int(11) NOT NULL unique COMMENT '用户id',
    `smsId` int(11) NOT NULL COMMENT '短信id',
    `isSuccess` int(11) NOT NULL COMMENT '是否成功',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;
