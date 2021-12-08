-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 25, 2021 at 11:53 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stockdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `assets`
--

CREATE TABLE `assets` (
  `Aname` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `assets`
--

INSERT INTO `assets` (`Aname`) VALUES
('Bonds'),
('Derivatives'),
('Equity'),
('Futures'),
('Mutual Funds'),
('Stocks');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `catid` int(100) NOT NULL,
  `cname` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`catid`, `cname`) VALUES
(1, 'High cap market'),
(2, 'Mid cap market'),
(3, 'Low cap market');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `catid` int(20) NOT NULL,
  `CompID` int(100) NOT NULL,
  `CompanyName` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`catid`, `CompID`, `CompanyName`) VALUES
(1, 1001, 'Tata Motors'),
(1, 1002, 'Wipro'),
(2, 1003, 'Vedanta'),
(3, 1004, 'Sungold'),
(3, 1005, 'srs pvt.ltd'),
(2, 1006, 'Paras Defence');

-- --------------------------------------------------------

--
-- Table structure for table `myusertable`
--

CREATE TABLE `myusertable` (
  `name` varchar(100) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `address` varchar(600) NOT NULL,
  `dob` date NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `usertype` varchar(20) NOT NULL,
  `pic` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `purchasedetail`
--

CREATE TABLE `purchasedetail` (
  `sno` int(100) NOT NULL,
  `purid` int(100) NOT NULL,
  `asset` varchar(200) NOT NULL,
  `compid` varchar(10000) NOT NULL,
  `price` float(100,2) NOT NULL,
  `qty` int(100) NOT NULL,
  `tcost` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchasedetail`
--

INSERT INTO `purchasedetail` (`sno`, `purid`, `asset`, `compid`, `price`, `qty`, `tcost`) VALUES
(1, 1, 'Equity', '1001', 90.00, 7, 630);

-- --------------------------------------------------------

--
-- Table structure for table `purchasetable`
--

CREATE TABLE `purchasetable` (
  `purid` int(11) NOT NULL,
  `billdate` date NOT NULL,
  `tcost` float(100,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchasetable`
--

INSERT INTO `purchasetable` (`purid`, `billdate`, `tcost`) VALUES
(1, '2021-10-02', 630.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assets`
--
ALTER TABLE `assets`
  ADD PRIMARY KEY (`Aname`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`catid`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`CompID`),
  ADD KEY `catid` (`catid`);

--
-- Indexes for table `myusertable`
--
ALTER TABLE `myusertable`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `purchasedetail`
--
ALTER TABLE `purchasedetail`
  ADD PRIMARY KEY (`sno`),
  ADD KEY `p` (`purid`);

--
-- Indexes for table `purchasetable`
--
ALTER TABLE `purchasetable`
  ADD PRIMARY KEY (`purid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `catid` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `CompID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1007;

--
-- AUTO_INCREMENT for table `purchasedetail`
--
ALTER TABLE `purchasedetail`
  MODIFY `sno` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `purchasetable`
--
ALTER TABLE `purchasetable`
  MODIFY `purid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `company`
--
ALTER TABLE `company`
  ADD CONSTRAINT `for` FOREIGN KEY (`catid`) REFERENCES `category` (`catid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
