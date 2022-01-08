package mixQuestionsArrayForWhile;

import java.util.Scanner;

public class MixQues07_UglyNumber {

	public static void main(String[] args) {
		/*
		 *  Ugly Number:
		​      Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır. 
İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
		​      Test Data: 13​
		    Beklenen çıktı: ugly number  degildir
		​    Test Data: 25
		    Beklenen Çıktı: ugly number
		    
		 */
		
		Scanner scan= new Scanner (System.in);
		System.out.println("0 ve negatif olmayan bir sayi giriniz");
		int input=scan.nextInt();
		
		uglyNumber(input);
		scan.close();
		

		
	}

	private static void uglyNumber(int number) {
		
		int count=0;
		while (number!=1) {
			if (number%2==0) {
				number/=2;
			} else if (number%3==0){
				number/=3;

			}else if(number%5==0){
				number/=5;
				
			}else {
				System.out.println("girdiginiz sayi ugly number degildir");
				count=1;
				break;
			}
			
		}
		if (count==0) {
			System.out.println("girdiginiz sayi ugly number'dır");
			
		}
		
	}

}
