package JavaInterviewQuestions;

import java.util.Scanner;

public class Iw04 {

	public static void main(String[] args) {
		 // Soru 8 ) Interview Question Kullanicidan bir String isteyin 
        //          ve Stringi tersine ceviren bir method yazin.
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
        String str = scan.nextLine();
        
        // tersineCevir(str); method call yaptýk
        // Fatih 
        
        System.out.println(tersineCevir(str));
        scan.close();
    }
    public static String tersineCevir(String str) {
        String tersStr=""; // boþ bir variable oluþturuyoruz ki tersine cevirecegimiz yazinin harfleri tersten gelmeye baþladýkça saklanabilsin
        
        for (int i = str.length()-1; i >=0; i--) {
            
            
            tersStr+=str.substring(i, i+1); // substring harfleri tek tek alip saklama kabimiza 
                                             //yani tersStr'a ekledigi eþitledigi icin + koyuyoruz. 
                                             //C02'deki örnekte method olmadigi icin saklama kabina gerek duyulmadi.
            
        }
        
        
        return tersStr; // return bize tersStr geri döndürüyor. ilk baþta return null yapmýstik
	}

}
