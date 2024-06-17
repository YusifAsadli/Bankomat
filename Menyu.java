package Main;

import java.util.Scanner;

public class Menyu {
	public static void menyu(int hesab) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bankomatimiza xos gelmisiz:)\nZehmet olmasa kodunuzu daxil edin");
		int kod = sc.nextInt();
		if (Butil.kodtesdiqleme(kod)) {
			Duzelis1.menyuSecimi(
					"Sistem acildi.\nMenyu:\n1.Pulcek.\n2.Pul yukle.\n3.Hesabdaki pula bax.\n4.Basqa hesaba gonder.\n5.Hesabdan cix.");
			// Argumente daxil ele Spesifik yazilmasin
//			Bir syso da yaz+
//			SWITCHI IFE CEVIR+
			int menyusecimi = sc.nextInt();
			if (Duzelis1.sertOp(menyusecimi, 1)) {
				PullaEmeliyyatlar.pulCek(hesab);
			}

			else if (Duzelis1.sertOp(menyusecimi, 2)) {
				PullaEmeliyyatlar.pulYukle(hesab);
			} else if (Duzelis1.sertOp(menyusecimi, 3)) {
				Butil.hesabiGoster(hesab);
			}

			else if (Duzelis1.sertOp(menyusecimi, 4)) {
				PullaEmeliyyatlar.pulGonder(hesab);
			} else if (Duzelis1.sertOp(menyusecimi, 3)) {
				Butil.hesabdanCix(hesab);
			} else {
				System.out.println("Kodunuz sehvdir");
			}

		}
	}
}
