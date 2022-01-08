package mixQuestionsArrayForWhile;

import java.util.Scanner;

public class MixQues08_tersString {

	public static void main(String[] args) {
		/*
		 * Girilen String değerde tersten yazan Java kodunu yazınız.​
		    Test Data:
		    java
		    avaj
		    
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir cumle giriniz");
		String cumle=scan.nextLine();
		StringBuilder sb=new StringBuilder(cumle);
		sb.reverse();
		System.out.println(sb.toString());
		// for loop
		String str="";
		for (int i = cumle.length()-1; i >=0; i--) {
			str+=cumle.charAt(i);
		}
		System.out.println(str);
		scan.close();
	}

}
