<?php
	$u = $_POST['txtu'];
	$p = $_POST['txtc'];
	$con =  mysqli_connect("mydbinstance.c765otpnmdfd.us-west-2.rds.amazonaws.com", "master", "12345678", "Papeleria");
  $q = "select 1 from LOGIN where usuario='$u' and password='$p'";
  $r = mysqli_query($con,$q);
	$num = mysqli_num_rows($r);
	if($num == 0){
		print ('Usuario no permitido <a href="../index.html">Regresar</a>');
	}else{
		mysqli_free_result($r);
		mysqli_close($con);
		header("location:../inicio.html");
	}
?>