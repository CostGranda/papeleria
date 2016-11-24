<!DOCTYPE html>
<html lang="es">
<head>
	<script type="text/javascript">
		function mostrarOcultar(id) {
			var e = document.getElementById(id);
			e.style.display = (e.style.display == 'block') ? 'none' : 'block';
		}
	</script>
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
					<a class="list-group-item" href="frmeditar.php"><i class="fa fa-calculator fa-fw" aria-hidden="true"></i>&nbsp; Editar</a>
					<a class="list-group-item" href="frmeliminar.php"><i class="fa fa-calendar-o fa-fw" aria-hidden="true"></i>&nbsp; Eliminar</a>
					<a class="list-group-item" href="index.html"><i class="fa fa-user-o fa-fw" aria-hidden="true"></i>&nbsp; Cerrar sesión</a>
				</div>
				<div class="col-md-10" id="principal">
					<center><h1>Eliminar productos</h1></center>
					<form name="feli" method="POST" action="php/eliminar.php" id="formulario2" class="form-horizontal">
			            <div class="form-group">
			              <div class="col-md-offset-4 col-md-4">
			              <label><input type="hidden" name="" value="">Código: </label>
			              	<input name="txtCod" type="number" min="0" class="form-control" placeholder="Ingrese el código del producto" required>
			            	</div>
			          	</div>
			          	<div class="form-group form-inlines">
			            	<div class="col-md-offset-4 col-md-4">
			                	<label>
			                		<button type="button" value="eliminar" class="btn btn-danger" onclick="validar()">Eliminar</button>
									<button type="button" onclick="javascript:mostrarOcultar('tabla')" class="btn btn-info">Mostrar tabla</button>
									</label>
			            	</div>
			          	</div>
					</form>
					<div id="tabla" style="display:none">
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
								echo '<th class="info">Código</th>';
								echo '<th class="warning">Nombre</th>';
								echo '<th class="warning">Descripción</th>';
								echo '<th class="warning">Precio</th>';
								echo '<th class="warning">Disponible</th>';
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
