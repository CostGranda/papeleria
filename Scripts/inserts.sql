-- Tabla CLIENTE
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('16451','RAFAEL HERRERA DIAZ','6362615','fronhs01@edatel.net.co');
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('18133','JONATHAN MENDEZ RODRIGUEZ','6672727',null);
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('12685','JORGE MORALES SEVERICHE','3390900','clinicabelen@gmail.com');
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('17319','ALEX MORALES SOLANO','7459010','hospifusa@yahoo.com');
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('6166','OMAR ORTIZ','4077075',null);
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('12893','JHONAIMA RUIZ HOYOS','4767830','carterahsrg@etb.net.co');
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('18394','JOSELINA SILGADO CASTILLO','6436131','ncss@mediasociados.com.co');
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('16257','YUDANI TORO MARQUEZ','6382828',null);
INSERT INTO CLIENTE (DOCUMENTO_CLIENTE,NOMBRE_COMPLETO,TELEFONO_CLI,CORREO) values ('8322','GUILLERMO TORRES','6555361','dgomehs01@edatel.net.co');


-- Tabla PRODUCTO
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Caja de archivo','Para guardar archivos',43360,11);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Calculadora ','de escritorio y cientificas',36202,21);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Carpetas escolares y ejecutivas','Permite lleva los documentos',4173,34);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Cartones corrugados',null,30890,48);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Cartucho','Toner',1553,141);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Cartulina','Varios colores y dimensiones',28464,48);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Cinta',null,13988,36);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Clips mariposa y sencillo',null,36875,13);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Colores y plumones',null,32232,45);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Compas',null,14704,17);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Corrector','botella y lapiz',48337,48);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Cosedora','escritorio e industrial',557,18);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Crayón ','escolar e industrial',43154,20);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values (' Caja de matemática','Kit con varias herramientas',14006,45);
INSERT INTO PRODUCTO (NOMBRE_PRODUCTO,DESCRIPCION,PRECIO, DISPONIBLE_VENTA) values ('Cuaderno','argollados y cosidos',12589,48);


-- Tabla VENDEDOR
INSERT INTO VENDEDOR (DOCUMENTO,NOMBRE_COMPLETO,TELEFONO,CORREO) values ('102000','GUILLERMO MARTINEZ VERGARA','5616161','hospitalnere@yahut.com');
INSERT INTO VENDEDOR (DOCUMENTO,NOMBRE_COMPLETO,TELEFONO,CORREO) values ('82096','ALBERTINA RAMOS','5716927','hdtpsalgar@hotmail.com.co');
INSERT INTO VENDEDOR (DOCUMENTO,NOMBRE_COMPLETO,TELEFONO,CORREO) values ('78720','JAINER VITOLA ZABALETA','5413700','lisbethsoto2006@hotmail.con');
INSERT INTO VENDEDOR (DOCUMENTO,NOMBRE_COMPLETO,TELEFONO,CORREO) values ('65945','ZHARICK CASAS CORDOBA','5319638','clofan@epm.net.co');


-- Tabla VENTA
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('19/05/2016','%d/%m/%Y'),1257440,'102000','16451');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('19/05/2016','%d/%m/%Y'),1086060,'82096','18133');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('19/05/2016','%d/%m/%Y'),146055,'78720','12685');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('18/05/2016','%d/%m/%Y'),61780,'65945','17319');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('18/05/2016','%d/%m/%Y'),61780,'102000','16451');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('15/05/2016','%d/%m/%Y'),996240,'102000','18133');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('15/05/2016','%d/%m/%Y'),419640,'102000','18133');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('14/05/2016','%d/%m/%Y'),73750,'82096','17319');
INSERT INTO VENTA (FECHA_VENTA,VALOR_TOTAL,VENDEDOR_DOCUMENTO,CLIENTE_DOCUMENTO_CLIENTE) values (str_to_date('14/05/2016','%d/%m/%Y'),934728,'78720','6166');


-- Tabla PRODUCTO_VENTA
INSERT INTO PRODUCTO_VENTA (PRODUCTO_CODIGO_PRODUCTO, VENTA_CODIGO_VENTA, CANTIDAD) VALUES (10,2,30);
INSERT INTO PRODUCTO_VENTA (PRODUCTO_CODIGO_PRODUCTO, VENTA_CODIGO_VENTA, CANTIDAD) VALUES (1,4,29);
INSERT INTO PRODUCTO_VENTA (PRODUCTO_CODIGO_PRODUCTO, VENTA_CODIGO_VENTA, CANTIDAD) VALUES (6,5,35);
INSERT INTO PRODUCTO_VENTA (PRODUCTO_CODIGO_PRODUCTO, VENTA_CODIGO_VENTA, CANTIDAD) VALUES (5,2,2);
