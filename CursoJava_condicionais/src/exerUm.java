import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;

public class exerUm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int number;
		
		number=sc.nextInt();
		
		if (number<0) {
			System.out.println("Numero negativo");
		}
		else if(number >=0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("nada");
		}
		sc.close();
		
	}

}
