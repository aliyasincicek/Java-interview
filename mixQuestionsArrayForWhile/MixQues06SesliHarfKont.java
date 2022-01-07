package mixQuestionsArrayForWhile;

import java.util.Scanner;

public class MixQues06SesliHarfKont {

	public static void main(String[] args) {
		 /* Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
         değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
          1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
​ Sesli harfler: a,e,i,o,u
​Test Data:a
​ Beklenen Çıktı:
  a harfi sesli harfdir.
  Test Data:d
​  Beklenen Çıktı:  d harfi sesiz harftir.
  Test Data:
  we  yada %
  Beklenen Çıktı:
  Yanlis karakter girdiniz!
    ************************************************************************/
		Scanner scan= new Scanner (System.in);
		System.out.println("harf gir beybisi"); 
		String str=scan.next();
		String sesli="a,e,i,o,u";
		String sessiz="bcdfghjklmnprstvyzxqw";
		if (sesli.contains(str)) {
			System.out.println(str+" harfi sesli harfdir");
			
		} else if(sessiz.contains(str)) {
			System.out.println(str+" harfi sessiz harfdir");

		}else {
			System.out.println("Agam eylenii benle");
		}
scan.close();
	}

}
