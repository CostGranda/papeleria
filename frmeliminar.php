<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Eliminar</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="css/estilos.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
</head>
<body id="menu2">
	<div class="row">
		<div class="container-fluid list-group">
			<div class="">
				<div class="col-md-2">
					<a class="list-group-item" href="inicio.php"><i class="fa fa-home fa-fw" aria-hidden="true"></i>&nbsp; Lista de productos</a>
					<a class="list-group-item" href="insertar.html"><i class="fa fa-book fa-fw" aria-hidden="true"></i>&nbsp; Insertar</a>
					<a class="list-group-item" href="editar.php"><i class="fa fa-calculator fa-fw" aria-hidden="true"></i>&nbsp; Editar</a>
					<a class="list-group-item" href="frmeliminar.php"><i class="fa fa-calendar-o fa-fw" aria-hidden="true"></i>&nbsp; Eliminar</a>
					<a class="list-group-item" href="index.html"><i class="fa fa-user-o fa-fw" aria-hidden="true"></i>&nbsp; Cerrar sesión</a>
				</div>
				<div class="col-md-10" id="principal">
					<center><h1>Eliminar productos</h1></center>
					<form name="feli" method="GET" action="php/eliminar.php" id="formulario2" class="form-horizontal">
			            <div class="form-group">
			              <div class="col-md-offset-4 col-md-4">
			              <label><input type="hidden" name="" value="">Código: </label>
			              	<input name="txtCod" type="number" min="0" class="form-control" placeholder="Ingrese el código del producto" required>
			            	</div>
			          	</div>
			          	<div class="form-group form-inlines">
			            	<div class="col-md-offset-4 col-md-4">
			                	<label>
			                		<input type="button" value="eliminar" class="btn btn-success" onclick="validar()" value="Eliminar">
			                	</label>
			            	</div>
			          	</div>
					</form>
					<div>
						<article class"col-md-6">	  
						<p>  
							<?php
							include("php/conexion.php");
							function listCh()
							{
								$link = Conectarse();
								$result = mysqli_query($link,"SELECT * FROM PRODUCTO;");
								echo '<table class="table table-bordered table-hover">';
								echo "<tr>";
								echo '<th class="info">'.codigo_producto.'</th>';
								echo '<th class="warning">'.nombre_producto.'</th>';
								echo '<th class="warning">'.descripcion.'</th>';
								echo '<th class="warning">'.precio.'</th>';
								echo '<th class="warning">'.disponible_venta.'</th>';
								echo "</tr>";
								while ($row = mysqli_fetch_row($result)){
									echo "<tr>";
									echo '<td class="info">'.$row[0].'</td>';
									echo '<td class="warning">'.$row[1].'</td>';
									echo '<td class="warning">'.$row[2].'</td>';
									echo '<td class="warning">'.$row[3].'</td>';
									echo '<td class="warning">'.$row[4].'</td>';
									echo "</tr>";
								}
								echo "</table>";
							}
							listCh();
							?>		
						</p>
						</article>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/eliminar.js"></script>
</body>
</html>	