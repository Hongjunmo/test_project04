package test_project04;

import java.util.Scanner;

import com.care.tv_hongjunmo.Test04_hjm_off;
import com.care.washer_soyoung.Dewater_soyoung;

public class Test04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Test04_hjm_off hjm= new Test04_hjm_off();
		Dewater_soyoung dewat = new Dewater_soyoung();
		
		int num;

		System.out.println("---¼¼Å¹±â---");
		while (true) {
			System.out.println("1.Àü¿ø on"); // Ã»ÇÏ´Ô
			System.out.println("2.Àü¿ø off"); // È«ÁØ¸ğ
			System.out.println("3.¼¼Å¹"); // ¼ºÈ¯´Ô
			System.out.println("4.Çó±À"); // ÁÖÈñ´Ô
			System.out.println("5.Å»¼ö"); // ¼Ò¿µ´Ô
			System.out.print(">>>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("Àü¿øÀ» ÄÕ´Ï´Ù");
				break;
			case 2:
				System.out.println("Àü¿øÀ» ²ü´Ï´Ù");
				hjm.PowerOff();
				break;
			case 3:
				System.out.println("¼¼Å¹ ½ÃÀÛ");
				break;
			case 4:
				System.out.println("Çó±À ½ÃÀÛ");
				break;
			case 5:
				System.out.println("Å»¼ö ½ÃÀÛ");
				dewat.dewater();
				break;
			default:
				System.out.println("Àß¸ø ÀÔ·Â");
				break;
			}
		}

	}
}
