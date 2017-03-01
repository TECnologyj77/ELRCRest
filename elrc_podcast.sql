CREATE DATABASE  IF NOT EXISTS `elrc` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `elrc`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: elrc
-- ------------------------------------------------------
-- Server version	8.0.0-dmr-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `podcast`
--

DROP TABLE IF EXISTS `podcast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `podcast` (
  `idpodcast` int(11) NOT NULL,
  `idshow` int(11) NOT NULL,
  `podcast_url` varchar(100) NOT NULL,
  `podcast_description` varchar(250) NOT NULL,
  `podcast_name` varchar(45) NOT NULL,
  `podcast_date` varchar(8) DEFAULT NULL,
  `podcast_watch_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`idpodcast`),
  KEY `idshow_idx` (`idshow`),
  CONSTRAINT `idshow` FOREIGN KEY (`idshow`) REFERENCES `show` (`idshow`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `podcast`
--

LOCK TABLES `podcast` WRITE;
/*!40000 ALTER TABLE `podcast` DISABLE KEYS */;
INSERT INTO `podcast` VALUES (1,1,'URL1','decs','name 1','2582015',5),(2,1,'URL2','decs','name 2','962015',6),(3,1,'URL3','decs','name 3','12302016',4),(4,2,'URL4','decs','name 4','7311992',5),(5,2,'URL5','decs','name 5','742013',5),(6,2,'URL6','decs','name 6','10122016',51),(7,3,'URL7','decs','name 7','10241992',51),(8,3,'URL8','decs','name 8','3192014',5),(9,3,'URL9','decs','name 9','3252013',4),(10,4,'URL10','decs','name 10','6282012',6),(11,4,'URL11','decs','name 11','2302017',8),(12,4,'URL12','decs','name 12','2292017',53),(13,5,'URL13','decs','name 13','2232015',12),(14,5,'URL14','decs','name 14','2232014',5),(15,5,'URL15','decs','name 15','2232013',78),(16,6,'URL16','decs','name 16','2232017',9),(17,6,'URL17','decs','name 17','2232015',8),(18,6,'URL18','decs','name 18','2232014',65),(19,7,'URL19','decs','name 19','2232014',33),(20,7,'URL20','decs','name 20','2232016',4),(21,7,'URL21','decs','name 21','2232012',6),(22,8,'URL22','decs','name 22','2232013',45),(23,8,'URL23','decs','name 23','2242010',NULL),(24,8,'URL24','decs','name 24','2232006',9),(25,9,'URL25','decs','name 25','2232004',67),(26,9,'URL26','decs','name 26','2232017',45),(27,9,'URL27','decs','name 27','2232000',3),(28,10,'URL28','decs','name 28','2232003',4),(29,10,'URL29','decs','name 29','112000',6),(30,10,'URL30','decs','name 30','112001',8),(31,11,'URL31','decs','name 31','112002',9),(32,11,'URL32','decs','name 32','112003',7),(33,11,'URL33','decs','name 33','112004',23),(34,12,'URL34','decs','name 34','112005',457),(35,12,'URL35','decs','name 35','112006',NULL),(36,12,'URL36','decs','name 36','112007',876),(37,13,'URL37','decs','name 37','112008',5),(38,13,'URL38','decs','name 38','112009',66),(39,13,'URL39','decs','name 39','112010',8),(40,13,'URL40','decs','name 40','112017',9);
/*!40000 ALTER TABLE `podcast` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-01 18:29:28
