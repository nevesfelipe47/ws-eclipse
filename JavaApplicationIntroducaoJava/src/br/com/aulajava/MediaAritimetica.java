package br.com.aulajava;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritimetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double noteA, noteB;

		System.out.println("Digite a nota A: ");
		noteA = sc.nextDouble();

		System.out.println("Digite a nota B: ");
		noteB = sc.nextDouble();
		
		double average = (noteA + noteB)/2;
		
		System.out.printf("A média do aluno foi: %.2f", average);
		sc.close();
	}

}
