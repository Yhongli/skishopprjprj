# SQL Manager 2007 Lite for MySQL 4.4.2.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : skishop_db


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `skishop_db`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `skishop_db`;

#
# Structure for the `admin` table : 
#

CREATE TABLE `admin` (
  `adminid` int(11) NOT NULL AUTO_INCREMENT,
  `name` int(11) DEFAULT NULL,
  PRIMARY KEY (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for the `orders` table : 
#

CREATE TABLE `orders` (
  `productid` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `productname` varchar(20) DEFAULT NULL,
  `discountprice` double(15,3) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `admitsign` int(11) DEFAULT NULL,
  `deletesign` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

#
# Structure for the `product` table : 
#

CREATE TABLE `product` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(20) DEFAULT NULL,
  `price` double(15,3) DEFAULT NULL,
  `discountprice` double(15,3) DEFAULT NULL,
  `img1` varchar(90) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='产品';

#
# Structure for the `productcolor` table : 
#

CREATE TABLE `productcolor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `color` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Structure for the `productsize` table : 
#

CREATE TABLE `productsize` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `productid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品尺寸';

#
# Structure for the `producttype` table : 
#

CREATE TABLE `producttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `高山` (`id`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='hhh';

#
# Structure for the `skiproduct` table : 
#

CREATE TABLE `skiproduct` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `description` varchar(20) DEFAULT NULL,
  `price` double(15,3) DEFAULT NULL,
  `discountprice` double(15,3) DEFAULT NULL,
  `listimg` varchar(20) DEFAULT NULL,
  `img1` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='产品';

#
# Structure for the `user` table : 
#

CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `email` varchar(20) NOT NULL,
  `address` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `userid` (`userid`),
  UNIQUE KEY `userid_2` (`userid`),
  UNIQUE KEY `userid_3` (`userid`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Data for the `orders` table  (LIMIT 0,500)
#

INSERT INTO `orders` (`productid`, `count`, `id`, `userid`, `username`, `productname`, `discountprice`, `address`, `admitsign`, `deletesign`) VALUES 
  (1,1,2,0,NULL,NULL,NULL,'',NULL,NULL),
  (1,1,3,0,NULL,NULL,NULL,'',NULL,NULL),
  (1,1,4,0,NULL,NULL,NULL,'',NULL,NULL),
  (1,1,5,0,NULL,NULL,NULL,'',NULL,NULL),
  (7,1,7,0,NULL,NULL,NULL,'',NULL,NULL),
  (7,3,8,0,NULL,NULL,0.000,NULL,0,0);
COMMIT;

#
# Data for the `product` table  (LIMIT 0,500)
#

INSERT INTO `product` (`id`, `name`, `description`, `price`, `discountprice`, `img1`, `count`) VALUES 
  (7,'12654984','2212',1565449.000,164984.000,'',NULL);
COMMIT;

#
# Data for the `producttype` table  (LIMIT 0,500)
#

INSERT INTO `producttype` (`id`, `name`) VALUES 
  (1,'高山滑雪'),
  (2,'雪橇犬拉雪橇');
COMMIT;

#
# Data for the `skiproduct` table  (LIMIT 0,500)
#

INSERT INTO `skiproduct` (`id`, `name`, `description`, `price`, `discountprice`, `listimg`, `img1`) VALUES 
  (1,'雪橇','美观',80.000,66.000,'0',NULL),
  (2,'滑雪板','时尚大气',100.000,88.000,'0',NULL),
  (3,'雪橇帽','哈哈',60.000,36.000,'0',NULL),
  (4,'雪人挂饰','好看',30.000,11.000,'0',NULL);
COMMIT;

#
# Data for the `user` table  (LIMIT 0,500)
#

INSERT INTO `user` (`userid`, `name`, `password`, `email`, `address`) VALUES 
  (1,'张三','123456','1209754720@qq.com',NULL),
  (2,'李四','abcdef','2727848647@qq.com',NULL),
  (3,'王五','789123','123456789@qq.com',NULL),
  (4,'杨','123123','123',NULL),
  (7,'123','456','456','456');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;