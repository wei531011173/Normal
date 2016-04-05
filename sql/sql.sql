DROP DATABASE IF EXISTS `normal`;
create DATABASE normal;

use normal;

/* ���ż۸��*/
DROP TABLE IF EXISTS `smsInfo`;
CREATE TABLE `smsInfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`posId` int(11) NOT NULL COMMENT '��ʾλ��',
    `smsCount` int(11) NOT NULL COMMENT '��������',
    `detailInfo` varchar(5000)CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '����',
    `money` int(11) NOT NULL COMMENT '���',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

insert into smsInfo values(1,1,100,'aaaaaaa', 100);


/* �û���*/
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`shopId` int(11) NOT NULL unique COMMENT '�̵��ʶ',
    `smsCount` int(11) NOT NULL COMMENT '��������',
    `buyTime` int(11) NOT NULL COMMENT '����ʱ��',
    `dayCount` int(11) NOT NULL COMMENT '��������',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;



/* �û���ֵ��¼��*/
DROP TABLE IF EXISTS `userbuysmsinfo`;
CREATE TABLE `userbuysmsinfo` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`userId` int(11) NOT NULL unique COMMENT '�û�id',
    `smsId` int(11) NOT NULL COMMENT '����id',
    `isSuccess` int(11) NOT NULL COMMENT '�Ƿ�ɹ�',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;
