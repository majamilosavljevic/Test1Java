package test18nov;

import java.util.Scanner;

public class Zadatak2_11182019 {

	public static void main(String[] args) {
		/*
		 * Ukoliko kupac kupi robu u iznosu vecem od 1500 dinara, dobija 10% popusta, a
		 * ukoliko kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta. Napisati
		 * program koji ce za uneti iznos odabrane robe ispisati koliko zapravo treba
		 * platiti.
		 */

		Scanner scan = new Scanner(System.in);
		double n = 0;
		double pay;
		while (n <= 0) {
			System.out.println("Unesite iznos racuna:");
			n = scan.nextDouble();
		}
		if (n < 1500)
			System.out.println("Iznos za placanje je " + n + " dinara.");
		if (n >= 1500 && n < 7000) {
			pay = n - (n / 10);
			System.out.println("Iznos za placanje je " + pay + " dinara.");
		}
		if (n >= 7000) {
			pay = n - 2 * (n / 10);
			System.out.println("Iznos za placanje je " + pay + " dinara.");
		}
	}
}
