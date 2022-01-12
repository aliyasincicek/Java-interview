package javaInterviewQuestions2;

import java.util.Scanner;

public class Qs12_StringPalindrom {

	public static void main(String[] args) {
		/*Q12
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .

		Kuulanýcýnýn girdiði bir  String'in PALINDROME olup olmadýðýný kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunuþu da ayný olan cümle
		ornek : Ey edip Adana`da pide ye,  Traþ niçin þart */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("String bir ifade giriniz");
		String str=scan.nextLine();
		
		isPalindrome(str);
		System.out.println(isPalindrome(str));

	}

	private static boolean isPalindrome(String str) {
		
		StringBuilder sb=new StringBuilder(str);
		String str2= sb.reverse().toString();
		boolean kontrol=false;
		
		if (str.equals(str2)) {
			
			kontrol=true;
		}
		return kontrol;
		
		
		
		
		
		
	}

}
