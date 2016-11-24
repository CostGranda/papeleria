<?php
	include("conexion.php");
	function actualizar($cod, $nom, $desc, $pre, $disp){
			$link = Conectarse();
			$q = "update PRODUCTO set nombre_producto = '$nom', descripcion = '$desc', precio = $pre, disponible_venta = $disp where codigo_producto = $cod";
			$r = mysqli_query($link,$q);
			
			if ($r == 0) {
				print ('<script>alert(\'Dato no actualizado!\');location.href="../frmeditar.php";</script>');
			}else{
				print ('<script>alert(\'Dato actualizado!\');location.href="../inicio.php";</script>');
			}
			mysqli_close($link);
		}//actualizar
	$cod = $_GET['txtCod'];
	$nom = $_GET['txtNom'];
	$desc = $_GET['txtDesc'];
	$pre = $_GET['txtPre'];
	$disp = $_GET['txtDisp'];
	actualizar($cod,$nom, $desc, $pre, $disp);
?>