package br.com.projetowebjspdao.bean;

import br.com.projetowebjspdao.dao.CidadeDAO;
import br.com.projetowebjspdao.entity.Cidade;

import java.util.List;

public class CidadeBean {
	private CidadeDAO cidadeDao = new CidadeDAO();
	private Cidade cidade = new Cidade();

	public String criar(Cidade cid) {
		return cidadeDao.create(cid);
	}

	public List<Cidade> listarTodos() {
		return cidadeDao.findAll();
	}

	public String deletar(Integer codigo) {
		return cidadeDao.delete(codigo);
	}

	public String atualizar(Cidade cid) {
		return cidadeDao.update(cid);
	}

	public CidadeDAO getCidadeDao() {
		return cidadeDao;
	}
	public void setCidadeDao(CidadeDAO cidadeDao) {
		this.cidadeDao = cidadeDao;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
