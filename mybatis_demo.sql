/*
 Navicat Premium Data Transfer

 Source Server         : lvhaifeng-test
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : 192.168.42.128:3306
 Source Schema         : mybatis_demo

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 15/01/2020 10:35:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` char(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhangsan');
INSERT INTO `user` VALUES ('2', 'zhangsan');
INSERT INTO `user` VALUES ('3', 'zhangsan');

SET FOREIGN_KEY_CHECKS = 1;
