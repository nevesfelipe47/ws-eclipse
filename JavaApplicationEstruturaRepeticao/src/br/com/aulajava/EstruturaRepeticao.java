package br.com.aulajava;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticao {
	public static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// somaRepeticao();
		// tabuadaFor();
		// parcelasJuros();
		pesquisaRepeticao();
	}

	private static void somaRepeticao() {
		sc = new Scanner(System.in);
		int num;
		double soma = 0;
		System.out.println("Digite um valor, ou [-1] para sair: ");
		num = sc.nextInt();
		while (num != -1) {
			soma += num;
			System.out.println("Digite um valor, ou [-1] para sair: ");
			num = sc.nextInt();

		}

		System.out.printf("Soma dos valores informados: %.1f", soma);
	}

	private static void tabuadaFor() {
		sc = new Scanner(System.in);
		int n;
		System.out.println("Qual tabuada deseja imprimir: ");
		n = sc.nextInt();
		for (int i = 0; i < 11; i++) {
			int multi = n * i;
			System.out.println(n + " x " + i + " = " + multi);

		}

	}

	private static void parcelasJuros() {
		sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float valorInicial, valorFinal;
		char resp;
		do {
			System.out.println("---------Iniciar Operação------------");
			System.out.print("Informe o valor da compra R$: ");
			valorInicial = sc.nextFloat();
			int parcelas;

			System.out.print("Informe a quantidade de parcelas entre 2 e 12: ");
			parcelas = sc.nextInt();

			while (parcelas < 2 || parcelas > 12) {
				System.out.print("Informe a quantidade de parcelas entre 2 e 12: ");
				parcelas = sc.nextInt();

			}
			System.out.println("------Resultado----------");
			System.out.println("Valor da Compra R$: " + valorInicial);
			int porcentagem;

			if (parcelas >= 6 && parcelas <= 12) {
				porcentagem = 10;
				valorFinal = valorInicial + (valorInicial * porcentagem) / 100;
			} else {
				porcentagem = 5;
				valorFinal = valorInicial + (valorInicial * porcentagem) / 100;
			}

			float valorParcela = valorFinal / parcelas;
			float valorJuros = valorFinal - valorInicial;
			System.out.println("-------Parcelas---------");
			System.out.println("Valor da parcela R$: " + valorParcela);
			System.out.println("Taxa de juro aplicado: " + porcentagem + "%");
			System.out.println("Valor do juros R$ " + valorJuros);
			System.out.println("Valor Total R$ " + valorFinal);
			System.out.println("------------Fim Operação --------------");

			System.out.println("Informe [s] para repetir ou [n] para sair: ");
			resp = sc.next().charAt(0);
		} while (resp == 's');
 	}

	private static void pesquisaRepeticao() {
		sc = new Scanner(System.in);
		double salario, mediaSalario, mediaFilhos;
		int countHab = 0;
		int countSalario = 0;
		int qtdFilhos;
		double somaSalario = 0;
		double somaFilhos = 0;
		double maiorSalario = 0;
		char resp;
		do {

			countHab++;
			System.out.println("========HABITANTE "+countHab+"===========");
			System.out.print("Qual o Salario R$: ");
			salario = sc.nextDouble();
			somaSalario += salario;

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario < 1500) {
				countSalario++;
			}
			
			System.out.print("Quantidade de Filhos: ");
			qtdFilhos = sc.nextInt();
			somaFilhos += qtdFilhos;

			System.out.println("Informe [s] para repetir a operação ou [n] para sair:");
			resp = sc.next().charAt(0);
			//System.out.println("contador: " + countHab);
		} while (resp == 's');
		mediaFilhos = somaFilhos / countHab;
		mediaSalario = somaSalario / countHab;
		System.out.println("==========================================================");
		System.out.println("===========Resultado da Pesquisa==========================");
		System.out.println("Quantidade de habitantes: " + countHab);
		System.out.println("Média do numero de filhos por habitantes: " + mediaFilhos);
		System.out.println("Média Salarial: " + mediaSalario);
		System.out.println("Quantidade de pessoas com salário menor que R$ 1.500: qtd " + countSalario);
		System.out.println("Maior Salario digitado: " + maiorSalario);
	}
}
