import java.util.Scanner;
import java.util.Locale;

public class exercTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		
		A=sc.nextInt();
		B=sc.nextInt();
		
		if (A%B==0||B%A==0){
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
	}

}
