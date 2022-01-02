package javaInterviewQuestions;

import java.util.Scanner;

public class Java_07_CheckNumberEvenOrOdd {

	public static void main(String[] args) {
		
		//Question even or odd number
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift sayidir");
		} else {
			System.out.println("girdiginiz sayi tek sayidir");

		}
		
	
	}

}
