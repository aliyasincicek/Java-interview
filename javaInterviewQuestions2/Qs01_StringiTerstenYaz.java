package javaInterviewQuestions2;

public class Qs01_StringiTerstenYaz {

	public static void main(String[] args) {
		 /*
        Girilen bir String'i tersten yazdiran bir pr create ediniz
         */
		
		String str="gel dedim gelmedin";
		String rev="";
		for (int i =0 ; i < str.length()-1; i++) {
			rev+=str.charAt(str.length()-i-1);
			
		}
	System.out.println(rev);
	
	 // Reverse String with string builder
	
	StringBuilder sb=new StringBuilder("gel bakalim buraya");
	System.out.println(sb.reverse());
	}

}
