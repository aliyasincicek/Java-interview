package javaInterviewQuestions;

import java.util.Arrays;

public class Java_38_FindFirstTwoMaxNumberInArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,56,57,5,8};
		enBykİkiSayi(arr);
	}

	private static void enBykİkiSayi(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.println("en buyuk sayi : "+ arr[arr.length-1]);
		System.out.println("en buyuk sayi : "+ arr[arr.length-2]);
	}

	

}
