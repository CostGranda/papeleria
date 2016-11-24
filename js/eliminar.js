function validar(){
	var c= document.feli.txtCod.value;
	if (c=='') {
		alert('Debe llenar el campo!');
		return false;
	}
	if(confirm("Seguro desea eliminar "+c)){
		document.feli.submit();
	}else{
		return false;
	}
}
