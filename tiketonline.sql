/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.1.31-MariaDB : Database - tiketonline
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tiketonline` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tiketonline`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id_customer` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `nama` varchar(55) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `alamat` text NOT NULL,
  PRIMARY KEY (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`id_customer`,`username`,`password`,`nama`,`jenis_kelamin`,`alamat`) values 
('C0001','difaagung','difa240111','Difa Agung','Laki-laki','Kiringan Tulung Klaten Jawa Tengah'),
('C0002','andhikapratt','andhika123','Andhika Pratama','Laki-laki','Trini Sleman Yogyakarta'),
('C0003','tobing','tobing123','Andhi Ratobing','Laki-laki','Ngawi Jawa Timur');

/*Table structure for table `detail_transaksi` */

DROP TABLE IF EXISTS `detail_transaksi`;

CREATE TABLE `detail_transaksi` (
  `id_detail_transaksi` int(10) NOT NULL AUTO_INCREMENT,
  `id_transaksi` varchar(10) NOT NULL,
  `id_transportasi` varchar(10) NOT NULL,
  `nama_pemesan` varchar(55) NOT NULL,
  `tujuan` varchar(25) NOT NULL,
  `jumlah_tiket` int(5) NOT NULL,
  `harga_tiket` int(6) NOT NULL,
  `total_harga` int(8) NOT NULL,
  PRIMARY KEY (`id_detail_transaksi`),
  KEY `id_transportasi` (`id_transportasi`),
  KEY `id_transaksi` (`id_transaksi`),
  CONSTRAINT `detail_transaksi_ibfk_2` FOREIGN KEY (`id_transportasi`) REFERENCES `transportasi` (`id_transportasi`),
  CONSTRAINT `detail_transaksi_ibfk_3` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `detail_transaksi` */

insert  into `detail_transaksi`(`id_detail_transaksi`,`id_transaksi`,`id_transportasi`,`nama_pemesan`,`tujuan`,`jumlah_tiket`,`harga_tiket`,`total_harga`) values 
(1,'P0001','T0001','Difa Agung','Yogyakarta',2,500000,1000000);

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(10) NOT NULL,
  `id_customer` varchar(10) NOT NULL,
  `tanggal_transaksi` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_customer` (`id_customer`),
  CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

insert  into `transaksi`(`id_transaksi`,`id_customer`,`tanggal_transaksi`) values 
('P0001','C0001','2018-12-16 20:10:56');

/*Table structure for table `transportasi` */

DROP TABLE IF EXISTS `transportasi`;

CREATE TABLE `transportasi` (
  `id_transportasi` varchar(10) NOT NULL,
  `nama_transportasi` varchar(25) NOT NULL,
  `jadwal` datetime NOT NULL,
  `harga` double NOT NULL,
  `tujuan` varchar(25) NOT NULL,
  PRIMARY KEY (`id_transportasi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transportasi` */

insert  into `transportasi`(`id_transportasi`,`nama_transportasi`,`jadwal`,`harga`,`tujuan`) values 
('T0001','pesawat','2018-12-24 07:00:00',500000,'Yogyakarta'),
('T0002','kapal','2018-12-23 16:30:00',150000,'semarang'),
('T0003','kereta api','2018-12-25 09:15:00',175000,'Yogyakarta'),
('T0004','bus','2018-12-22 12:45:00',100000,'Yogyakarta');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
