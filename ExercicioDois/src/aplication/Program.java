package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		// Aqui usuario coloca o nome
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		// Aqui usuario coloca o salario bruto
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		// Aqui o usuario coloca a taxa de imposto
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.printf("Employee: " + employee);
		System.out.println("");
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.printf("Update: " + employee);

		sc.close();

	}

}
