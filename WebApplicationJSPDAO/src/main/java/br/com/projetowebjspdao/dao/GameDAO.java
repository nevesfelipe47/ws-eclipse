package br.com.projetowebjspdao.dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.projetowebjspdao.entity.Game;
import br.com.projetowebjspdao.utils.Conexao;

public class GameDAO {

	private final Conexao con = new Conexao();
	private String msgExecucao;

	public List<Game> findAll() {
		List<Game> gameList = new ArrayList<>();
		Game game;

		try {
			String sql = "SELECT * FROM games";
			con.conectar();
			ResultSet rs = con.executarConsulta(sql);

			while (rs.next()) {
				game = new Game();
				// preparando o game para ser inserido na lista
				game.setCodigo(rs.getInt(1));
				game.setNome(rs.getString(2));
				game.setConsole(rs.getString(3));
				// populando a lista de games...
				gameList.add(game);
			}
			rs.close();
			rs = null;
			con.desconectar();
			System.out.println("--------------------------------");
		} catch (Exception e) {
			con.desconectar();
			System.out.println("Error " + e);
		}
		return gameList;
	}
	/**
	 * Método utilizado para deletar um game...
	 * 
	 * @param codigo
	 * @return sucessProcess
	 */
	
	public String delete(Integer codigo) {
		String sql = "DELETE FROM games WHERE cd_game = " + codigo;
		con.executarAtualizacao(sql);
		msgExecucao = "Exclusão " + con.getMensagem();
		return msgExecucao;
	}
	
	/**
	 * Método utilizado para inserir uma cidade
	 * 
	 * @param game
	 * @return sucessProcess
	 */
	public String create(Game game) {
		String sql = "INSERT INTO games (nm_game,console_game) "
				+ "VALUES('"+game.getNome().toUpperCase()
				+"','" + game.getConsole().toUpperCase() + "')";
		con.executarAtualizacao(sql);
		msgExecucao = "Cadastro! " + con.getMensagem();
		return msgExecucao;
	}
	
	/**
	 * Método utilizado para atualizar um game
	 * 
	 * @param game
	 * @return sucessProcess
	 * 
	 */
	public String update(Game game) {
		String sql = "UPDATE games SET nm_game = '"
				+ game.getNome().toUpperCase() +"'WHERE cd_game= "+ game.getCodigo();
		con.executarAtualizacao(sql);
		msgExecucao = "Atualização! " + con.getMensagem();
		return msgExecucao;
	}
}
