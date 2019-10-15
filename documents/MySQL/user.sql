/*
SQLyog v10.2 
MySQL - 5.7.13 : Database - basicflow
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`basicflow` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `basicflow`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `ID` int(9) NOT NULL AUTO_INCREMENT COMMENT 'ID主键',
  `UserName` varchar(64) NOT NULL COMMENT '登录名',
  `Password` varchar(64) NOT NULL COMMENT '密码',
  `RealName` varchar(64) NOT NULL COMMENT '真实姓名',
  `UseType` int(1) DEFAULT NULL COMMENT '用户类别',
  `DocTitleID` int(9) DEFAULT NULL COMMENT '医生职称ID',
  `IsScheduling` char(1) DEFAULT NULL COMMENT '是否参与排班',
  `DeptID` int(9) NOT NULL COMMENT '所在科室ID',
  `RegistLeID` int(9) DEFAULT NULL COMMENT '挂号级别ID',
  `DelMark` int(1) NOT NULL DEFAULT '1' COMMENT '删除标记',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`ID`,`UserName`,`Password`,`RealName`,`UseType`,`DocTitleID`,`IsScheduling`,`DeptID`,`RegistLeID`,`DelMark`) values (1,'bianque','bianque123','扁鹊',3,81,'是',1,1,1),(2,'fwb','fwb123','范无病',3,83,'是',1,2,1),(3,'hqb','hqb123','霍去病',3,83,'是',1,2,1),(4,'huatuo','huatuo123','华佗',4,81,'是',2,1,1),(5,'xll','xll123','喜来乐',5,83,'是',2,2,1),(6,'adq','adq123','安道全',3,83,'是',2,2,1),(8,'dd','iop888','单独',1,84,'否',9,2,1),(9,'root','root','ROOT',0,81,'否',1,1,1),(10,'ghy','ghy123','挂号收费员',2,81,'否',1,1,1),(11,'admin','admin123','医院管理员',1,81,'否',1,1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
