<?php
	error_reporting(E_ALL);
	ini_set('display_errors', '1');
	include("conexion.php");
	include ("buscar.php");
	class insertar{
		static function nuevo($cod, $nom, $desc, $pre, $disp){
			
			if(buscar::existe($cod)){
				print '<b>Producto ya existe </b> <a href = "frmProducto.html">Regresar</a>';
			}else{
				$con = Conectarse();
				$q = "insert into PRODUCTO (codigo_producto, nombre_producto, descripcion, precio, disponible_venta) values ($cod, '$nom', '$desc', $pre, $disp)";
			mysqli_query($con, $q);
				print 'Producto registrado <a href = "./inicio.php">Regresar</a>';
			}//if else
		}//nuevo
	}//class
	$cod = $_GET['txtCod'];
	$nom = $_GET['txtNom'];
	$pre = $_GET['txtPrecio'];
	$disp = $_GET['txtDisponible'];
	$desc = $_GET['txtDescripcion'];
	insertar::nuevo($cod, $nom, $desc, $pre, $disp);
?>