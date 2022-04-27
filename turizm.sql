-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1:3306
-- Üretim Zamanı: 02 Haz 2019, 15:28:55
-- Sunucu sürümü: 5.7.26
-- PHP Sürümü: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `turizm`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `musteri_listesi`
--

DROP TABLE IF EXISTS `musteri_listesi`;
CREATE TABLE IF NOT EXISTS `musteri_listesi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tc` varchar(11) COLLATE utf8_turkish_ci DEFAULT NULL,
  `adi` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `soyadi` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `cep_telefonu` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `adres_bilgileri` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `giris_tarihi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `cikis_tarihi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `konaklama_suresi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `oda_numarasi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `yas` varchar(3) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ucret` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `kisi` varchar(11) COLLATE utf8_turkish_ci DEFAULT NULL,
  `oda_tipi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `musteri_listesi`
--

INSERT INTO `musteri_listesi` (`id`, `tc`, `adi`, `soyadi`, `cep_telefonu`, `adres_bilgileri`, `giris_tarihi`, `cikis_tarihi`, `konaklama_suresi`, `oda_numarasi`, `yas`, `ucret`, `kisi`, `oda_tipi`) VALUES
(35, '54687944576', 'eralp', 'akman', '545 337 15 25', 'kastamonu', '28-06-2019', '30-06-2019', '2', '2', '21', '  800', '2', 'Normal'),
(36, '34647544689', 'cumali', 'akman', '534 739 38 06', 'izmir', '28-06-2019', '30-06-2019', '2', '2', '21', '  800', '2', 'Normal'),
(37, '16294844626', 'muhammed', 'saglam', '542 659 15 15', 'balikesir', '28-06-2019', '30-06-2019', '1', '1', '21', '  150', '2', 'Ekonomik'),
(38, '98765432198', 'merhaba', 'hocam', '542 659 15 15', 'balikesir', '28-06-2019', '30-06-2019', '1', '1', '21', '  150', '2', 'Ekonomik'),
(40, '1', '1', '1', '444', '444', '14-06-2019', '15-06-2019', '1', '5', '21', '  1000', '2', 'Kral');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `odalar`
--

DROP TABLE IF EXISTS `odalar`;
CREATE TABLE IF NOT EXISTS `odalar` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `oda_tipi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `pan_tipi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `personel_listesi`
--

DROP TABLE IF EXISTS `personel_listesi`;
CREATE TABLE IF NOT EXISTS `personel_listesi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tc` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ad` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `soyad` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `dogum_tarihi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `telefon` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `adres` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `cocuk_sayisi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `maas` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `mesai_saati` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `mesai_ucreti` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ise_giris_tarihi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `unvan` varchar(11) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `personel_listesi`
--

INSERT INTO `personel_listesi` (`id`, `tc`, `ad`, `soyad`, `dogum_tarihi`, `telefon`, `adres`, `cocuk_sayisi`, `maas`, `mesai_saati`, `mesai_ucreti`, `ise_giris_tarihi`, `unvan`) VALUES
(4, '39007070174', 'fahreddin', 'yasen', '7/05/1998', '545-337-15-25', 'bursa', '5', '2000', '12', '-', '30.05.2019', '');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `uyeler`
--

DROP TABLE IF EXISTS `uyeler`;
CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kadi` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `sifre` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `uyeler`
--

INSERT INTO `uyeler` (`id`, `kadi`, `sifre`, `email`) VALUES
(1, 'ali', '1', 'ali@gmail.com'),
(6, 'asd', 'asd', 'asd'),
(8, 'muhammed', 'muhammed', 'muhammed@gmail.com'),
(9, 'qq', 'qq', 'qq'),
(10, 'qq', 'qq', 'qq'),
(11, 'qq', 'qq', 'qq'),
(12, 'gokceny', 'gokceny', 'gokceny');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
