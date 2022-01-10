package javaInterviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Qs08_Anagram2 {

	public static void main(String[] args) {
		/*
        Ask user to enter  2 Srtrings.
        If the characters and the numbers of characters of the Strings are same then print "Anagram"
        otherwise, print "Not Anagram" on the console.
        Ignore cases
        For example : "Mary" and "army" and "RAMY" are Anagrams
        Kullan�c�dan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
        karakterleri ve karakter say�lar� ayn�ysa "Anagram" yazd�r�n,   aksi takdirde konsolda "Anagram De�il" yazd�r�n.
        Ornek : "Pide" ve"ED�P" anagram ifadelerdir..
         */
		Scanner scan = new Scanner(System.in);
        System.out.println("2 adet kelime giriniz. 1  kelimeyi girdikten sonra entertusuna basiniz");
        String first = scan.nextLine().toLowerCase(), second = scan.nextLine().toLowerCase();
       
       
        System.out.println( anagram(first, second) ? "Anagram bir ifadedir" : "Anagram De�ildir");
        scan.close();
	}

	private static boolean anagram(String str1, String str2) {
		
		String[] first=str1.split("");
		Arrays.sort(first);
		String [] second=str2.split("");
		Arrays.sort(second);
		
		
		return Arrays.equals(first, second);
		
		
	}

}
