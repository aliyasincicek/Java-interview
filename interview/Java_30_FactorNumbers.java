package javaInterviewQuestions;

public class Java_30_FactorNumbers {

	public static void main(String[] args) {
		
		// tam bölen sayilar
		
		int number = 66;
System.out.println(number+" sayisinin tam bolenleri");
       for (int i = 1; i <=number; i++) {
    	   if (number%i==0) {
    		   System.out.print(i +" ");
			
		}
    	   
		
	}
	}
}
