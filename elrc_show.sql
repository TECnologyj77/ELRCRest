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
-- Table structure for table `show`
--

DROP TABLE IF EXISTS `show`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `show` (
  `idshow` int(11) NOT NULL AUTO_INCREMENT,
  `show_name` varchar(30) NOT NULL,
  `show_description` varchar(250) DEFAULT NULL,
  `show_image` blob,
  PRIMARY KEY (`idshow`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `show`
--

LOCK TABLES `show` WRITE;
/*!40000 ALTER TABLE `show` DISABLE KEYS */;
INSERT INTO `show` VALUES (1,'First Show','Blah',NULL),(2,'Second Show','Blah Blah',NULL),(3,'Third Show','Blah Blah Blah',NULL),(4,'Fourth Show','Blah Blah Blah',NULL),(5,'Fifth Show','Blah Blah Blah',NULL),(6,'Sixth Show','Blah Blah Blah',NULL),(7,'Seventh Show','Blah Blah Blah',NULL),(8,'And Another Show','Blah Blah Blah',NULL),(9,'But wait theres more','Blah Blah Blah',NULL),(10,'Tenth Show','Blah Blah Blah',NULL),(11,'Eleventh Show','Blah Blah Blah',NULL),(12,'Almost done','Blah Blah Blah',NULL),(13,'and we are done Show','Blah Blah Blah',NULL);
/*!40000 ALTER TABLE `show` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-01 18:29:29
