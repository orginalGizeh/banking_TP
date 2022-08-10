-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 10 août 2022 à 18:59
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `banking`
--

-- --------------------------------------------------------

--
-- Structure de la table `banque`
--

DROP TABLE IF EXISTS `banque`;
CREATE TABLE IF NOT EXISTS `banque` (
  `code` varchar(10) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `villeqg` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `banque`
--

INSERT INTO `banque` (`code`, `nom`, `villeqg`) VALUES
('EQ10', 'Equity BCDC', 'Kinshasa'),
('UB11', 'UBA', 'Matadi'),
('ECO114', 'EcoBank', 'Nigeria'),
('AC441', 'Acces Bank', 'Lagos'),
('TM78', 'Trust Merchant Bank', 'Ghana'),
('RW556', 'Raw Bank', 'Amsterdam'),
('FN98', 'FINCA', 'Abuja'),
('FB113', 'FBNBank', 'Ondo');

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `code` int(10) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) NOT NULL,
  `solde` int(10) NOT NULL,
  `codeBanque` varchar(10) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`code`, `type`, `solde`, `codeBanque`) VALUES
(1, 'Courant', 20000, 'EQ10'),
(2, 'Epargbe', 458000, 'EQ10'),
(3, 'Courant', 451110, 'UB11'),
(4, 'Epargne', 6000, 'UB11'),
(5, 'Courant', 14000, 'ECO114'),
(6, 'Epargne', 140560, 'ECO114'),
(7, 'Courant', 200, 'AC441'),
(8, 'Epargne', 6300, 'AC441'),
(9, 'Courant', 1300, 'TM78'),
(10, 'Epargne', 65800, 'AC441'),
(11, 'Courant', 8000, 'RW556'),
(12, 'Epargne', 78, 'RW556'),
(13, 'Courant', 20000, 'FN98'),
(14, 'Epargne', 6300, 'FN98'),
(15, 'Courant', 200, 'FB113'),
(16, 'Epargne', 6000000, 'FB113');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
