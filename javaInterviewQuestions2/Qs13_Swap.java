package javaInterviewQuestions2;



public class Qs13_Swap {

	public static void main(String[] args) {
		/*Q13
	     Write a Java Program to swap two numbers
	         
	     Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini almasý islemidir.
	     iki yoldan yaptiginiz java kodunu yaziniz.
	     1.Yol: 3. degisken kullanarak
	     2.Yol: 3. degisken kullanmadan */
		
		int first=30;
		int second=20;
		int third=0;
		
		degiskenli(first, second, third);
		degikensiz (first, second);
	}

	private static void degikensiz(int first, int second) {
		first=first-second;
		second=second+first;
		first=second-first;
		System.out.println("first = " + first + "  second = "+ second);
	}

	private static void degiskenli(int first, int second, int third) {
		third=first; first=second; second=third;
		System.out.println("first = " + first + "  second = "+ second);
		
	}

}
