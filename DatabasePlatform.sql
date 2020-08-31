-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 31, 2020 at 02:10 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rpl2`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `idAdmin` varchar(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`idAdmin`, `nama`, `username`, `password`) VALUES
('admin', 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `idBooking` varchar(10) NOT NULL,
  `idCustomer` varchar(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `telepon` varchar(50) NOT NULL,
  `tanggalMasuk` varchar(20) NOT NULL,
  `tanggalKeluar` varchar(20) NOT NULL,
  `jumlahTamu` int(5) NOT NULL,
  `virtualAcc` varchar(20) NOT NULL,
  `cabang` varchar(20) NOT NULL,
  `tipeKamar` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`idBooking`, `idCustomer`, `nama`, `telepon`, `tanggalMasuk`, `tanggalKeluar`, `jumlahTamu`, `virtualAcc`, `cabang`, `tipeKamar`) VALUES
('166', '627', 'Bayu', '087822037321', '29 December, 2019', '31 December, 2019', 4, '512', 'Bali', 'Single Room'),
('243', '269', 'Ega', '0876', '3 January, 2020', '4 January, 2020', 2, '975', 'Yogyakarta', 'Single Room'),
('268', '774', 'Bayu', '087822037321', '29 December, 2019', '31 December, 2019', 4, '664', 'Bali', 'Single Room'),
('439', '240', 'Ega1', '0876', '3 January, 2020', '4 January, 2020', 2, '131', 'Yogyakarta', 'Single Room'),
('556', '858', 'Albert', '087822037321', '1 January, 2020', '4 January, 2020', 3, '700', 'Yogyakarta', 'Single Room'),
('701', '446', 'Zefanya', '082227683132', '24 December, 2019', '28 December, 2019', 2, '849', 'Bali', 'Family Room'),
('713', '285', 'Albertus Satrio Bayuaji', '087822037321', '29 December, 2019', '31 December, 2019', 2, '531', 'Bali', 'Single Room');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `idCustomer` varchar(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `noTelp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`idCustomer`, `nama`, `username`, `password`, `alamat`, `noTelp`) VALUES
('222', 'Bayu', 'albrstr', '1234', 'Jalan Paingan\n', '0878'),
('987', 'Platform', 'platformweb', '1234', 'Universitas Sanata Dharma, Paingan', '087923148956');

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `idKamar` varchar(5) NOT NULL,
  `tipeKamar` varchar(25) NOT NULL,
  `hargaKamar` int(10) NOT NULL,
  `jumlahKamar` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`idKamar`, `tipeKamar`, `hargaKamar`, `jumlahKamar`) VALUES
('kam10', 'Family Room', 750000, 10),
('kam11', 'Single Room', 500000, 15),
('kam12', 'Presidential Room', 1000000, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`idBooking`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`idCustomer`);

--
-- Indexes for table `kamar`
--
ALTER TABLE `kamar`
  ADD PRIMARY KEY (`idKamar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
