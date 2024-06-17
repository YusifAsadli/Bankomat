package Main;

import java.util.Scanner;

public class PullaEmeliyyatlar {
	public static void pulCek(int hesab) {
		Scanner sc = new Scanner(System.in);
		if (hesab == 0) {
			System.out.println("Hesabinizda pul yoxdu.");
			Butil.hesabdanCix(hesab);
			// Metodnan menyuya gonder+
		} else if (hesab != 0) {
			System.out.println("Ne qeder pul cekmek isteyirsiz?"+Butil.hesabdakiPul(hesab) + " Manat pulunuz var");
			// Hesabdaki meblegi goster funksiya+
			int cekecekmebleg = sc.nextInt();
			if (cekecekmebleg > hesab) {
				System.out.println("Yeteri qeder mebleginiz yoxdur.");
				pulCek(hesab);
				Butil.hesabdanCix(hesab);
				// Metodnan menyuya gonder+
			} else if (cekecekmebleg <= hesab) {
				System.out.println("Hesabinizdan pul ugurla cekildi. Qalan pulunuz: "+Duzelis1.cix(hesab, cekecekmebleg) + " manat pulunuz qaldi");
				Butil.hesabdanCix(hesab);
				// Hesabdaki pula bax metodunu cagirsin-cekecekmeblegi+
			}
		}
	}

	public static void pulYukle(int hesab) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Meblegi daxil edin.");
		int medaxil = sc.nextInt();
		if (medaxil > 1000) {
			System.out.println("Daha cox mebleg daxil ede bilmezsiz.");
			pulYukle(hesab);
		} else if (medaxil <= 1000) {
			System.out.println("Ugurla daxil etdiniz. \n Hesabinizda " + Duzelis1.topla(hesab, medaxil) + " manat pul var");
			Butil.hesabdanCix(hesab);
			// Hesabdaki pula bax metodunu cagirsin ve ustune medaxili gelsin+
			// Menyuya atsin+
		}
	}

	public static void pulGonder(int hesab) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gondereceyiniz meblegi qeyd edin:");
		int mexaric = sc.nextInt();
		if (mexaric > hesab) {
			System.out.println("Yeteri qeder mebleg yoxdur.\nHesabinizda " + Butil.hesabdakiPul(hesab) + " Manat pul var");
			Butil.hesabdanCix(hesab);
			// Menyuya qayitsin hesabdaki pulu gostersin+
		}
		System.out.println("Hesabinizda " + Duzelis1.cix(hesab, mexaric) + " Manat pul qaldi");
		Butil.hesabdanCix(hesab);
		// Hesabdaki pula bax metodu+
	}

}
