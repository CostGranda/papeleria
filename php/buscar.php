<?php
	include("conexion.php");
	class buscar{
		static function existe($cod){
			$rta = false;
			$con = conexion::Conectarse();
			$q = "select * from producto where codigo = $cod";
			$r = mysql_query ($q, $con);
			if(mysql_num_rows($r) > 0) $rta = true;
			
			mysql_close($con);
			return $rta;
		}//existe
	}//class
?>