package entities;

public class AritimeticMedia {
	
	public String name;
	public double noteA;
	public double noteB;
	public double noteC;
	
	public double finalGrade() {
		return noteA + noteB + noteC;
	}
	
	public double result() {
		
		if(finalGrade()>=60.00) {
		
		System.out.println("Pass");
			
		}
		else {
			return finalGrade() - 60.00;
		}
		return finalGrade()-60.00;
		
		
		
	}

}
