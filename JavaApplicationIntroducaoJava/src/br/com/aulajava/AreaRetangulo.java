package br.com.aulajava;

import java.util.Locale;
import java.util.Scanner;
public class AreaRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Height: ");
		float height = sc.nextFloat();

		System.out.println("Enter the Width: ");
		float width = sc.nextFloat();
		
		float area = height * width;
		System.out.printf("Rectangle area result: %.2f",area);
		
		sc.close();
	}

}
