package br.com.aulajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroTeste {

	static List<Carro> listaCarro = new ArrayList<Carro>();

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		opcao();

	}

	public static void opcao() {

		while (true) {

			System.out.println("**************");
			System.out.println("1 - INSERIR ");
			System.out.println("2 - LISTAR ");
			System.out.println("3 - PESQUISAR ");
			System.out.println("4 - EXCLUIR ");
			System.out.println("Para encerrar o programa digite 0 ");
			int opcao = ler.nextInt();

			if (opcao == 0) {
				System.out.println("Programa finalizado! ");
				break;
			}

			switch (opcao) {

			case 1:
				inserir();
				break;

			case 2:
				listar();
				break;

			case 3:
				pesquisar();
				break;

			case 4:
				excluir();
				break;

			default:

				System.out.println("Opção inválida! ");
				break;

			}

		}

	}

	public static Carro encontrarCarro(int id) {

		for (Carro carro : listaCarro) {
			if (carro.getId() == id) {
				return carro;
			}
		}
		return null;
	}

	public static void inserir() {

		while (true) {
			int id;

			System.out.println("*****************");
			System.out.println("Cadastro de carro");
			System.out.println("*****************");

			try {
				System.out.println("Digite o id: ");
				id = ler.nextInt();
			} catch (Exception e) {
				System.out.println("Digite um número válido! ");

				ler.nextLine();

				continue;
			}

			Carro carroEncontrado = encontrarCarro(id);

			if (carroEncontrado != null) {

				System.out.println("Carro já cadastrado! ");
				continue;
			}

			ler.nextLine();

			System.out.println("Digite a marca: ");
			String marca = ler.nextLine();

			System.out.println("Digite o modelo: ");
			String modelo = ler.nextLine();

			Carro carro = new Carro(id, marca, modelo);

			listaCarro.add(carro);

			System.out.println("Continuar inserindo? ");
			System.out.println("Informe [S] para sim ou [N]" + "para não: ");

			String opcao = ler.next();

			if (opcao.equalsIgnoreCase("S")) {

				continue;
			} else {
				break;
			}
		}

	}

	public static void listar() {

		System.out.println("Inicializando processo de leitura da lista---- ");

		while (true) {
			System.out.println(listaCarro);

			System.out.println("Deseja listar novamente? ");
			System.out.println("Digite [S] para sim ou [N]" + "para não: ");

			String opcao = ler.next();

			if (opcao.equalsIgnoreCase("S")) {

				continue;
			} else {
				break;
			}

		}
	}

	public static void pesquisar() {

		System.out.println("Inicializando o processo de pesquisar-------- ");

		if (listaCarro.isEmpty()) {
			System.out.println("Lista vazia! ");
			return;
		}

		while (true) {

			System.out.println("Digite o id que deseja pesquisar: ");
			int id = ler.nextInt();

			Carro carroEncontrado = encontrarCarro(id);

			if (carroEncontrado == null) {

				System.out.println("Carro não cadastrado! ");
				continue;
			}

			System.out.println(carroEncontrado);

			System.out.println("Deseja pesquisar novamente? ");
			System.out.println("Digite [S] para sim ou [N]" + "para não: ");

			String opcao = ler.next();

			if (opcao.equalsIgnoreCase("S")) {

				continue;
			} else {
				break;
			}

		}

	}

	public static void excluir() {

		System.out.println("Inicializando o processo de exclusão-------- ");

		while (true) {

			System.out.println("Digite o id que deseja excluir: ");
			int id = ler.nextInt();

			Carro carroEncontrado = encontrarCarro(id);

			if (carroEncontrado == null) {

				System.out.println("Carro não cadastrado! ");
				continue;
			}

			listaCarro.remove(carroEncontrado);

			System.out.println("Carro excluído!! ");
			System.out.println("Lista atualizada: " + listaCarro);

			System.out.println("Deseja pesquisar novamente? ");
			System.out.println("Digite [S] para sim ou [N]" + "para não: ");

			String opcao = ler.next();

			if (opcao.equalsIgnoreCase("S")) {

				continue;
			} else {
				break;
			}

		}

	}

}