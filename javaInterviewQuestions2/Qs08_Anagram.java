package javaInterviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Qs08_Anagram {

	public static void main(String[] args) {
		 /*
        Ask user to enter  2 Srtrings.
        If the characters and the numbers of characters of the Strings are same then print "Anagram"
        otherwise, print "Not Anagram" on the console.
        Ignore cases
        For example : "Mary" and "army" and "RAMY" are Anagrams
        Kullanýcýdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
        karakterleri ve karakter sayýlarý aynýysa "Anagram" yazdýrýn,   aksi takdirde konsolda "Anagram Deðil" yazdýrýn.
        Ornek : "Pide" ve"EDÝP" anagram ifadelerdir..
         */
		
		    Scanner scan = new Scanner(System.in);
	        System.out.println("1. kelimeyi giriniz");
	        String str=scan.nextLine().toLowerCase();
	        System.out.println("1. kelimeyi giriniz");
	        @SuppressWarnings("unused")
			String str2=scan.nextLine().toLowerCase();
	        
	        String arr1 []=str.split("");
	        String arr2 []= str.split("");
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        if (Arrays.equals(arr1, arr2)) {
	        	System.out.println(str+" anagram bir ifadedir");
				
			} else {
				System.out.println(str+" anagram bir ifade degildir");
			}
	       scan.close(); 
	      
	}

}
