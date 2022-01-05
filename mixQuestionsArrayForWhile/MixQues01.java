package mixQuestionsArrayForWhile;

public class MixQues01 {

	public static void main(String[] args) {
		/*
		 * Sayýnýn Sayý deðerlerinin toplamasýný yapan Java kodu yazýnýz.
		Test Data 34
		Beklenen Çýktý 7
		 */
		//1.yol
		int sayi=34;
		int num1=0;
		int num2=0;
		
		num1=sayi%10;
		sayi/=10;
		num2=sayi%10;
		System.out.println(num1+num2);
		
		// 2.yol
			String str="34";
			String arr[]= str.split("");
			
			String container1=arr[0];
			String container2=arr[1];
			Integer number1=Integer.valueOf(container1);
			Integer number2=Integer.valueOf(container2);
			System.out.println(number1+number2);
			
			
				
				
			
			
			
		}

	}


