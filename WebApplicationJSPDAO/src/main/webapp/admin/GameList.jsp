<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="gameBean"
	class="br.com.projetowebjspdao.bean.GameBean" scope="session" />

<%
String idExcluir = request.getParameter("idExcluir");
String mensagem = "";

if (idExcluir != null) {
	mensagem = gameBean.deletar(Integer.parseInt(idExcluir));
	out.println("<META HTTP-EQUIV=\"Refresh\" " + "CONTENT=\"0; " + "URL = GameList.jsp \">");
}
%>

<script type="text/javascript">
	function nova() {
		location.href = "GameCreate.jsp";
	}
	function voltar() {
		location.href = "../index.jsp";
	}
</script>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/stylelist.css">
<title>Lista de Jogos</title>
</head>
<body>
<div id="container">
	<form method="POST">
		
			<fieldset>
				<legend>Jogos Cadastrados</legend>
				<table class="tabela">
					<tr>
						<th>COD.</th>
						<th>NOME DO JOGO</th>
						<th>PLATAFORMA</th>
						<th>AÇÃO</th>
					</tr>
					<c:forEach var="game" items="${gameBean.listarTodos() }">
						<tr>
							<!-- imprimindo o conteudo da lista na tabela... -->
							<td><c:out value="${game.codigo}" /></td>
							<td><c:out value="${game.nome}" /></td>
							<td><c:out value="${game.console}" /></td>
							<td><a href="GameList.jsp?idExcluir=${game.codigo}">EXCLUIR | </a>
								<a
								href="GameEdit.jsp?gameCodigo=${game.codigo}&&gameNome=${game.nome}&&gameConsole=${game.console}">EDITAR</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</fieldset>

		<input class="button" type="button" value="Novo" onclick="nova()"> 
		 <input class="button" type="button" value="Voltar"onclick="voltar()">
	</form>
	</div>
</body>
</html>