package Main;

import java.util.Scanner;

public class Butil {

	public static boolean kodtesdiqleme(int kod) {
		return kod == 1234;
	}

	public static int hesabdakiPul(int hesab) {
		return hesab = 1000;
	}

	public static void hesabiGoster(int hesab) {
		System.out.println("Hesabinizda " + hesab + " manat pul var");
		hesabdanCix(hesab);
		// Menyuya qayitsin+
	}

	public static void hesabdanCix(int hesab) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hesabdan cixilmisdir\n Menyuya qayitmaq isteyirsiniz mi?\n1.Beli\n2.Xeyir");
		int secim1 = sc.nextInt();
		if (secim1 == 1) {
			hesabdanCix(hesab);
			// Menyuya qayit+
		} else if (secim1 == 2) {
			System.out.println("Hesabdan cixdiniz.Sagolun:)");
		}
	}

}
