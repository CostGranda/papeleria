
<?php
  function Conectarse()
  {
   if (!($link=mysqli_connect('mydbinstance.c765otpnmdfd.us-west-2.rds.amazonaws.com', 'master', '12345678', 'Papeleria')))
   {
      echo "Error conectando a la base de datos.";
      exit();
   }
   if (!mysqli_select_db($link,"Papeleria"))
   {
      echo "Error seleccionando la base de datos.";
      exit();
   }
   mysqli_set_charset($link, "utf8");
   return $link;
  }
?>
