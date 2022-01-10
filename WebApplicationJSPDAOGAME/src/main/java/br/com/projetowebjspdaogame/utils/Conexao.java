package br.com.projetowebjspdaogame.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {

	// variaveis globais de acesso
	private Connection con;
	private Statement s;

	// Dados de conexão
	private final String enderecoFisicoBanco = "jdbc:postgresql://localhost:5432/";
	private final String banco = "DB_AULAPROJETOWEBGAMES";
	private final String usuario = "postgres";
	private final String senha = "admin";
	private String mensagem;

	/**
	 * Método responsavel por abrir conexexão com o banco de dados postgres
	 */
	public void conectar() {
		try {
			if (con == null || con.isClosed()) {
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection(enderecoFisicoBanco + banco, usuario, senha);
				System.out.println("Conexão Aberta...");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}

	/**
	 * Método responsavel por fechar a conexão com o banco de dados postgres
	 */
	public void desconectar() {
		if (con != null) {
			try {
				if (s != null) {
					s.close();
					s = null;
				}
				con.close();
				System.out.println("Conexão Fechada...");
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}
	}

	/**
	 * Método utilizado para executar atualizações : atualizar, deletar, incluir.
	 * 
	 * @param sql
	 * @return
	 */
	public int executarAtualizacao(String sql) {
		mensagem = "Sucesso na execução!";
		try {
			conectar();
			if (s == null) {
				s = con.createStatement();
			}
			// executando sql...
			int rs = s.executeUpdate(sql);
			System.out.println(mensagem);
			desconectar();
			return rs;
		} catch (Exception e) {
			desconectar();
			mensagem = "Erro: " + e;
			System.out.println(mensagem);
		}
		return (0);
	}

	/**
	 * Método utilizado para executar uma consulta passando uma query.
	 * 
	 * @param
	 * @return ResultSet
	 */
	public ResultSet executarConsulta(String sql) {
		mensagem = "Sucesso na execução";
		try {
			if (s == null) {
				s = con.createStatement();
			}
			System.out.println("Executando SQL de consulta.. ");
			// armazena o resultado da consulta...
			ResultSet rs = s.executeQuery(sql);
			return rs;
		} catch (Exception e) {
			mensagem = "Error: " + e;
			System.out.println(mensagem);
		}
		return null;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem){
		this.mensagem = mensagem;
	}
}
