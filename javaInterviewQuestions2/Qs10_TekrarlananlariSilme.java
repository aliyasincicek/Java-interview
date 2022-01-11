package javaInterviewQuestions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qs10_TekrarlananlariSilme {

	public static void main(String[] args) {
		/*Q10
        Create  a list by getting the list elements from user
        if there is duplicated elements remove them from the list.
​
        Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
        */
		Scanner scan = new Scanner(System.in);
		List<Integer> listInput = new ArrayList<Integer>();
		List<Integer> listTekrarsiz = new ArrayList<Integer>();
		System.out.print("Listeye eklemek istedikleriniz sayilari giriniz\nGirisi bitirmek icin Q giriniz : ");
		
		String cikis="";
		do {
			if (scan.hasNextInt()) { // hasNextInt metodu boolean deger döndürür. 
				int giris=scan.nextInt();
				listInput.add(giris);
				if (!listTekrarsiz.contains(giris)) {
					listTekrarsiz.add(giris);
				}
					
				
			} else {
				cikis="Q";
			}
			
		} while (!cikis.equalsIgnoreCase("Q"));
		
		System.out.println("girdiginiz liste: "+ listInput.toString()+ "Tekrarsiz liste"+ listTekrarsiz.toString());
scan.close();
	}

}
