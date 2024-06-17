package Main;

import java.util.Scanner;

public class Duzelis1 {
	public static void menyuSecimi(String s) {
		System.out.println(s);
	}

	public static boolean sertOp(int secimi, int sayi) {
		if (secimi == sayi) {
			return true;
		} else {
			return false;
		}

	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int cix(int a, int b) {
		if (a > b) {
			return a - b;
		} else if (a < b) {
			return b - a;
		}else {
			return 0;
		}
	}

}