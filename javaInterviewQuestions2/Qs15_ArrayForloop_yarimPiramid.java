package javaInterviewQuestions2;

import java.util.Scanner;

public class Qs15_ArrayForloop_yarimPiramid {

	public static void main(String[] args) {
		/*
		Q15

		Ask user to enter the number of lines of a half pyramid.
		Type a program to create the half pyramid.
		For exampleif the number of lines is 5, the pyramid will be  like;
		*
		* *
		* * *
		* * * *
		* * * * *

		Kullanýcýnýn  girdigi satýr sayýsý kadar yarým piramid sekli yazdýran bir program create ediniz.


		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int array []=new int[scan.nextInt()];
		for (int satir = 1; satir <= array.length; satir++) {
			for (int sutun = 1; sutun <= satir; sutun++) { // Kaçýncý satýr ise o kadar dönen döngü.
				System.out.print("*");	// println yapiliýrsa alt alta yaziyor
			}
			System.out.println(); // bir alt satira indiriyor
		}
	}

}
