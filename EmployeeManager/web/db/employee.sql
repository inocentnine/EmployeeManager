/**
*技术等级用1、2、3、4、5表示，数字越大等级越高
*此处用户名和密码不是管理员权限级的，员工可以登录进入个人信息平台，在此项目中未实现
*/
CREATE TABLE `employee` (
  `eid` int NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) NOT NULL,
  `birth` date NOT NULL,
  `address` varchar(100) NOT NULL,
  `participation_date` date NOT NULL,
  `tele` varchar(11) NOT NULL,
  `technical_level` int(1) NOT NULL,
  `monthly_salary` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `employee` VALUES ('201901', '亦舒', '1980-01-11', '江西省南昌市南昌大学', '1998-09-10', '08012345', '5', '24000', '亦一', '123456');
INSERT INTO `employee` VALUES ('201902', '周思函', '1990-04-28', '湖南省临湘市路中', '2000-01-01', '08012346', '4', '20000', '周周', '123456');
INSERT INTO `employee` VALUES ('201903', '宋子休', '1989-08-28', '浙江省嘉兴市南湖区', '1999-10-01', '08012347', '3', '15000', '宋宋', '123456');
INSERT INTO `employee` VALUES ('201904', '苏又清', '1989-12-12', '福建省厦门市厦门大学', '2001-12-24', '08012348', '2', '10000', '又又', '123456');
INSERT INTO `employee` VALUES ('201905', '吴民', '1998-03-23', '湖北省武汉市地质大学', '2019-01-01', '08012349', '1', '5000', '民国', '123456');
INSERT INTO `employee` VALUES ('201906', '黄伟', '1987-03-23', '湖北省武汉市地质大学', '2005-09-01', '08012310', '4', '12000', '黄y', '123456');

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `user` VALUES ('101', '蛋黄', '123456');
INSERT INTO `user` VALUES ('102', '张张', '123456');