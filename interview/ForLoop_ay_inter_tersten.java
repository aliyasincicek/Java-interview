package interview;

import java.util.Scanner;

public class ForLoop_ay_inter_tersten {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin. 
	    
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
        String str = scan.nextLine();
        
        // Fatih 
        
        
        
        for (int i = str.length()-1 ; i >=0 ; i--) { // length -1 kelimenin son harfidir. yani son indeks. 
            
            System.out.print(str.substring(i,i+1)); // substring(1,5) bir kelimedeki 1.dahil 5. harf hari� yazdir demek. 
                                                    // bunu i yapinca i ve i+1 d�ne d�ne  ta ki s�f�ra(i>=0 dedik) e�itlenene kadar geliyor. 
                                                    // �unku i'nin her seferinde degeri degisiyor
            
        }
scan.close();
	}

}
