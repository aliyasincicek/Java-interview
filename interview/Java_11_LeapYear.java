package javaInterviewQuestions;

import java.util.Scanner;

public class Java_11_LeapYear {

	public static void main(String[] args) {
		
		//Find Leap Year
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Yil giriniz");
		int yil=scan.nextInt();
		
		if (yil%4==0 && yil%100==0 && yil%400==0) {
			System.out.println("artik yil");
		} else if(yil%4==0 && yil%100==0){
			System.out.println("artik yil degildir");

		}
		
	
	}

}
