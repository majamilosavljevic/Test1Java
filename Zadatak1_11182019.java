package test18nov;

import java.util.Scanner;

public class Zadatak1_11182019 {

	public static void main(String[] args) {
		/*
		 * Traziti od korisnika da unese pozitivan broj N, zatim ucitavati N brojeva sa
		 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int n = 0;
		double m, min;
		while (n <= 0) {
			System.out.println("Unesite koliko brojeva zelite da proverite (unesite pozitivan broj): ");
			n = scan.nextInt();
		}
		System.out.println("Unesite 1. broj:");
		m = scan.nextDouble();
		min = m;
		for (int i = 2; i <= n; i++) {
			System.out.println("Unesite " + i + ". broj:");
			m = scan.nextDouble();
			if (m < min)
				min = m;
		}
		System.out.println("Najmanji broj od unetih brojeva je broj " + min + ".");
	}
}