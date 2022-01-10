package application;
import java.util.Scanner;

import entities.Product;

import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); 
		
		System.out.println("Entre product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be add in the stock:");
		int quantity = sc.nextInt();
		product.addProductInStock(quantity) ;
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removes in the stock:");
		quantity = sc.nextInt();
		product.removeProductInStock(quantity) ;
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		sc.close();
	
		
	}

}
