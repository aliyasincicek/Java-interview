package javaInterviewQuestions;

import java.util.Arrays;

public class Java_35_LargestNumberInArrayUsingArrays {

	public static void main(String[] args) {
		
	int arr []= {23,34,45,56,67,3,12,76};
	Arrays.sort(arr);
	System.out.println(arr[arr.length-1]);
	}

}
