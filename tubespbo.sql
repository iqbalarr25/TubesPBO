-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2022 at 09:08 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubespbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `rumah`
--

CREATE TABLE `rumah` (
  `id_rumah` bigint(20) NOT NULL,
  `no_hp` varchar(191) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `alamat` varchar(2000) NOT NULL,
  `kota` varchar(191) NOT NULL,
  `provinsi` varchar(191) NOT NULL,
  `carport` varchar(191) NOT NULL,
  `kamar_tidur` varchar(191) NOT NULL,
  `kamar_mandi` varchar(191) NOT NULL,
  `luas_tanah` varchar(256) NOT NULL,
  `tipe` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rumah`
--

INSERT INTO `rumah` (`id_rumah`, `no_hp`, `harga`, `alamat`, `kota`, `provinsi`, `carport`, `kamar_tidur`, `kamar_mandi`, `luas_tanah`, `tipe`) VALUES
(250409, '082113313733', 1500000000, 'Dukuh Bima Asri No 71', 'Bekasi', 'Jawa Barat', '2', '5', '2', '12x24', 'C'),
(250410, '082113313733', 1500000000, 'Dukuh Bima Asri No 71', 'Bekasi', 'Jawa Barat', '2', '5', '2', '12x24', 'A'),
(250413, '2', 102000, '2', '2', '2', '2', '2', '2', '2x2', 'C'),
(250416, '123123123', 1020000, 'aw', 'aw', 'aw', 'aw', 'aw', 'aw', '12x34', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `pembeli` varchar(365) NOT NULL,
  `metode_pembayaran` varchar(365) NOT NULL,
  `id_rumah` int(11) NOT NULL,
  `harga` bigint(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id`, `pembeli`, `metode_pembayaran`, `id_rumah`, `harga`, `created_at`) VALUES
(40, 'iqbalss', 'Cicilan', 250410, 12625000, '2022-01-09 14:02:07'),
(41, 'Iqbal Arrafi', 'Cicilan', 250410, 12625000, '2022-01-09 15:37:40'),
(42, 'iqbal gantengs', 'Cash', 250416, 1020000, '2022-01-09 15:42:22'),
(44, 'awdas', 'Cash', 250410, 1500000000, '2022-01-11 14:03:08'),
(45, 'iqbal', 'Cicilan', 250410, 12625000, '2022-01-11 19:53:35');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'iqbal', 'iqbal'),
(2, 'argu', 'argu'),
(3, 'david', 'david');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rumah`
--
ALTER TABLE `rumah`
  ADD PRIMARY KEY (`id_rumah`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_rumah` (`id_rumah`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rumah`
--
ALTER TABLE `rumah`
  MODIFY `id_rumah` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=250417;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
