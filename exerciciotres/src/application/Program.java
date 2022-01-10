package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AritimeticMedia;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AritimeticMedia media = new AritimeticMedia();

		System.out.print("Enter student name: ");
		media.name = sc.nextLine();
		
		System.out.println("");
		
		System.out.print("Enter student note:");
		media.noteA = sc.nextDouble();
		
		System.out.println("");
		
		System.out.print("Enter student note:");
		media.noteB = sc.nextDouble();
		
		System.out.println("");
		
		System.out.print("Enter student note:");
		media.noteC=sc.nextDouble();
		
		System.out.println("");

		System.out.printf("Final Grade %.2f", media.finalGrade());
		System.out.println("");
		System.out.println(media.result());

		sc.close();
	}

}
