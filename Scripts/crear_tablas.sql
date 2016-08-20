DROP TABLE PRODUCTO_VENTA;
DROP TABLE VENTA;
DROP TABLE CLIENTE;
DROP TABLE PRODUCTO;
DROP TABLE VENDEDOR;

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
    codigo_producto  numeric (5),
    nombre_producto  VARCHAR (40),
    descripcion      VARCHAR (40) ,
    precio           numeric (10),
    existencia_real  numeric (5),
    disponible_venta numeric (5)
  );
  


CREATE TABLE PRODUCTO_VENTA
  (
    PRODUCTO_codigo_producto numeric (5),
    VENTA_codigo_venta       numeric (5),
    cantidad                 numeric (2)
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
    codigo_venta              numeric (5),
    fecha_venta               DATE,
    valor_total               numeric (10),
    VENDEDOR_documento        VARCHAR (15),
    CLIENTE_documento_cliente VARCHAR (15)
  );
  
