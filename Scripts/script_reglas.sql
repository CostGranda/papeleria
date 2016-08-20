# Claves primarias de las tablas
ALTER TABLE CLIENTE ADD CONSTRAINT PK_CLIENTE PRIMARY KEY ( documento_cliente ) ;
ALTER TABLE PRODUCTO ADD CONSTRAINT PK_PRODUCTO PRIMARY KEY ( codigo_producto ) ;
ALTER TABLE PRODUCTO MODIFY COLUMN codigo_producto INT auto_increment ;
ALTER TABLE PRODUCTO_VENTA ADD CONSTRAINT PK_producto_venta PRIMARY KEY ( PRODUCTO_codigo_producto, VENTA_codigo_venta ) ;
ALTER TABLE VENDEDOR ADD CONSTRAINT PK_VENDEDOR PRIMARY KEY ( documento ) ;
ALTER TABLE VENTA ADD CONSTRAINT PK_VENTA PRIMARY KEY ( codigo_venta ) ;
ALTER TABLE VENTA MODIFY COLUMN codigo_venta INT auto_increment ;
ALTER TABLE LOGIN ADD CONSTRAINT PK_LOGIN PRIMARY KEY ( usuario );


#Se define las claves foráneas o relaciones entre las tablas
ALTER TABLE PRODUCTO_VENTA ADD CONSTRAINT FK_PRODUCTO_codigo_productov2 FOREIGN KEY ( PRODUCTO_codigo_producto ) REFERENCES PRODUCTO ( codigo_producto ) ;

ALTER TABLE VENDEDOR ADD CONSTRAINT FK_VENDEDOR_VENDEDOR FOREIGN KEY ( VENDEDOR_documento_jefe ) REFERENCES VENDEDOR ( documento ) ;

ALTER TABLE VENTA ADD CONSTRAINT FK_VENTA_CLIENTE FOREIGN KEY ( CLIENTE_documento_cliente ) REFERENCES CLIENTE ( documento_cliente ) ;

ALTER TABLE VENTA ADD CONSTRAINT FK_VENTA_VENDEDOR FOREIGN KEY ( VENDEDOR_documento ) REFERENCES VENDEDOR ( documento ) ;

ALTER TABLE PRODUCTO_VENTA ADD CONSTRAINT FK_VENTA_codigo_venta FOREIGN KEY ( VENTA_codigo_venta ) REFERENCES VENTA ( codigo_venta ) ;

#Se definen las reglas o contraints necesarias
#Tabla Cliente
ALTER TABLE CLIENTE ADD CONSTRAINT NN_nombre_cliente CHECK (nombre IS NOT NULL);
ALTER TABLE CLIENTE ADD CONSTRAINT NN_primer_apellido_cliente CHECK (primer_apellido IS NOT NULL);
ALTER TABLE CLIENTE ADD CONSTRAINT NN_telefono_cliente CHECK (telefono_cli IS NOT NULL);

#Tabla Producto
ALTER TABLE PRODUCTO ADD CONSTRAINT NN_nombre_producto CHECK (nombre_producto IS NOT NULL);
ALTER TABLE PRODUCTO ADD CONSTRAINT NN_precio_producto CHECK (precio > 0);
ALTER TABLE PRODUCTO ADD CONSTRAINT NN_existencia_real_producto CHECK (existencia_real >= 0);
ALTER TABLE PRODUCTO ADD CONSTRAINT NN_disponible_venta CHECK (disponible_venta >=0);

#Tabla PRODUCTO_VENTA
ALTER TABLE PRODUCTO_VENTA ADD CONSTRAINT NN_cantidad_PRODUCTO_VENTA CHECK ( cantidad > 0);

#Tabla VENDEDOR
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_nombre_vendedor CHECK ( nombre IS NOT NULL);
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_primer_apellido_vendedor CHECK ( primer_apellido IS NOT NULL);
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_telefono_vendedor CHECK ( telefono IS NOT NULL);
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_celular_vendedor CHECK ( celular IS NOT NULL);
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_correo_vendedor CHECK ( correo IS NOT NULL);
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_direccion_vendedor CHECK ( direccion IS NOT NULL);
ALTER TABLE VENDEDOR ADD CONSTRAINT NN_VENDEDOR_documento_jefe CHECK ( VENDEDOR_documento_jefe IS NOT NULL);

#Tabla VENTA
ALTER TABLE VENTA ADD CONSTRAINT NN_fecha_venta CHECK (fecha_venta IS NOT NULL );
ALTER TABLE VENTA ADD CONSTRAINT NN_valor_total_venta CHECK (valor_total > 0 );
ALTER TABLE VENTA ADD CONSTRAINT NN_VENDEDOR_documento_venta CHECK (VENDEDOR_documento IS NOT NULL );
ALTER TABLE VENTA ADD CONSTRAINT NN_CLIENTE_documento_venta CHECK (CLIENTE_documento_cliente IS NOT NULL );

#Tabla LOGIN
ALTER TABLE LOGIN ADD CONSTRAINT NN_password CHECK (password IS NOT NULL );
ALTER TABLE LOGIN ADD CONSTRAINT NN_rol CHECK (rol IS NOT NULL );
