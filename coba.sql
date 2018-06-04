-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2018 at 04:21 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coba`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pekerja`
--

CREATE TABLE `pekerja` (
  `id` int(20) NOT NULL,
  `id_inst` int(20) NOT NULL,
  `id_rumus` int(20) NOT NULL,
  `kd_pkrj` varchar(10) DEFAULT NULL,
  `nm_pkrj` varchar(100) DEFAULT NULL,
  `divisi` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `perusahaan`
--

CREATE TABLE `perusahaan` (
  `id` int(20) NOT NULL,
  `kd_inst` varchar(20) NOT NULL,
  `cabang` varchar(50) DEFAULT NULL,
  `nm_inst` varchar(150) DEFAULT NULL,
  `alamat` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perusahaan`
--

INSERT INTO `perusahaan` (`id`, `kd_inst`, `cabang`, `nm_inst`, `alamat`) VALUES
(1, 'a12', 'aa', 'aa', 'aaa');

-- --------------------------------------------------------

--
-- Table structure for table `rumus`
--

CREATE TABLE `rumus` (
  `id` int(20) NOT NULL,
  `mesin` varchar(10) DEFAULT NULL,
  `jenis_radiasi` varchar(50) DEFAULT NULL,
  `jenis_hp` varchar(10) DEFAULT NULL,
  `rumus1` double(8,1) DEFAULT NULL,
  `rumus2` double(8,1) DEFAULT NULL,
  `tanda` varchar(2) DEFAULT NULL,
  `uir` double(8,1) DEFAULT NULL,
  `upad` double(8,1) DEFAULT NULL,
  `us` double(8,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pekerja`
--
ALTER TABLE `pekerja`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_inst` (`id_inst`),
  ADD KEY `id_rumus` (`id_rumus`);

--
-- Indexes for table `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rumus`
--
ALTER TABLE `rumus`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pekerja`
--
ALTER TABLE `pekerja`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `perusahaan`
--
ALTER TABLE `perusahaan`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `rumus`
--
ALTER TABLE `rumus`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `pekerja`
--
ALTER TABLE `pekerja`
  ADD CONSTRAINT `pekerja_ibfk_1` FOREIGN KEY (`id_inst`) REFERENCES `perusahaan` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pekerja_ibfk_2` FOREIGN KEY (`id_rumus`) REFERENCES `rumus` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
