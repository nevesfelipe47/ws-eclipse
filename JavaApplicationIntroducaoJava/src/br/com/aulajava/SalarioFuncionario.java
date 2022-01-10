package br.com.aulajava;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		float salario, porcentagem;

		System.out.print("Digite o nome: ");
		nome=sc.nextLine();
		
		System.out.print("Informe o salário atual R$: ");
		salario=sc.nextFloat();
		System.out.print("Digite o indice de aumento %:");
		porcentagem = sc.nextFloat();

		salario += salario * porcentagem / 100.0;
		System.out.printf("O salário do(a) "+ nome+" será R$ "+ salario);
	}

}
