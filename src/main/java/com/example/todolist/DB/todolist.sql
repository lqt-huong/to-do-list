-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: todolist
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `serial` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES ('1','task1','1',1),('2','task2','1',2),('3eab804c-8764-4ebb-91b5-200f9221dac6','5','null',4),('5357b69b-a834-4777-8871-388d49737bfc','1234','1',3),('7e07a788-bc38-446e-8d93-d6d8552b87e9','44','null',5),('a17becb4-8955-4369-a4b9-ee4913b77d5e','task2','830489df-c857-4174-aad2-69b229a9b8f2',1);
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todo`
--

DROP TABLE IF EXISTS `todo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `todo` (
  `id` varchar(255) NOT NULL,
  `todo_name` varchar(255) DEFAULT NULL,
  `task_id` varchar(255) DEFAULT NULL,
  `checked` tinyint DEFAULT NULL,
  `serial` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todo`
--

LOCK TABLES `todo` WRITE;
/*!40000 ALTER TABLE `todo` DISABLE KEYS */;
INSERT INTO `todo` VALUES ('1','a','1',1,1),('1e8abd71-e921-48d8-b034-535402a9066e','hbbh','3eab804c-8764-4ebb-91b5-200f9221dac6',0,1),('2','b','1',0,2),('3','c','1',0,3),('723685fb-be1e-400f-9a35-2c5530bc2db9','nhu quan','7e07a788-bc38-446e-8d93-d6d8552b87e9',1,1),('92e5b341-a51c-4ddc-9fb7-1fad5c1bc90d','nhu quan','7e07a788-bc38-446e-8d93-d6d8552b87e9',1,4),('d9d86a9d-8e02-45b5-92ba-7698d35fa8fa','nhu quan','7e07a788-bc38-446e-8d93-d6d8552b87e9',0,3),('ee467537-8dd8-4b84-94e9-a0861d267899','d','1',0,4);
/*!40000 ALTER TABLE `todo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1','tuandeptrai','123'),('1cfb9a5f-6ccf-4096-9ec3-52fd2c17d805','thienhuong','123'),('6d449dcc-bd53-4b0d-93e8-03efe912f989','nhibui','123'),('830489df-c857-4174-aad2-69b229a9b8f2','PhatYeah','123456'),('fe4a95ce-0269-4b56-8d79-a0d29e216141','PhatYeah','123456');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-17  6:17:24
