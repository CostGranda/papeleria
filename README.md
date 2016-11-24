# Papeleria TPA [![Build Status](https://travis-ci.com/CostGranda/papeleria.svg?token=59zMMqtt7WAr7sgLu6st&branch=Web)](https://travis-ci.com/CostGranda/papeleria)

## Descripción general del proyecto


En la papelería TPA necesitan tener un registro permanente de lo que tienen almacenado con sus valores de venta, para tener conocimiento de las ventas del día, al mismo tiempo se desea mantener un reporte de los clientes que compran y productos más comprados.

Del producto se necesita la siguiente información: código, nombre del producto, una descripción, existencia real del producto y su precio
.
Las ventas en la papelería deben estar asociadas a un vendedor y a un comprador, de los cuales se requiere la siguiente información: documento, nombre, teléfono y correo electrónico, este último es opcional para el comprador. Si el cliente no se encuentra registrado se le ofrece la opción de registro y si no lo desea hacer se debe poner por defecto el comprador "anónimo". Adicional a esto, cada venta requiere: código, nombre del vendedor, fecha y valor.

Por requerimiento del diseño, será necesario un módulo para la gestión de empleados y por seguridad el administrador de la papelería es la única persona que tiene los permisos para modificar la base de datos.


### Contenido
El proyecto debe hacer uso de lo siguiente:

* Interfaz gráfica de usuario (GUI).
* Conexión a bases de datos (MySQL) usando AWS.
* Manipulación de URLs.
* Sockets.
* Archivos planos.
* Hilos.

![Image of Yaktocat](http://i.imgur.com/3YVOSU3.png)


| Acción a desarrollar | Competencias a evaluar  | Fecha de entrega | Calificación
| :------------- | :------------ | :------------ | :------------ |
| Avance 1 de Proyecto (5%) |  Programación Orientada a objetos, programación por niveles, aplicación de URL y archivos planos.  |15/09/2016 | 4.7
|Avance 2 de Proyecto (5%)|Programación de hilos y sockets.|11/10/2016| 4.7
|Presentación Practica Final (10%)|Exposición de proyecto, Aplicación de conceptos del curso alproyecto, Funcionalidad del proyecto.| 22/11/2016 | 0.0
