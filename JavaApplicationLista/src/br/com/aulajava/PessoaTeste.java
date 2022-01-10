package br.com.aulajava;

import java.util.ArrayList;
import java.util.List;

public class PessoaTeste {

	private static List<Pessoa> pessoaList = new ArrayList<Pessoa>();

	public static void main(String[] args) {

		adicionarItensLista();
		listarItensLista();
		pesquisarItemLista(2);
		excluirItemLista(2);
	}
	private static void excluirItemLista (int idPessoa) {
		Integer idItemList = pesquisarItemLista(idPessoa);
		if(idItemList !=null) {
			pessoaList.remove(idItemList.intValue());
			System.out.println("Pessoa excluido com sucesso!");
		}
	}

	private static Integer pesquisarItemLista(int idPessoa) {
		System.out.println("");
		Integer idReturn = null;
		for (int i = 0; i < pessoaList.size(); i++) {
			if (pessoaList.get(i).getId() == idPessoa) {
				System.out.println("Id: " + pessoaList.get(i).getId() + " - Nome: " + pessoaList.get(i).getNome()
						+ " - Endereço: " + pessoaList.get(i).getEndereco());
				idReturn = i;
			}
		}
		System.out.println("Processo de Pesquisa na lista");
		return idReturn;
	}

	/**
	 * método responsavel por leitura itens na lista ....
	 *
	 **/
	private static void listarItensLista() {
		System.out.println("");
		// varrendo a lista de pessoas...
		for (int i = 0; i < pessoaList.size(); i++) {
			// exebindo as informações encontradas em cada pessoa que consta na lista
			System.out.println("Id: " + pessoaList.get(i).getId() + " - Nome: " + pessoaList.get(i).getNome()
					+ " - Endereço: " + pessoaList.get(i).getEndereco());
		}
		System.out.println("Processo de Leitura na lista executada com sucesso....");
	}

	/**
	 * método responsavel por inserir itens na lista ....
	 *
	 **/
	private static void adicionarItensLista() {
		System.out.println("");
		Pessoa pessoaA = new Pessoa();
		Pessoa pessoaB = new Pessoa();

		pessoaA.setId(1);
		pessoaA.setNome("Felipe");
		pessoaA.setEndereco("Rua das Flores, 1900 ");
		pessoaList.add(pessoaA); // inserindo item a lista

		pessoaB.setId(2);
		pessoaB.setNome("Jessica");
		pessoaB.setEndereco("Rua das Andradas, 2810");
		pessoaList.add(pessoaB); // inserindo item a lista

		System.out.println("Processo de Inserção na lista executada com sucesso....");
	}
}
