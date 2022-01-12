package javaInterviewQuestions2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Qs11_ArrayEnBykEnKcFarki {

	public static void main(String[] args) {
		/*Q11
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanýcýnýn girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanýnýn  farkýný bulan bir method create ediniz.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("arrayin uzunlugunu giriniz");
		int length=scan.nextInt();
		int [] array=new int[length];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("lutfen array ekleyiniz "+ ( i+1)+ ". eleman");
			array[i] =scan.nextInt();
			
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("en buyuk elemani ile en kucuk elemanýnýn  farký " + (array[array.length-1]-array[0]) );
		scan.close();

	}

}
