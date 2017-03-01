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
-- Table structure for table `artist_to_show`
--

DROP TABLE IF EXISTS `artist_to_show`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artist_to_show` (
  `idartist` int(11) DEFAULT NULL,
  `idshow` int(11) NOT NULL,
  KEY `idshow_idx` (`idshow`),
  KEY `foreignkey_atrist_to_show_idartist_idx` (`idartist`),
  CONSTRAINT `fk_idartist` FOREIGN KEY (`idartist`) REFERENCES `artist` (`idartist`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idshow` FOREIGN KEY (`idshow`) REFERENCES `show` (`idshow`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artist_to_show`
--

LOCK TABLES `artist_to_show` WRITE;
/*!40000 ALTER TABLE `artist_to_show` DISABLE KEYS */;
INSERT INTO `artist_to_show` VALUES (1,1),(1,2),(1,3),(1,4),(2,5),(2,6),(2,7),(2,8),(3,9),(3,10),(3,11),(3,12),(4,1),(4,2),(4,3),(4,13),(5,4),(5,5),(5,6),(5,7);
/*!40000 ALTER TABLE `artist_to_show` ENABLE KEYS */;
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
