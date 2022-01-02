package javaInterviewQuestions;



public class Java_20_ReverseNumber {

	public static void main(String[] args) {
		
		// numarayi ters cevirme
		
		int num=4563;
		int reverse=0;
		while (num!=0) {
			int x=num%10;
			reverse=reverse*10+x;
			num/=10;
			
		}
		System.out.println("sayinin tersi "+ reverse);
	}

} 
