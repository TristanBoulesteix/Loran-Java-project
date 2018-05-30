-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 12 Juin 2017 à 20:25
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllMaps` ()  NO SQL
SELECT id, map
FROM level$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findMapById` (IN `id` INT)  NO SQL
SELECT id, map
FROM level
WHERE level.id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findMapByName` (IN `map` VARCHAR(255))  NO SQL
SELECT map
FROM level
WHERE example.map = map$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `example`
--

CREATE TABLE `level` (
  `id` int(11) NOT NULL,
  `map` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `example`
--

INSERT INTO `level` (`id`, `map`) VALUES
(1, 'CHHHHHHHHHHHHHHHHHHCV                VLVV  P             V VV                V VV                V VV                  VV                  VV                  VVHHHH              VVT  H        HHHHHHVVG    V           1VCHHHHHHHHHHHHHHHHHHC'),
(2, 'CHHHHHHHHHHHHHCCCCCCVP            VHCCCCV               VHCCV                VHCV        V VVVV   VHV        V V       VV        V V     TVHV        V V   G VHCV        V V    VHCCVHHHHHHHHH V   VHCCCV2        LV  VHCCCCCHHHHHHHHHHHHHCCCCCC'),
(3, 'CHHHHHHHHHHHHHHHHHHCVP                 V             VVVVVV             VV      VVVVVVVVVVVVVV1                 VVVVVVVVV         VLVVVVVVVVV   VVVVVVVVVV          VVVVVVVVVV  V               VVT V            V  VVG V            V 3VCHHHHHHHHHHHHHHHHHHC'),
(4, 'CHHHHHHHHHHHHHHHHHHCVP                 V             VHHHHHHHHHHHHHHHHT VVHHHHHHHHHHHHHHHH  VVL2                VV  HHHHHHHHHHHHHHHHVV  HHHHHHHHHHHHHHHHVV                  VVHHHHHHHHHHHH      VVTTTTT             VVGT                VCHHHHHHHHHHHHHHHHHHC'),
(5, 'CHHHHHHHHHHHHHHHHHHCVP                 V             V                  VVHHHHHHHHHHHHHHHHH VVHHHHHHHHHHHHHHHHH VV2                 VVHHHHHHHHHHHHHHH   VVHHHHHHHHHHHHHHH   VV4                 VVHHHHHHHHH         VVGT               LVCHHHHHHHHHHHHHHHHHHC');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `example`
--
ALTER TABLE `level`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `example`
--
ALTER TABLE `level`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
