package javaInterviewQuestions;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java_36_LargestNumberInArrayUsingCollections {

	public static void main(String[] args) {
		
		Integer [] arr= {1,2,3,45,6,8};
		
		largestArr(arr,5);
		System.out.println(largestArr(arr,5));
		
		
		
	}

	private static int  largestArr(Integer [] arr, int i) {
		
		List<Integer> list= Arrays.asList(arr);
		Collections.sort(list);
		int large=list.get(i);
		return large;
		
	}  

}
