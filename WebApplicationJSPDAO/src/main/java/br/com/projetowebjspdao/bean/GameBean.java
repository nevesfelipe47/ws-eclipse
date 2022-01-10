package br.com.projetowebjspdao.bean;


import br.com.projetowebjspdao.entity.Game;
import br.com.projetowebjspdao.dao.GameDAO;

import java.util.List;

public class GameBean {
	private GameDAO gameDao = new GameDAO();
	private Game game = new Game();

	public String criar(Game game) {
		return gameDao.create(game);
	}

	public List<Game> listarTodos() {
		return gameDao.findAll();
	}

	public String deletar(Integer codigo) {
		return gameDao.delete(codigo);
	}

	public String atualizar(Game game) {
		return gameDao.update(game);
	}

	public GameDAO getGameDao() {
		return gameDao;
	}
	public void setGameDao(GameDAO gameDao) {
		this.gameDao = gameDao;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
}
