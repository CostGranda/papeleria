$(document).on(ready,inicio);

function inicio(){
	$("span.help-block").hide();
	$("$btnvalidar").click(validar);{
		$("#password").parent().parent().attr("class","form-group has-error has-feedback");
		$("#password").parent().children("span").text("Debe ingresar algun caracter").show();
		$("#password").parent().append("<span id='iconotexto' form-control-feedback'></span>");
	  	return false;
	}
}
