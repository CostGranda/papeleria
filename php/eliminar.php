<?php
  error_reporting(E_ALL);
	ini_set('display_errors', '1');
  include("conexion.php");
  function eliminar($cod){
  	$link = Conectarse();
    $q = "select * from PRODUCTO where codigo_producto = '$cod'";
    $r = mysqli_query($link,$q);
    $num = mysqli_num_rows($r);
    if($num == 0)
    {
      print ('<script>alert(\'El producto no existe!\')</script>');
    }else
    {
      $sql = "delete from PRODUCTO where codigo_producto='$cod'";
      mysqli_query($link,$sql);
      header('Location: ../inicio.php');
    }
    mysqli_close($link);
  }
$cod=$_POST['txtCod'];
eliminar($cod);
?>
