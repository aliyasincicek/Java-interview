package javaInterviewQuestions;

import java.util.Scanner;

public class Java_26_PowerConcept {

	public static void main(String[] args) {
		
		//3^4 = 81
		
		int üs=4;
		int taban=3;
		int sonuc=1;
		
		/*for (int i = 1; i <=4; i++) {
			
			sonuc*=taban;
		}
		*/
		
		while (üs!=0) {
			sonuc*=taban;
			üs--;
			
			
		}
		
		System.out.println(sonuc);

	
}
}