CREATE TABLE CLIENTE
  (
    documento_cliente VARCHAR (15),
    nombre            VARCHAR (40),
    primer_apellido   VARCHAR (40),
    segundo_apellido  VARCHAR (40) ,
    telefono_cli      VARCHAR (15),
    correo            VARCHAR (40)
  );
  

CREATE TABLE PRODUCTO
  (
    codigo_producto  INT (5),
    nombre_producto  VARCHAR (40),
    descripcion      VARCHAR (40) ,
    precio           NUMERIC (10),
    existencia_real  NUMERIC (5),
    disponible_venta NUMERIC (5)
  );
  

CREATE TABLE PRODUCTO_VENTA
  (
    PRODUCTO_codigo_producto INT (5),
    VENTA_codigo_venta       INT (5),
    cantidad                 NUMERIC (2)
  );
  

CREATE TABLE VENDEDOR
  (
    documento               VARCHAR (15),
    nombre                  VARCHAR (40),
    primer_apellido         VARCHAR (40),
    segundo_apellido        VARCHAR (40),
    telefono                VARCHAR (15),
    celular                 VARCHAR (15),
    correo                  VARCHAR (40),
    direccion               VARCHAR (40),
    VENDEDOR_documento_jefe VARCHAR(15)
  );
  

CREATE TABLE VENTA
  (
    codigo_venta              INT (5),
    fecha_venta               DATE,
    valor_total               NUMERIC (10),
    VENDEDOR_documento        VARCHAR (15),
    CLIENTE_documento_cliente VARCHAR (15)
  );

  CREATE TABLE LOGIN
  (
    usuario VARCHAR (15),
    password VARCHAR (40),
    rol VARCHAR (20)
  );
  
