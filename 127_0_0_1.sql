-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2016 at 12:19 PM
-- Server version: 5.6.11
-- PHP Version: 5.5.1

SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: "mysqlsms"
--
CREATE DATABASE IF NOT EXISTS "mysqlsms" DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE mysqlsms;

-- --------------------------------------------------------

--
-- Table structure for table "agedetails"
--

DROP TABLE IF EXISTS `agedetails`;
CREATE TABLE "agedetails" (
  "name" varchar(70) NOT NULL,
  "tphome" int NOT NULL,
  "tpmob" int NOT NULL,
  "age" varchar(20) NOT NULL
);

--
-- Dumping data for table "agedetails"
--

SET IDENTITY_INSERT "agedetails" ON ;
INSERT INTO "agedetails" ("name", "tphome", "tpmob", "age") VALUES
('W.P.Nimesha Subhashini', 714262817, 712913859, '2months'),
('W.P.Upeksha', 471234569, 719963799, '6months'),
('S.A.Sithara Hansani', 471234567, 711234568, '2months'),
('W.P.Nimesha Subhashini', 714262817, 712913859, '2months'),
('W.P.Upeksha', 471234569, 719963799, '6months'),
('S.A.Sithara Hansani', 471234567, 711234568, '2months'),
('W.P.Nimesha Subhashini', 714262817, 712913859, '2months'),
('W.P.Upeksha', 471234569, 719963799, '6months'),
('S.A.Sithara Hansani', 471234567, 711234568, '2months'),
('G.G.Ayesha Madushani', 472345678, 719876543, '60months'),
('W.P.Nimesha Subhashini', 714262817, 712913859, '2months'),
('W.P.Upeksha', 471234569, 719963799, '6months'),
('S.A.Sithara Hansani', 471234567, 711234568, '2months'),
('G.G.Ayesha Madushani', 472345678, 719876543, '60months'),
('W.P.Nimesha Subhashini', 714262817, 712913859, '2months'),
('W.P.Upeksha', 471234569, 719963799, '6months'),
('S.A.Sithara Hansani', 471234567, 711234568, '2months'),
('G.G.Ayesha Madushani', 472345678, 719876543, '60months');

SET IDENTITY_INSERT "agedetails" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "details"
--

DROP TABLE IF EXISTS `details`;
CREATE TABLE "details" (
  "regid" int NOT NULL,
  "date" varchar(15) NOT NULL,
  "name" varchar(30) NOT NULL,
  "dateofbirth" varchar(15) NOT NULL,
  "sex" varchar(10) NOT NULL,
  "address" varchar(200) NOT NULL,
  "tphm" int NOT NULL,
  "tpmob" int NOT NULL,
  PRIMARY KEY ("regid")
);

--
-- Dumping data for table "details"
--

SET IDENTITY_INSERT "details" ON ;
INSERT INTO "details" ("regid", "date", "name", "dateofbirth", "sex", "address", "tphm", "tpmob") VALUES
(19, '2016/04/06', 'W.P.Upeksha', '2016/02/06', 'Male', 'Tissamaharamaya', 471234567, 776789567),
(20, '2016/04/06', 'S.A.Sithara Hansani', '2016/02/04', 'Female', 'Mattala', 987122345, 987654567),
(21, '2016/04/06', 'S.H.Hansani', '2016/02/01', 'Female', 'Tissamaharama', 987654345, 878906789);

SET IDENTITY_INSERT "details" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "file1"
--

DROP TABLE IF EXISTS `file1`;
CREATE TABLE "file1" (
  "regid" int NOT NULL,
  "date" varchar(15) NOT NULL,
  "name" varchar(30) NOT NULL,
  "dateofbirth" varchar(15) NOT NULL,
  "sex" varchar(10) NOT NULL,
  "address" varchar(200) NOT NULL,
  "tphm" varchar(10) NOT NULL,
  "tpmob" varchar(10) NOT NULL,
  "age" varchar(30) NOT NULL,
  "2monthsms" varchar(15) NOT NULL,
  "6monthsms" varchar(15) NOT NULL,
  "9monthsms" varchar(15) NOT NULL,
  "1yearsms" varchar(15) NOT NULL,
  "18monthsms" varchar(15) NOT NULL,
  "3yearsms" varchar(15) NOT NULL,
  "5yearsms" varchar(15) NOT NULL,
  "12yearsms" varchar(15) NOT NULL,
  PRIMARY KEY ("regid")
);

--
-- Dumping data for table "file1"
--

SET IDENTITY_INSERT "file1" ON ;
INSERT INTO "file1" ("regid", "date", "name", "dateofbirth", "sex", "address", "tphm", "tpmob", "age", "2monthsms", "6monthsms", "9monthsms", "1yearsms", "18monthsms", "3yearsms", "5yearsms", "12yearsms") VALUES
(5, '2016/04/05', 'W.P.Nimesha', '2016/02/05', 'Female', '1008/5,\nKirindiOya Mawatha,\nDebarawewa,\nTissamaharama', '471234567', '712345678', '0years,2months,5days', 'sent', '', '', '', '', '', '', ''),
(6, '2016/04/06', 'W.P.Upeksha', '2016/02/06', 'Male', 'Tissamaharamaya', '471234567', '776789567', '0years,2months,0days', 'sent', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send'),
(7, '2016/04/06', 'S.A.Sithara Hansani', '2016/02/04', 'Female', 'Mattala', '987122345', '987654567', '0years,2months,6days', 'sent', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send'),
(8, '2016/04/06', 'S.H.Hansani', '2016/02/01', 'Female', 'Tissamaharama', '987654345', '878906789', 'n', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send'),
(10, '2016/04/06', 'G.G.Madushani', '2016/02/03', 'Female', 'Tissamaharama', '1234545675', '1234657896', 'n', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send', 'Not yet send');

SET IDENTITY_INSERT "file1" OFF;

-- --------------------------------------------------------

--
-- Table structure for table "file2"
--

DROP TABLE IF EXISTS `file2`;
CREATE TABLE "file2" (
  "regid" int NOT NULL,
  "date" varchar(15) NOT NULL,
  "name" varchar(50) NOT NULL,
  "dateofbirth" varchar(15) NOT NULL,
  "sex" varchar(10) NOT NULL,
  "address" varchar(200) NOT NULL,
  "tphm" int NOT NULL,
  "tpmob" int NOT NULL,
  PRIMARY KEY ("regid")
);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
