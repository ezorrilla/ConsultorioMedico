drop table IF EXISTS pago;
drop table IF EXISTS  servicio;
drop table IF EXISTS  area;
drop table IF EXISTS  examen_clinico;
drop table IF EXISTS  consulta;
drop table IF EXISTS  historia;
drop table IF EXISTS  medico;
drop table IF EXISTS  paciente;
drop table IF EXISTS  usuarios;
drop table IF EXISTS  opcionxperfil;
drop table IF EXISTS  opcion;
drop table IF EXISTS  perfil;

SET time_zone = "+00:00";


-- Estructura de tabla para la tabla `area`
CREATE TABLE IF NOT EXISTS `area` (
  `cod_area` int(11) NOT NULL AUTO_INCREMENT,
  `area_nomb` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`cod_area`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`cod_area`, `area_nomb`) VALUES
(1, 'Medicina General'),
(2, 'Ginecologia'),
(3, 'Odontologia'),
(4, 'Terapia de Lenguaje'),
(5, 'Pedriatria'),
(6, 'Laboratorio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_clinico`
--


CREATE TABLE IF NOT EXISTS `examen_clinico` (
  `cod_exa` int(11) NOT NULL AUTO_INCREMENT,
  `cod_pac` int(11) DEFAULT NULL,
  `cod_serv` int(11) DEFAULT NULL,
  `diagnostico` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `exam_fisi` MEDIUMBLOB DEFAULT NULL,
  `notas` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`cod_exa`),
  KEY `fk_pac` (`cod_pac`),
  KEY `fk_se` (`cod_serv`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `examen_clinico`
--
/*Pendiente,Realizado*/
INSERT INTO `examen_clinico` (`cod_exa`, `cod_pac`,`cod_serv`, `diagnostico`,`fecha`) VALUES
(1, 1, 1, '',(select now()) );

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia`
--

CREATE TABLE IF NOT EXISTS `historia` (
  `cod_his` int(11) NOT NULL AUTO_INCREMENT,
  `cod_pac` int(11) DEFAULT NULL,
  `fecha_his` varchar(11) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sangre` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `VIH` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,

  `alergias` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `alergia_medic` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `medicamentos` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `enfermedades` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,  
  `habitos` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,

  `antec_fami` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha_act` varchar(11) COLLATE utf8_spanish_ci DEFAULT NULL,  
  PRIMARY KEY (`cod_his`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `historia`
--

INSERT INTO `historia` (`cod_his`, `cod_pac`, `fecha_his`) VALUES
(1, 1, '2016-02-10'),
(2, 2, '2016-03-10'),
(3, 3, '2016-04-10'),
(4, 4, '2016-05-10'),
(5, 5, '2016-06-10'),
(6, 6, '2016-07-10'),
(7, 7, '2016-08-10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE IF NOT EXISTS `medico` (
  `cod_med` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_med` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido_med` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `dist_med` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telf_med` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_med`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`cod_med`, `nombre_med`, `apellido_med`, `dist_med`, `telf_med`) VALUES
(1, 'Martin', 'Gonzales', 'Villa Maria del Triunfo', 1234567),
(2, 'Julian', 'Perez', 'San Juan de Miraflores', 8749856),
(3, 'Victor', 'Gavidia', 'Villa el Salvador', 7745661),
(4, 'Ronald', 'Montes', 'Jose Galves', 123456),
(5, 'Luis', 'Cruzado', 'Pachacamac', 7744561);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
  `cod_pac` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_pac` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido_pac` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha_nac` varchar(11) COLLATE utf8_spanish_ci DEFAULT NULL,
  `sexo_pac` char(1) COLLATE utf8_spanish_ci DEFAULT NULL,
  `dni_pac` char(8) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_pac`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`cod_pac`, `nombre_pac`, `apellido_pac`, `fecha_nac`, `sexo_pac`, `dni_pac`, `direccion`, `telefono`) VALUES
(1, 'Joel', 'Acuña Carrasco', '10-07-1993', 'M', '75724163', 'Mz B2 Lote 11', 11457464),
(2, 'Luis', 'Gonzales', '10-10-1992', 'M', '75724163', 'Mz B2 Lote 11', 11412565),
(3, 'Pedro', 'Larriega', '10-09-1991', 'M', '84745878', 'Mz B1 Lote 24', 11478842),
(4, 'Julian', 'Mirian', '10-10-1990', 'F', '41578864', 'Mz A3 Lote 1', 14784433),
(5, 'Miguel', 'Vera', '10-01-1980', 'M', '74189654', 'Mz C4 Lote 15', 11124574),
(6, 'Manuel', 'Navarro', '10-02-1985', 'M', '41563258', 'Mz C4 Lote 20', 12347885),
(7, 'Erick', 'Alvarez', '10-08-1979', 'M', '33654789', 'Mz B2 Lote 21', 11234781);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE IF NOT EXISTS `pago` (
  `cod_pago` int(11) NOT NULL AUTO_INCREMENT,
  `cod_serv` int(11) DEFAULT NULL,
  `cod_pac` int(11) DEFAULT NULL,
  `tipo_tran` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `cod_transac` int(11) DEFAULT NULL,
  `fecha_crea` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha_pago` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `monto` decimal(5,2) DEFAULT NULL,
  `estado` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `usu_crea` int(11) DEFAULT NULL,
  `usu_pago` int(11) DEFAULT NULL,
  PRIMARY KEY (`cod_pago`),
  KEY `fk_ser` (`cod_serv`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `pago`
--

INSERT INTO `pago` (`cod_pago`, `cod_serv`, `cod_pac`, `tipo_tran`, `cod_transac`, `fecha_crea`, `fecha_pago`, `monto`, `estado`, `usu_crea`,`usu_pago`) VALUES
(1, 2, 1, 'Consulta',1, (select now()), (select now()), '20.00','Pagado',1,1),
(2, 2, 4, 'Consulta',2, (select now()), NULL, '20.00','Pendiente',1,NULL),
(3, 2, 4, 'Consulta',3, (select now()), (select now()), '20.00','Pagado',1,1),
(4, 1, 1, 'Examen',1, (select now()), (select now()), '20.00','Pagado',1,1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE IF NOT EXISTS `servicio` (
  `cod_serv` int(11) NOT NULL AUTO_INCREMENT,
  `cod_area` int(11) DEFAULT NULL,
  `tipo_serv` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nomb_serv` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `cost_serv` decimal(5,2) DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  PRIMARY KEY (`cod_serv`),
  KEY `fk_area` (`cod_area`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`cod_serv`, `cod_area`, `tipo_serv`, `nomb_serv`, `cost_serv`, `estado`) VALUES
(1, 6, 'Examen', 'Hemoglobina', '15.00',1),
(2, 1, 'Consulta', 'Consulta General', '20.00',1),
(3, 6, 'Examen', 'Glucosa', '14.00',0),
(4, 6, 'Examen', 'Prueba Orina', '12.00',1),
(5, 1, 'Registro', 'Pago Historia', '1.00',1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consulta`
--
CREATE TABLE IF NOT EXISTS `consulta` (
  `cod_cons` int(11) NOT NULL AUTO_INCREMENT,
  `cod_pac` int(11) DEFAULT NULL,
  `cod_serv` int(11) DEFAULT NULL,
  `cod_med` int(11) DEFAULT NULL,

  `peso` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `talla` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `presion_art` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `temperatura` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `notas` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,

  `motivo_consu` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `diagnostico` text COLLATE utf8_spanish_ci,
  `tratamiento` text COLLATE utf8_spanish_ci,
  `nota` text COLLATE utf8_spanish_ci,
  `estado` varchar(12) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`cod_cons`),
  KEY `fk_pac` (`cod_pac`),
  KEY `fk_sv` (`cod_serv`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `consulta`
--
/*Consulta: Pendiente,Revisado,Atendido   */
INSERT INTO `consulta` (`cod_cons`,`cod_pac`,`cod_serv`,`cod_med`,`peso`,`talla`, `presion_art`,`temperatura`,`notas`,
                        `motivo_consu`,`diagnostico`, `tratamiento`,`nota`,`estado`,`fecha`) VALUES
(1, 1, 2,4, '67 kg', '1.70 m', '180/60', '38.5 °','Se mostró tenso',
  'Fiebre alta toda la noche','Intoxicacion', 'Tomar medicinas cada 8 horas despues de las comidas','notas','Atendido',(select now())),
(2, 4, 2,4,null,null,null,null,null,'Diarrea constante','', '','','Pendiente',(select now())),
(3, 3, 2,4,null,null,null,null,null,'Dolor de estomago','', '','','Pendiente',(select now()));
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opcion`
--

CREATE TABLE IF NOT EXISTS `opcion` (
  `cod_opc` int(3) NOT NULL AUTO_INCREMENT,
  `opcion` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `link` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `estado` int(1) COLLATE utf8_spanish_ci DEFAULT NULL,
  `weight` int(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ico` varchar(25) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`cod_opc`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `opcion`
--

INSERT INTO `opcion` (`cod_opc`, `opcion`, `descripcion`, `link`, `estado`, `weight`, `ico`) VALUES
(1, 'Inicio', 'Opcion del menú', '?c=Home', 1, 1, 'glyphicon-home'),
(2, 'Historias y Pacientes', 'Opcion del menú', '?c=Paciente', 1, 2, 'glyphicon-user'),
(3, 'Signos Vitales', 'Opcion del menú', '?c=Signos', 1, 3, 'glyphicon-heart-empty'),
(4, 'Consultas Médicas', 'Opcion del menú', '?c=Consulta', 1, 4, 'glyphicon-heart'),
(5, 'Pago', 'Opcion del menú', '?c=Pago', 1, 5, 'glyphicon-th-large'),
(6, 'Recepción', 'Opcion del menú', '?c=Recepcion', 1, 6, 'glyphicon-align-left'),
(7, 'Doctores', 'Opcion del menú', '?c=Medico', 1, 7, 'glyphicon-thumbs-up'),
(8, 'Areas', 'Opcion del menú', '?c=Area', 1, 8, 'glyphicon-folder-close'),
(9, 'Servicios', 'Opcion del menú', '?c=Servicio', 1, 9, 'glyphicon-thumbs-up'),
(10, 'Usuarios', 'Opcion del menú', '?c=Usuario', 1, 10, 'glyphicon glyphicon-user'),
(11, 'Perfiles', 'Opcion del menú', '?c=Perfil', 1, 11, 'glyphicon-lock');
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfil`
--

CREATE TABLE IF NOT EXISTS `perfil` (
  `cod_perf` int(3) NOT NULL AUTO_INCREMENT,
  `perfil` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `estado` int(1) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`cod_perf`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `perfil`
--

INSERT INTO `perfil` (`cod_perf`, `perfil`, `estado`) VALUES
(1, 'Administrador', 1),
(2, 'Medico', 1),
(3, 'Recepcionista', 1),
(4, 'Cajera', 1),
(5, 'Enfermera', 1);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opcionxperfil`
--

CREATE TABLE IF NOT EXISTS `opcionxperfil` (
  `cod_perf` int(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  `cod_opc` int(3) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `opcionxperfil`
--

INSERT INTO `opcionxperfil` (`cod_perf`, `cod_opc`) VALUES
(1, 1),(1, 2),(1, 3),(1, 4),(1, 5),(1, 6),(1, 7),(1, 8),(1, 9),(1, 10),(1, 11),
(2, 1),(2, 2),(2, 4);
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `num_usu` int(3) NOT NULL AUTO_INCREMENT,
  `nombre_usu` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido_usu` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `dni_usu` char(8) COLLATE utf8_spanish_ci DEFAULT NULL,
  `pass` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `cod_perf` varchar(15) COLLATE utf8_spanish_ci DEFAULT NULL,
  `estado` int(1) DEFAULT NULL,
  PRIMARY KEY (`num_usu`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`num_usu`, `nombre_usu`, `apellido_usu`, `dni_usu`, `pass`,`cod_perf`,`estado`) VALUES
(1, 'Prueba', 'Prueba', '12345678', 'joel', 1,1),
(2, 'Prueba2', 'Prueba2', '87654321', '123',2,1),
(3, 'Prueba3', 'Prueba3', '87654322', '123',3,1),
(4, 'Prueba4', 'Prueba4', '87654323', '123',4,1),
(5, 'Prueba5', 'Prueba5', '87654324', '123',5,1);


--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `fk_ser` FOREIGN KEY (`cod_serv`) REFERENCES `servicio` (`cod_serv`);

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `fk_area` FOREIGN KEY (`cod_area`) REFERENCES `area` (`cod_area`);


