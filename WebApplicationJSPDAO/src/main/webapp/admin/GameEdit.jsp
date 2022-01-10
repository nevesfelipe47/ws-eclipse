<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.projetowebjspdao.entity.Game"%>
<jsp:useBean id="gameBean"
	class="br.com.projetowebjspdao.bean.GameBean" scope="session" />


<%
String acaoSalvar = request.getParameter("salvar");
String mensagem = "";
Game game;

//armazenando em variaveis, paramentros recebidos do formulario GameList.jsp

Integer codigo = Integer.parseInt(request.getParameter("gameCodigo"));
String nome = (String) request.getParameter("gameNome");
String console = (String) request.getParameter("gameConsole");


if (acaoSalvar != null) {
	//montando o jogo apartir dos valores do formulario 
	game = new Game();
	game.setCodigo(codigo);
	game.setNome(request.getParameter("txtNome"));
	game.setConsole(request.getParameter("txtConsole"));

	//executa o metodo e retorna a mensagem do servidor... 
	mensagem = gameBean.atualizar(game);
	//exibe a mensagem recebida do servidor... 
	out.println("<br> <font color='FF0000'>" + mensagem + "</font>");

	//verifica se houve atualização dos dados e exibe da mesma forma...

	if (!nome.equals(request.getParameter("txtNome"))) {
		nome = request.getParameter("txtNome");
	}
	if (!console.equals(request.getParameter("txtConsole"))) {
		console = request.getParameter("txtConsole");
	}

}
%>
<script type="text/javascript">
	function voltar() {
		location.href = "GameList.jsp";

	}
</script>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/stylegamecreate.css">
<title>Atualizar Jogo</title>
</head>
<body>
	<form method="POST">
		<div id="Form">
			<fieldset>
				<legend>Atualizar Jogo</legend>
				<table>
					<tr>
						<td><label for="codigo">Cod: </label></td>
						<td><input type="text" name="txtCodigo" id="codigo" size="6"
							disabled="true" value="<%=codigo %>" /></td>
					<tr>
					<tr>
						<td><label for="nome">Nome: </label></td>
						<td><input type="text" name="txtNome" id="nome"
							required="true" style="text-transform: uppercase;" value="<%=nome %>" /></td>
					<tr>
						<td><label for="console">Plataforma: </label></td>
						<td><input type="text" name="txtConsole" id="console" required="true"
							size="3" maxlength="6" style="text-transform: uppercase;"
							value="<%=console %>" /></td>
					</tr>
				</table>
				<hr>
				<input type="submit" value="Salvar" name="salvar"> <input
					type="button" value="Voltar" onClick="voltar()">
			</fieldset>
		</div>
	</form>
</body>
</html>