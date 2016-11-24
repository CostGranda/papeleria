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
		$formu = $formu.'<link rel="stylesheet" href="../css/estilos.css">';
		$formu = $formu.'<link rel="stylesheet" href="../css/bootstrap.min.css">';
		$formu = $formu.'<body id="menu2">';
		$formu = $formu.'<form name = "f1" method = "GET" action = "salvar.php" class="form-horizontal">';
		$formu = $formu.'<div class="form-group">';
		$formu = $formu.'<div class="col-md-offset-4 col-md-4">';
		$formu = $formu.'<label><input type="hidden" name="" value="">Código: </label>';
		$formu.='<input type = "text" name="txtCod" value ="'.$cod.'" onlyread>';
		$formu = $formu.'</div></div>';
		$formu = $formu.'<div class="form-group">';
		$formu = $formu.'<div class="col-md-offset-4 col-md-4">';
		$formu = $formu.'<label><input type="hidden" name="" value="">Nombre: </label>';
		$formu.='<input type = "text" name="txtNom" value ="'.$nomb.'">';
		$formu = $formu.'</div></div>';
		$formu = $formu.'<div class="form-group">';
		$formu = $formu.'<div class="col-md-offset-4 col-md-4">';
		$formu = $formu.'<label><input type="hidden" name="" value="">Precio: </label>';
		$formu.='<input type = "text" name="txtPre" value ="'.$pre.'">';
		$formu = $formu.'</div></div>';
		$formu = $formu.'<div class="form-group">';
		$formu = $formu.'<div class="col-md-offset-4 col-md-4">';
		$formu = $formu.'<label><input type="hidden" name="" value="">Disponible: </label>';
		$formu.='<input type = "text" name="txtDisp" value ="'.$disp.'">';
		$formu = $formu.'</div></div>';
		$formu = $formu.'<div class="form-group">';
		$formu = $formu.'<div class="col-md-offset-4 col-md-4">';
		$formu = $formu.'<label><input type="hidden" name="" value="">Descripción: </label>';
		$formu.='<textarea name="txtDesc" cols="36" rows="5" value="">'.$desc.'</textarea>';
		$formu = $formu.'</div></div>';
		$formu = $formu.'<div class="form-group">';
		$formu = $formu.'<div class="col-md-offset-4 col-md-4">';	
		$formu.='<input type = "submit" class="btn btn-success" value = "Guardar"/>';
		$formu = $formu.'</div></div>';
		$formu.='</form>';
		$formu.='<script type="text/javascript" src="../js/jquery.js"></script>';
		$formu.='<script type="text/javascript" src="../js/bootstrap.min.js"></script>';
		$formu.='</body></html>';

		mysqli_close($link);
		print $formu;
	}else{
		print "Código no encontrado";
			}//if else
		}//ver
		$cod = $_GET['txtCod'];
		ver($cod);
		?>