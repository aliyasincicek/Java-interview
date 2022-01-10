package javaInterviewQuestions2;

public class Qs07_Fibonacci {

	public static void main(String[] args) {
		// Fibonacci dizisi create ediniz
		// 0 1 1 2 3 5 8 13 21 34 55
		
		int number1=0;
		int number2=1;
		int sum=0;
		for (int i = 0; i < 10; i++) {
			System.out.print(number1+ " ");
			sum=number1+number2;
			number1=number2;
			number2=sum;
			
		}
		

	}

}
