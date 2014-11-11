<div id="menu">
  	<ul>
	
		<li class='active has-sub'>
		 	<a>Sistema</a>
		   	<ul>
		   	  	<li class='has-sub'><a>Configurações</a>
		   	        <ul>
		   	         	<li><a href="#">Parametros do Sistema</a></li>
		   	        </ul>
		   	   </li>
		   	   <li><a href="logout.jsp">Sair</a></li>
		   </ul>
		</li> 
  
    	<li class='active has-sub'>
	  		<a>Cadastros</a>
	   		<ul>
		   	   	<li class='has-sub'><a>Balcão</a>
		   	      	<ul>
		   	          	<li><a href="Caixas/cadastroCaixa.jsp">Cadastro</a></li>
		   	          	<li><a href="Caixas/consultaCaixa.jsp">Consulta</a></li>	
		   	      	</ul>
		   	   	</li>
		   	   
		   	   	<li class='has-sub'><a>Empresa</a>
		   	       	<ul>
		   	          	<li><a href="Empresa/cadastroEmpresa.jsp">Cadastro</a></li>	
			   	    	<li><a href="Empresa/consultaEmpresa.jsp">Consulta</a></li>
		   	      	</ul>
		   	   	</li>
		   	   
		   	   	<li class='has-sub'><a>Funcionários</a>
		   	       	<ul>
			   	    	<li><a href="Funcionario/cadastroFuncionario.jsp">Cadastro</a></li>
		   	          	<li><a href="Funcionario/consultaFuncionario.jsp">Consulta</a></li>	
		   	      	</ul>
		   	   	</li>
	   	   	</ul>
		</li> 
	
		<li class="active has-sub">
		  	<a>Relacionamentos</a>
		   	<ul>
				<li><a>Boletos</a></li>
				
		   	   	<li class='has-sub'><a>Estados</a>
		   	   		<ul>
		   	   			<a href="/smarttoll/view/cadastros/relacionamentos/Estados/cadastro.php">Cadastro</a>
		   	   			<a href="/smarttoll/view/cadastros/relacionamentos/Estados/consulta.php">Consulta</a>
		   	  		</ul>
		   	  	</li>
		   	  	
		   	  	<li><a href="/smarttoll/view/cadastros/relacionamentos/Isentos/cadastro.php">Isentos</a></li>
		   	  	
		   	  	<li class='has-sub'><a>Municipios</a>
		   	  		<ul>
		   	  			<a href="/smarttoll/view/cadastros/relacionamentos/Municipios/cadastro.php">Cadastro</a>
		   	   			<a href="/smarttoll/view/cadastros/relacionamentos/Municipios/consulta.php">Consulta</a>
		   	  		</ul>
		   	  	</li>
		   	  	
		   	 	<li class='has-sub'><a>Classificações do Pedágio</a>
		   	 		<ul>
		   	 			<a href="/smarttoll/view/cadastros/relacionamentos/Classificacoes/cadastro.php">Cadastro</a>
		   	   			<a href="/smarttoll/view/cadastros/relacionamentos/Classificacoes/consulta.php">Consulta</a>
		   	 		</ul>
		   	 	</li>	
		   	</ul>	
		</li>
	
		<li class='active has-sub'>
	   		<a>Relatórios</a>
		   	<ul>
		   		<li><a href="/smarttoll/view/relatorios/movimentacaoCaixas.php">Movimentações dos Caixas</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/movimentacaoPistaIsenta.php">Movimentações de Pista Isenta</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/discrepanciaEixos.php">Discrepâncias dos Eixos</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/movimentacaoVeiculos.php">Movimentações de Veículos</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/sistema.php">Funcionamento do Sistema</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/semParar.php">Relatório do Sem Parar</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/previsaoValePedagio.php">Previsão Vale-Pedágio</a></li>
		   	   	<li><a href="/smarttoll/view/relatorios/realizadoValePedagio.php">Realizado Vale-Pedágio</a></li>
		   </ul>
		</li> 
	
		<li class='active has-sub'>
	   		<a>Ferramentas</a>
	   		<ul>
	   	   		<li class='has-sub'><a>Grupos de Controle de Acessos</a>
	   	   			<ul>
			   	    	<li><a href="/smarttoll/view/ferramentas/grupoControleAcesso/cadastro.php">Cadastro</a></li>
		   	          	<li><a href="/smarttoll/view/ferramentas/grupoControleAcesso/consulta.php">Consulta</a></li>	
		   	      	</ul>
		   	    </li>
	   	   		<li><a>Módulo de Correção Semparar</a></li>
	   	   		<li><a>Situação dos Caixas</a></li>
	   	   		<li><a>Fechamento de Caixas</a></li>
	   		</ul>
		</li> 
	
		<li class='active has-sub'>
	   		<a>Logs</a>
	   		<ul>
	   	   		<li><a href="Log/Acesso/consultaLogAcesso.jsp">Log de Acesso</a></li>
	   	   		<li><a href="Log/Sistema/consultaLogSistema.jsp">Log do Sistema</a></li>
	   	   		<li><a href="Log/Relatorio/consultaLogRelatorio.jsp">Log de Visualizações de Relatórios</a></li>
	   	   		<li><a href="Log/Reimpressao/consultaLogReimpressao.jsp">Log de Reimpressão de Recibos</a></li>
	   		</ul>
		</li> 
 
		<li class='active has-sub'>
	   		<a>Ajuda</a>
	   		<ul>
	   	   		<li><a  href="/smarttoll/view/ajuda/info.php">Informações do Sistema</a></li>
	   	   		<li><a onClick="chaveRegistro()">Registro</a></li>
	   	   		<li><a>Verificar Alertas</a></li>
	   		</ul>
		</li> 
  	</ul>
</div>
