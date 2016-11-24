$(document).on("ready",inicio);

function inicio(){
	$("span.help-block").hide();
	$("#btnvalidar").click(validar);
}

function validar(){
	alert("Validar");
}