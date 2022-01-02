package javaInterviewQuestions;

public class Java_37_LargestNumberUsingForLoop {

	public static void main(String[] args) {
		
		int [] arr = {1,2,57,4,56,3,5,8};
		
		enBykSayi(arr,7);
		System.out.println(enBykSayi(arr,7));
	}

	private static int enBykSayi(int[] arr, int i) {
		int dp;
		for (int j = 0; j < i; j++) {
			for (int j2 = j+1; j2 < i; j2++) {
				if (arr[j]>arr[j2]) { // amaç en buyuk sayiyi j2 nin indeksine yerleþtirme.if'de yapilan iþlem-->  j indeksi j2'den buyukse birbiriyle yer degiþtiriyor  
					 dp=arr[j];       // j2 < i(7) oldugu için j2 son indeksteki 8 sayisina gelemiyor ver en buyuk sayi sondan bir önceki sayiya yerleþtiriliyor
					 arr[j]=arr[j2];  // 
					 arr[j2]=dp;
				}	
			}
			
		}
		return arr[arr.length-2];
		
		
	}

}
