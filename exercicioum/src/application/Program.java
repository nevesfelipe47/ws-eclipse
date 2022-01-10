package application;

import java.util.Locale;
import java.util.Scanner;

import attributes.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.println("Enter rectangule width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();

		System.out.printf("Area: %.2f%n" , retangulo.areaCalculo());
		System.out.printf("Perimetro: %.2f%n" , retangulo.perimetroCalculo());
		System.out.printf("Diagonal: %.2f%n" ,retangulo.diagonalCalculo());
		sc.close();

	}

}
