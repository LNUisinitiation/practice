/*
MySQL Data Transfer
Source Host: localhost
Source Database: hr
Target Host: localhost
Target Database: hr
Date: 2021/5/22 15:56:15
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptId` int(11) NOT NULL auto_increment,
  `deptName` varchar(50) NOT NULL,
  PRIMARY KEY  (`deptId`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '技术部');
INSERT INTO `dept` VALUES ('2', '市场部');
INSERT INTO `dept` VALUES ('3', '后勤部');
INSERT INTO `dept` VALUES ('4', '随便什么部');
INSERT INTO `dept` VALUES ('5', 'aaaa');
