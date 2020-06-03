-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-02-2020 a las 23:46:35
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `exercici`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `customers`
--

CREATE TABLE `customers` (
  `idCustomers` int(11) NOT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `postal_code` varchar(8) DEFAULT NULL,
  `telefon` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `register_date` datetime DEFAULT NULL,
  `recommended_customer` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `customers`
--

INSERT INTO `customers` (`idCustomers`, `customer_name`, `address`, `postal_code`, `telefon`, `email`, `register_date`, `recommended_customer`) VALUES
(2, 'cliente 2', 'direccion cliente2', '08001', '65555555', 'email@email.com', '2020-02-13 23:31:08', NULL),
(3, 'cliente 3', 'direccion cliente3', '08001', '3335555', 'email@email.com', '2020-02-13 23:31:08', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employee`
--

CREATE TABLE `employee` (
  `idEmployee` int(11) NOT NULL,
  `name_employee` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='			';

--
-- Volcado de datos para la tabla `employee`
--

INSERT INTO `employee` (`idEmployee`, `name_employee`) VALUES
(1, 'empleado 1'),
(2, 'empleado2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `glasses`
--

CREATE TABLE `glasses` (
  `idglasses` int(11) NOT NULL,
  `Trademark_idTrademark` int(11) NOT NULL,
  `graduation_left` varchar(45) DEFAULT NULL,
  `graduation_right` varchar(45) DEFAULT NULL,
  `frame` enum('Floatin','Metal','Paste') NOT NULL,
  `frame_color` varchar(45) DEFAULT NULL,
  `color_left` varchar(45) DEFAULT NULL,
  `color_right` varchar(45) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `glasses`
--

INSERT INTO `glasses` (`idglasses`, `Trademark_idTrademark`, `graduation_left`, `graduation_right`, `frame`, `frame_color`, `color_left`, `color_right`, `price`) VALUES
(1, 1, '-5', '-6', 'Floatin', 'red', 'transparente', 'transparente', 125),
(2, 1, '-4', '-5', 'Metal', 'red', 'transparente', 'transparente', 125),
(3, 1, '-5', '6', 'Paste', 'blue', 'blue', 'blue', 180);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice`
--

CREATE TABLE `invoice` (
  `idinvoice` int(11) NOT NULL,
  `Customer_idcustomer` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `Employee_idemployee` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `invoice`
--

INSERT INTO `invoice` (`idinvoice`, `Customer_idcustomer`, `date`, `Employee_idemployee`) VALUES
(1, 2, '2020-02-13', 1),
(2, 2, '2020-02-13', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice_lines`
--

CREATE TABLE `invoice_lines` (
  `idInvoice_lines` int(11) NOT NULL,
  `Invoice_idinvoice` int(11) NOT NULL,
  `Glasses_idglasses` int(11) NOT NULL,
  `Units` int(11) DEFAULT NULL,
  `Price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `invoice_lines`
--

INSERT INTO `invoice_lines` (`idInvoice_lines`, `Invoice_idinvoice`, `Glasses_idglasses`, `Units`, `Price`) VALUES
(1, 1, 1, 2, 150),
(2, 1, 2, 1, 125),
(3, 2, 3, 3, 121),
(4, 2, 1, 12, 120);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice_provider`
--

CREATE TABLE `invoice_provider` (
  `idinvoice_provider` int(11) NOT NULL,
  `Provider_idprovider` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `Employee_idemployee` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `invoice_provider`
--

INSERT INTO `invoice_provider` (`idinvoice_provider`, `Provider_idprovider`, `date`, `Employee_idemployee`) VALUES
(1, 1, '2020-02-13', 1),
(2, 2, '2020-02-14', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice_provider_lines`
--

CREATE TABLE `invoice_provider_lines` (
  `idInvoice_Provider_lines` int(11) NOT NULL,
  `Invoice_lines_idinvoice` int(11) NOT NULL,
  `Glasses_idglasses` int(11) NOT NULL,
  `Units` int(11) DEFAULT NULL,
  `Price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `invoice_provider_lines`
--

INSERT INTO `invoice_provider_lines` (`idInvoice_Provider_lines`, `Invoice_lines_idinvoice`, `Glasses_idglasses`, `Units`, `Price`) VALUES
(1, 1, 1, 2, 50),
(2, 1, 3, 1, 25),
(3, 2, 2, 1, 33),
(4, 2, 1, 1, 65);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provider`
--

CREATE TABLE `provider` (
  `idprovider` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `postal code` varchar(8) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `fax` varchar(45) DEFAULT NULL,
  `NIF` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `provider`
--

INSERT INTO `provider` (`idprovider`, `name`, `address`, `city`, `postal code`, `country`, `phone`, `fax`, `NIF`) VALUES
(1, 'proveedor 1', 'direccion proveedor', 'Barcelona', '08001', 'spain', '6554565', NULL, '58771285784'),
(2, 'proveedor 2', 'direccion proveedor2', 'Barcelona', '08001', 'spain', '6554565', NULL, '587712285784');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trademark`
--

CREATE TABLE `trademark` (
  `idTrademark` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `exclusive_provider` tinyint(4) NOT NULL,
  `Provider_idProviderExclusive` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='	\n';

--
-- Volcado de datos para la tabla `trademark`
--

INSERT INTO `trademark` (`idTrademark`, `name`, `exclusive_provider`, `Provider_idProviderExclusive`) VALUES
(1, 'marca 1', 0, NULL),
(2, 'marca 2', 0, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`idCustomers`),
  ADD KEY `recommended_customer` (`recommended_customer`);

--
-- Indices de la tabla `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`idEmployee`);

--
-- Indices de la tabla `glasses`
--
ALTER TABLE `glasses`
  ADD PRIMARY KEY (`idglasses`),
  ADD KEY `Trademark_idTrademark` (`Trademark_idTrademark`);

--
-- Indices de la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`idinvoice`),
  ADD KEY `Employee_idemployee` (`Employee_idemployee`),
  ADD KEY `Customer_idcustomer` (`Customer_idcustomer`);

--
-- Indices de la tabla `invoice_lines`
--
ALTER TABLE `invoice_lines`
  ADD PRIMARY KEY (`idInvoice_lines`),
  ADD KEY `fk_Invoice_lines_invoice1_idx` (`Invoice_idinvoice`),
  ADD KEY `Glasses_idglasses` (`Glasses_idglasses`);

--
-- Indices de la tabla `invoice_provider`
--
ALTER TABLE `invoice_provider`
  ADD PRIMARY KEY (`idinvoice_provider`),
  ADD KEY `Provider_idprovider` (`Provider_idprovider`);

--
-- Indices de la tabla `invoice_provider_lines`
--
ALTER TABLE `invoice_provider_lines`
  ADD PRIMARY KEY (`idInvoice_Provider_lines`),
  ADD KEY `Invoice_lines_idinvoice` (`Invoice_lines_idinvoice`),
  ADD KEY `Glasses_idglasses` (`Glasses_idglasses`);

--
-- Indices de la tabla `provider`
--
ALTER TABLE `provider`
  ADD PRIMARY KEY (`idprovider`);

--
-- Indices de la tabla `trademark`
--
ALTER TABLE `trademark`
  ADD PRIMARY KEY (`idTrademark`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `customers`
--
ALTER TABLE `customers`
  ADD CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`recommended_customer`) REFERENCES `customers` (`idCustomers`);

--
-- Filtros para la tabla `glasses`
--
ALTER TABLE `glasses`
  ADD CONSTRAINT `glasses_ibfk_1` FOREIGN KEY (`Trademark_idTrademark`) REFERENCES `trademark` (`idTrademark`);

--
-- Filtros para la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`Employee_idemployee`) REFERENCES `employee` (`idEmployee`),
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`Customer_idcustomer`) REFERENCES `customers` (`idCustomers`);

--
-- Filtros para la tabla `invoice_lines`
--
ALTER TABLE `invoice_lines`
  ADD CONSTRAINT `fk_Invoice_lines_invoice1` FOREIGN KEY (`Invoice_idinvoice`) REFERENCES `invoice` (`idinvoice`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `invoice_lines_ibfk_1` FOREIGN KEY (`Glasses_idglasses`) REFERENCES `glasses` (`idglasses`);

--
-- Filtros para la tabla `invoice_provider`
--
ALTER TABLE `invoice_provider`
  ADD CONSTRAINT `invoice_provider_ibfk_1` FOREIGN KEY (`Provider_idprovider`) REFERENCES `provider` (`idprovider`);

--
-- Filtros para la tabla `invoice_provider_lines`
--
ALTER TABLE `invoice_provider_lines`
  ADD CONSTRAINT `invoice_provider_lines_ibfk_1` FOREIGN KEY (`Invoice_lines_idinvoice`) REFERENCES `invoice_provider` (`idinvoice_provider`),
  ADD CONSTRAINT `invoice_provider_lines_ibfk_2` FOREIGN KEY (`Glasses_idglasses`) REFERENCES `glasses` (`idglasses`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
