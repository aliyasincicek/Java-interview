package mixQuestionsArrayForWhile;

import java.util.Scanner;

public class MixQues09_StrUcucaEkle {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir cumle giriniz");
		String cumle1=scan.nextLine();
		System.out.println("Bir cumle giriniz");
		String cumle2=scan.nextLine();
		System.out.println(cumle1+" "+cumle2);
		scan.close();
	}

}
