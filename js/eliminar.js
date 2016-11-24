function validar(){
	
	var c= document.feli.txtCod.value;
	
	if(confirm("Seguro desea eliminar "+c)){
		document.feli.submit();
				
	}else{
		return false;
	}
}

