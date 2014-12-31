function changeSituacao(){
	jQuery(function(){
		if($("#situacao").val()=="3"){
			var date = getCurDate();
			$("#dataDemissao").val(date);	
		}
		else{
			$("#dataDemissao").val("");
		}
	});
}

function getCurDate(){
	var date = new Date();
	var day = date.getDate();
	if(day<10) day = "0"+day;
	var month = date.getMonth()+1;
	if(month<10) month = "0"+month;
	var year = date.getFullYear();
	return (year+"-"+month+"-"+day);
}

function changeFontColor(){
	var cor = document.getElementById("corFonte");
	cor = cor.value;
	jQuery(function(){
		$("#exCor").css("color", cor);
	});
}

function changeBackgroundColor(){
	var cor = document.getElementById("corFundo");
	cor = cor.value;
	jQuery(function(){
		$("#exCor").css("background-color", cor);
	});
}

function changePassword(campo1, campo2, idSpan){
	var fPass = document.getElementById(campo1).value;
	
	var id2 = campo2;
	var sPass = document.getElementById(id2).value;
	
	if(fPass != sPass){
		jQuery(function(){
			$("#"+idSpan).css("display","inline-block");
			$("#"+id2).val("");
		});	
	}
	else{
		jQuery(function(){
			$("#"+idSpan).css("display","none");
		});
	}
}

function validarCPF(cpf, spanErro, campo){
	var filtro = /^\d{3}.\d{3}.\d{3}-\d{2}$/i;
	var retorno = true;
	if(!filtro.test(cpf))
	{
		exibeErro();
	}
   
	cpf = remove(cpf, ".");
	cpf = remove(cpf, "-");
	
	if(cpf.length != 11 || cpf == "00000000000" || cpf == "11111111111" ||
		cpf == "22222222222" || cpf == "33333333333" || cpf == "44444444444" ||
		cpf == "55555555555" || cpf == "66666666666" || cpf == "77777777777" ||
		cpf == "88888888888" || cpf == "99999999999")
	{
		exibeErro();
   	}

	soma = 0;
	for(i = 0; i < 9; i++)
	{
		soma += parseInt(cpf.charAt(i)) * (10 - i);
	}
	
	resto = 11 - (soma % 11);
	if(resto == 10 || resto == 11)
	{
		resto = 0;
	}
	if(resto != parseInt(cpf.charAt(9))){
		exibeErro();
	}
	
	soma = 0;
	for(i = 0; i < 10; i ++)
	{
		soma += parseInt(cpf.charAt(i)) * (11 - i);
	}
	resto = 11 - (soma % 11);
	if(resto == 10 || resto == 11)
	{
		resto = 0;
	}
	
	if(resto != parseInt(cpf.charAt(10))){
		exibeErro();
	}
	
	function exibeErro(){
		jQuery(function(){
			$("#"+spanErro).css("display","block");
			$("#"+spanErro).val("");
			$("#"+campo).val("");
		});
		retorno = false;
	}
	
	if(retorno != false){
		jQuery(function(){
			$("#"+spanErro).css("display","none");
			$("#"+spanErro).val("");
		});
		retorno = true;
	}
	
	return retorno;
 }
 
function remove(str, sub) {
	i = str.indexOf(sub);
	r = "";
	if (i == -1) return str;
	{
		r += str.substring(0,i) + remove(str.substring(i + sub.length), sub);
	}
	
	return r;
}

function chaveRegistro()
        {
			var chave=prompt("Chave de Registro");
		
			$.ajax(
		          	{
			           type: 'POST',
		    	       url: '/smarttoll/ajax/chaveRegistro.php',
		        	   data: 
		               { 
		            	'chave':chave,
		               }, 
		    	       success: function(data) 
		        	    {
		            	  alert(data);
		            	},
		         	}
		        );
		}