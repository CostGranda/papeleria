<?php
	include("conexion.php");
	function nuevo($nom, $desc, $pre, $disp){
		$link = Conectarse();
		$q = "select 1 from PRODUCTO where nombre_producto= $nom;";
		$r = mysqli_query ($link,$q);
			if(mysqli_num_rows($r) > 0){
					print '<b>Producto ya existe </b> <a href = "../Inicio.php">Regresar</a>';
				}else{
					$q1 = "INSERT INTO PRODUCTO(nombre_producto, descripcion, precio, disponible_venta) values ('$nom', '$desc', $pre, $disp);";
					mysqli_query($link,$q1);
				  header('Location: ../inicio.php');
				}//if else
				mysqli_close($link);
			}//nuevo
		$nom = $_GET['txtNom'];
		$desc = $_GET['txtDescripcion'];
		$pre = $_GET['txtPrecio'];
		$disp = $_GET['txtDisponible'];
		nuevo($nom, $desc, $pre, $disp);
?>
