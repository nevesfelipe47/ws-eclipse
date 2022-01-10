import java.util.Scanner;

public class ExercTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		 
		
		int countA,countG,countD,alcool,gasolina,disel,escolha;
		
		countA =0;
		countG =0;
		countD =0;
		
		while(true) {

			System.out.println("Digite sua escolha: ");
			escolha =sc.nextInt();
			
			if (escolha == 1) {
				countA++;
			}
			else if (escolha ==2 ) {
				countG ++;
			}
			else if (escolha == 3) {
				countD ++;
			}
			else if (escolha ==4) {
				System.out.println("Fim");
				break;
			}
			else {
				System.out.println("Opção Invalida!");
				continue;
			}
		}
		System.out.println("Muito Obrigada!");
		System.out.println("Alcool: "+countA);
		System.out.println("Gasolina: "+countG);
		System.out.println("Disel: "+countD);
	}

}
