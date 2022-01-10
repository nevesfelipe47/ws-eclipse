import java.util.Scanner;
import java.util.Locale; 

public class ExercDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int x,y;
		
		System.out.println("Digite o valor de X: ");
		x=sc.nextInt();
		System.out.println("Digite o valor de Y: ");
		y=sc.nextInt();
		
		while(x !=0 && y !=0) {
			
			if(x >0 && y>0) {
				System.out.println("primeiro");
			}
			else if (x<0 && y >0 ) {
				System.out.println("segundo");
			}
			else if (x<0 && y<0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			System.out.println("Digite o valor de X: ");
			x=sc.nextInt();
			System.out.println("Digite o valor de Y: ");
			y=sc.nextInt();
			
		}
		
			sc.close();
	}

}
