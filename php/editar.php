<?php
error_reporting(E_ALL);
ini_set('display_errors', '1');
include("conexion.php");
function ver($cod){
	$link = Conectarse();
	$q = "select * from PRODUCTO where codigo_producto = $cod;";
	$r = mysqli_query ($link,$q);
	$f = mysqli_fetch_array($r);
	if(mysqli_num_rows($r)){	
		$nomb = $f['nombre_producto'];
		$desc = $f['descripcion'];
		$pre = $f['precio'];
		$disp = $f['disponible_venta'];

		$formu = '<html><head><title> Editar </title></head>';
		$formu = $formu.'<form name = "f1" method = "GET" action = "salvar.php">';
		$formu.='<input type = "text" name="txtCod" value ="'.$cod.'" onlyread>';
		$formu.='<input type = "text" name="txtNom" value ="'.$nomb.'">';
		$formu.='<input type = "text" name="txtDesc" value ="'.$desc.'">';
		$formu.='<input type = "text" name="txtPre" value ="'.$pre.'">';
		$formu.='<input type = "text" name="txtDisp" value ="'.$disp.'">';	
		$formu.='<input type = "submit" value = "Guardar"/>';

		$formu.='</form></body></html>';

		mysqli_close($link);
		print $formu;
	}else{
		print "Código no encontrado";
			}//if else
		}//ver
		$cod = $_GET['txtCod'];
		ver($cod);
		?>