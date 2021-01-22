/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 22/01/2021 19:30:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `create_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (2, '111', 22, 'Female', '345', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (3, '222', 20, 'Male', '大连市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (5, '333', 20, 'Male', '北京市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (6, '444', 22, 'Male', '沈阳市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (7, '12123', 20, 'Female', '沈阳市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (8, '32421412', 22, 'Female', '沈阳市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (9, '张三', 20, 'Female', '上海', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (10, '李四', 22, 'Female', '北京市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (12, '王五', 22, 'Female', '北京市', '13000000000', '2021-01-22');
INSERT INTO `employee` VALUES (13, '吞吞吐吐', 11, 'Male', '111', '111', '2021-01-22');

SET FOREIGN_KEY_CHECKS = 1;
