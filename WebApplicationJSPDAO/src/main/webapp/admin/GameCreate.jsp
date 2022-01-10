<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.projetowebjspdao.entity.Game"%>
<jsp:useBean id="gameBean" class="br.com.projetowebjspdao.bean.GameBean"
	scope="session" />
<%
String acaoSalvar = request.getParameter("salvar");
String mensagem = "";
Game game;

if (acaoSalvar != null) {
	game = new Game();
	game.setNome(request.getParameter("txtNome"));
	game.setConsole(request.getParameter("txtConsole"));

	mensagem = gameBean.criar(game);
	out.println("<br> <font color='FF0000'>" + mensagem + "</font>");
}
%>


<script>
	function voltar() {
		location.href = "GameList.jsp";
	}
</script>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/stylegamecreate.css">
<title>Novo Jogo</title>
</head>
<body>
	<div class="cadastro">
		<form method="POST">

			<fieldset>
				<legend>Novo Jogo</legend>
				<table>
					<tr>
						<td><label for="nome">Nome: </label></td>
						<td><input class="insert" type="text" name="txtNome"
							id="nome" required="true" style="text-transform: uppercase;" /></td>
					<tr>
						<td><label for="console">Plataforma: </label></td>
						<td><input class="insert" type="text" name="txtConsole"
							id="console" required="true" size="3" maxlength="6"
							style="text-transform: uppercase;" /></td>
					</tr>
				</table>
				<hr>
				<input class="button" type="submit" value="Salvar" name="salvar">
				<input class="button" type="reset" value="Limpar"> <input
					class="button" type="button" value="Voltar" onClick="voltar()">
			</fieldset>
	</form>
	</div>
</body>
</html>