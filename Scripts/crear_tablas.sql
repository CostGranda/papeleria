DROP TABLE PRODUCTO_VENTA;
DROP TABLE VENTA;
DROP TABLE CLIENTE;
DROP TABLE PRODUCTO;
DROP TABLE VENDEDOR;

CREATE TABLE CLIENTE
  (
    documento_cliente VARCHAR2 (15),
    nombre            VARCHAR2 (40),
    primer_apellido   VARCHAR2 (40),
    segundo_apellido  VARCHAR2 (40) ,
    telefono_cli      VARCHAR2 (15),
    correo            VARCHAR2 (40)
  )
  tablespace ts_compratodo;

CREATE TABLE PRODUCTO
  (
    codigo_producto  NUMBER (5),
    nombre_producto  VARCHAR2 (40),
    descripcion      VARCHAR2 (40) ,
    precio           NUMBER (10),
    existencia_real  NUMBER (5),
    disponible_venta NUMBER (5)
  )
  tablespace ts_compratodo;


CREATE TABLE PRODUCTO_VENTA
  (
    PRODUCTO_codigo_producto NUMBER (5),
    VENTA_codigo_venta       NUMBER (5),
    cantidad                 NUMBER (2)
  )
  tablespace ts_compratodo;



CREATE TABLE VENDEDOR
  (
    documento               VARCHAR2 (15),
    nombre                  VARCHAR2 (40),
    primer_apellido         VARCHAR2 (40),
    segundo_apellido        VARCHAR2 (40),
    telefono                VARCHAR2 (15),
    celular                 VARCHAR2 (15),
    correo                  VARCHAR2 (40),
    direccion               VARCHAR2 (40),
    VENDEDOR_documento_jefe VARCHAR2 (15)
  )
  tablespace ts_compratodo;

CREATE TABLE VENTA
  (
    codigo_venta              NUMBER (5),
    fecha_venta               DATE,
    valor_total               NUMBER (10),
    VENDEDOR_documento        VARCHAR2 (15),
    CLIENTE_documento_cliente VARCHAR2 (15)
  )
  tablespace ts_compratodo;
