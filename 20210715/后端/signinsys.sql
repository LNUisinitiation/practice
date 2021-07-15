/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50734
Source Host           : localhost:3306
Source Database       : signinsys

Target Server Type    : MYSQL
Target Server Version : 50734
File Encoding         : 65001

Date: 2021-07-07 18:17:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for qd
-- ----------------------------
DROP TABLE IF EXISTS `qd`;
CREATE TABLE `qd` (
  `stuId` int(11) NOT NULL AUTO_INCREMENT,
  `stuName` varchar(255) DEFAULT NULL,
  `stuSex` varchar(255) DEFAULT NULL,
  `stuFaculty` varchar(255) DEFAULT NULL,
  `stuClass` varchar(255) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stuId`),
  KEY `fk_courseId` (`courseId`),
  CONSTRAINT `fk_courseId` FOREIGN KEY (`courseId`) REFERENCES `shc` (`courseId`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shc
-- ----------------------------
DROP TABLE IF EXISTS `shc`;
CREATE TABLE `shc` (
  `courseId` int(11) NOT NULL,
  `courseName` varchar(255) DEFAULT NULL,
  `courseTeacher` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
