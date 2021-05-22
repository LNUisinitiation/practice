/*
MySQL Data Transfer
Source Host: localhost
Source Database: hr
Target Host: localhost
Target Database: hr
Date: 2021/5/22 15:56:23
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empId` int(11) NOT NULL auto_increment,
  `empName` varchar(50) NOT NULL,
  `salary` float NOT NULL,
  `deptId` int(11) NOT NULL,
  `inDate` datetime NOT NULL,
  PRIMARY KEY  (`empId`),
  KEY `fk_emp_dept` (`deptId`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `emp` VALUES ('1', '李四', '7000', '1', '2021-01-01 10:00:04');
INSERT INTO `emp` VALUES ('2', '张三', '3000', '1', '2021-05-20 10:01:15');
