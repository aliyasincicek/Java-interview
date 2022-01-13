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

		Kullan�c�n�n  girdigi sat�r say�s� kadar yar�m piramid sekli yazd�ran bir program create ediniz.


		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		int array []=new int[scan.nextInt()];
		for (int satir = 1; satir <= array.length; satir++) {
			for (int sutun = 1; sutun <= satir; sutun++) { // Ka��nc� sat�r ise o kadar d�nen d�ng�.
				System.out.print("*");	// println yapili�rsa alt alta yaziyor
			}
			System.out.println(); // bir alt satira indiriyor
		}
	}

}
