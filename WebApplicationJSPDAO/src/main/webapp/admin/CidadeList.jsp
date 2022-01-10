<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cidadeBean"
	class="br.com.projetowebjspdao.bean.CidadeBean" scope="session" />

<%
String idExcluir = request.getParameter("idExcluir");
String mensagem = "";

if (idExcluir != null) {
	mensagem = cidadeBean.deletar(Integer.parseInt(idExcluir));
	out.println("<META HTTP-EQUIV=\"Refresh\" " + "CONTENT=\"0; " + "URL = CidadeList.jsp \">");
}
%>

<script type="text/javascript">
	function nova() {
		location.href = "CidadeCreate.jsp";
	}
	function voltar() {
		location.href = "../index.jsp";
	}
</script>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/style.css">
<title>Lista de Cidades</title>
</head>
<body>
	<form method="POST">
		<div id="cadastro">
			<fieldset>
				<legend>Cidades Cadastradas</legend>
				<table border="1">
					<tr>
						<td>COD.</td>
						<td>DESCRIÇÃO</td>
						<td>UF</td>
						<td>AÇÃO</td>
					</tr>
					<c:forEach var="cidade" items="${cidadeBean.listarTodos() }">
						<tr>
							<!-- imprimindo o conteudo da lista na tabela... -->
							<td><c:out value="${cidade.codigo}" /></td>
							<td><c:out value="${cidade.descricao}" /></td>
							<td><c:out value="${cidade.uf}" /></td>
							<td><a href="CidadeList.jsp?idExcluir=${cidade.codigo}">EXCLUIR | </a>
								<a
								href="CidadeEdit.jsp?cidCodigo=${cidade.codigo}&&cidDescricao=${cidade.descricao}&&cidUF=${cidade.uf}"> EDITAR</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</fieldset>
		</div>
		<hr />
		<input type="button" value="Novo" onclick="nova()"> 
		 <input type="button" value="Voltar"onclick="voltar()">
	</form>
</body>
</html>