<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="br.com.projetowebjspdao.entity.Cidade"%>
<jsp:useBean id="cidadeBean"
	class="br.com.projetowebjspdao.bean.CidadeBean" scope="session" />
<%
String acaoSalvar = request.getParameter("salvar");
String mensagem = "";
Cidade cidade;

if (acaoSalvar != null) {
	cidade = new Cidade();
	cidade.setDescricao(request.getParameter("txtDescricao"));
	cidade.setUf(request.getParameter("txtUF"));

	mensagem = cidadeBean.criar(cidade);
	out.println("<br> <font color='FF0000'>" + mensagem + "</font>");
}
%>


<script>
	function voltar() {
		location.href = "CidadeList.jsp";
	}
</script>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/stylegamecreate.css">
<title>Nova Cidade</title>
</head>
<body>
<div class="cadastro">
	<form method="POST">
		<div id="cadastro">
			<fieldset>
				<legend>Nova Cidade</legend>
				<table>
					<tr>
						<td><label for="descricao">Descrição: </label></td>
						<td><input type="text" name="txtDescricao" id="descricao"
							required="true" style="text-transform: uppercase;" /></td>
					<tr>
						<td><label for="uf">UF: </label></td>
						<td><input type="text" name="txtUF" id="uf" required="true"
							size="2" maxlength="2" style="text-transform: uppercase;" /></td>
					</tr>
				</table>
				<hr>
				<input type="submit" value="Salvar" name="salvar"> <input
					type="reset" value="Limpar"> <input type="button"
					value="Voltar" onClick="voltar()">
			</fieldset>
		</div>
	</form>
	</div>
</body>
</html>