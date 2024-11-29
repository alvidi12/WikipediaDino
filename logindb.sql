-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-11-2024 a las 13:27:59
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `logindb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dinosaurios`
--

CREATE TABLE `dinosaurios` (
  `id_d` int(2) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `rango_temp` varchar(50) NOT NULL,
  `desplazamiento` varchar(50) NOT NULL,
  `altura` varchar(50) NOT NULL,
  `peso` varchar(50) NOT NULL,
  `habitad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dinosaurios`
--

INSERT INTO `dinosaurios` (`id_d`, `nombre`, `tipo`, `rango_temp`, `desplazamiento`, `altura`, `peso`, `habitad`) VALUES
(1, 'Stegosaurio', 'Herbivoro', 'Jurasico', 'Cuadrupedo', 'Entre 4 a 9 metros', 'Entre 5 a 7 Tn', 'Terrestre'),
(2, 'Spinosaurio', 'Carnivoro', 'Cretacico', 'Bipedo', 'Entre 16 a 18 metros', 'Entre 7 a 9 Tn', 'Acuatico y Terrestre'),
(3, 'Diplodocus', 'Herbivoro', 'Jurasico', 'Cuadrupedo', 'Hasta 32 metros', 'Entre 11 a 20 Tn', 'Terrestre'),
(4, 'Pterodactylus', 'Carnivoro', 'Titoniense', 'Cuadrupedo/Volador', 'Hasta 2 metros', 'Hasta 50 KG', 'Volador'),
(5, 'Oviraptor', 'Omnivoro', 'Cretacico', 'Bipedo', 'Hasta 2 metros', 'Hasta 25 KG ', 'Terrestre'),
(6, 'Plesiosaurus', 'Carnivoro', 'Cretacico/Jurasico', 'Acuatico', 'Hasta 23 metros', 'Hasta 500 KG', 'Acuatico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
