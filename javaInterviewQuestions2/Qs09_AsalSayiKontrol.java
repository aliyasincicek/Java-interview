package javaInterviewQuestions2;

import java.util.Scanner;

public class Qs09_AsalSayiKontrol {

	public static void main(String[] args) {
		/*
		Q9
		Ask user enter a positive number and check if it is prime or not

		Kullanýcýdan pozitif bir sayý girmesini isteyin ve asal olup olmadýðýný kontrol edin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Asal sayi kontrolu için bir sayý giriniz");
		int prime =scan.nextInt();
		boolean isPrime =true;
		
		for (int i = 2; i < prime; i++) {
			if(prime % i == 0) {
				isPrime = false;
				break;
			}
			
		}
   if (isPrime) {
	   System.out.println("girdiginiz sayi asaldýr");
	
} else {
	System.out.println("girdiginiz sayi Asal Deðildir");

}
   scan.close();
	}

}
