function validar(){
	var Cod = document.formIns.txtCod.value;
	var Nom = document.formIns.txtNom.value;
	var Pre = document.formIns.txtPrecio.value;
	var Disp = document.formIns.txtDisponible.value;
	var es = document.getElementById("escondido");
	
	if(Cod=="" || Nom=="" || Pre=="" || Disp==""){
		es.innerHTML="Faltan Datos";
	}else {
		//isNaN();
		document.formIns.submit();
	}	
}

// function limpiar(){
// 	document.getElementsByName("txtN1")[0].value = "";
// 	document.getElementsByName("txtN2")[0].value = "";
// 	document.getElementsByName("txtOp")[0].value = "";
// }