jQuery(function(){
	var now = new Date();
	var day = now.getDate();
	day = arrumaDia(day);
	var month = now.getMonth()+1;
	month = arrumaMes(month);
	var year = now.getFullYear();
	var date = year +'-'+month+'-'+day;
	
	function arrumaDia(dia){
		if(dia<10) dia = '0'+dia
                    return(dia);
	}
	
	function arrumaMes(mes){
		if(mes<10) mes = '0'+mes
                    return mes;
	}
	
	function verificaPeriodo(periodo){
		mes = month;
		mes -= periodo;
		ano = year;
		var aux = mes;
		if(mes == 0){
			mes = 1;
		}
		if(mes<0){
			ano -= 1;
			mes = 12;	
			mes += aux;
		}
		return(ano+"-"+arrumaMes(mes)+"-"+day);
	}
	
	$("#periodoBimestral").click(function(){
		$("#dataFim").val(year+"-"+month+"-"+day);
		$("#dataInicio").val(verificaPeriodo(2));
		$("#mes").val("");
	});
	
	$("#periodoTrimestral").click(function(){
		$("#dataFim").val(year+"-"+month+"-"+day);
		$("#dataInicio").val(verificaPeriodo(3));
		$("#mes").val("");
	});
	
	$("#periodoSemestral").click(function(){
		$("#dataFim").val(year+"-"+month+"-"+day);
		$("#dataInicio").val(verificaPeriodo(6));
		$("#mes").val("");
	});
	
	$("#periodoAnual").click(function(){
		$("#dataFim").val(year+"-"+month+"-"+day);
		$("#dataInicio").val(verificaPeriodo(12));
		$("#mes").val("");
	});
	
	$("#periodoLimpar").click(function(){
		$("#dataFim").val("");
		$("#dataInicio").val("");
                $("#mes").val("");
	});
	
	$("#mes").change(function(){
                var mes = $("#mes").val();
		$("#dataInicio").val(year+"-"+arrumaMes(mes)+"-01");
                switch(mes){
                    case "1":
                    case "3":
                    case "5":
                    case "7":
                    case "8":
                    case "10":
                    case "12":
                        $("#dataFim").val(year+"-"+arrumaMes(mes)+"-31");
                        break;
                    case "4":
                    case "6":
                    case "9":
                    case "11":
                        $("#dataFim").val(year+"-"+arrumaMes(mes)+"-30");
                        break;
                    case "2":
                        $("#dataFim").val(year+"-"+arrumaMes(mes)+"-28");
                        break;
                    default:
                        $("#dataFim").val("");
                }
	});	
});