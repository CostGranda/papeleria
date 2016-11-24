<?php
	include("conexion.php");
	function actualizar($cod, $nom, $desc, $pre, $disp){
			$link = Conectarse();
			$q = "update PRODUCTO set nombre_producto = '$nom', descripcion = '$desc', precio = $pre, disponible_venta = $disp where codigo_producto = $cod";
			mysqli_query($link,$q);
			mysqli_close($link);
			print $q;
			print 'Dato actualizado';
			print ('Producto No existe <a href="../inicio.php">Regresar</a>');
		}//actualizar
	$cod = $_GET['txtCod'];
	$nom = $_GET['txtNom'];
	$desc = $_GET['txtDesc'];
	$pre = $_GET['txtPre'];
	$disp = $_GET['txtDisp'];
	actualizar($cod,$nom, $desc, $pre, $disp);
?>