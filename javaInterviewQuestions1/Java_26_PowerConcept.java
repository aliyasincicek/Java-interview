package javaInterviewQuestions;

import java.util.Scanner;

public class Java_26_PowerConcept {

	public static void main(String[] args) {
		
		//3^4 = 81
		
		int �s=4;
		int taban=3;
		int sonuc=1;
		
		/*for (int i = 1; i <=4; i++) {
			
			sonuc*=taban;
		}
		*/
		
		while (�s!=0) {
			sonuc*=taban;
			�s--;
			
			
		}
		
		System.out.println(sonuc);

	
}
}