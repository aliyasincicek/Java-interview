package javaInterviewQuestions;


public class Java_15_FactorialNumber {

	public static void main(String[] args) {
		
		//!5 = 5x4x3x2x1 =120
		//!4 = 4x3x2x1 = 24
	
		int carpim=1;
		int fact=5;
		
		for (int i = 1; i <= fact; i++) {
			carpim*=i;
			
		}
		System.out.println(carpim);
	}

}
