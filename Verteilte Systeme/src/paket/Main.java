package paket;

import java.util.Scanner;

public class Main {

	private Scanner scanner;

	public static void main(String[] args) {
		Main main = new Main();

		main.automatisch();
		// main.ausDezimalzahlZuBinaer();
		// main.vonBinaerZuDezimal();

	}

	public void automatisch() {
		scanner = new Scanner(System.in);

		System.out.println("Geben Sie ein Zeichen ein");

		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			System.out.println((int) str.charAt(i));
			System.out.println("0" + Integer.toBinaryString((int) str.charAt(i)));
		}
	}

	public void ausDezimalzahlZuBinaer() {
		scanner = new Scanner(System.in);

		System.out.println("Geben Sie ein Zeichen ein");

		String varString = scanner.nextLine();

		int var = 0;
		for (int i = 0; i < varString.length(); i++) {
			var = (int) varString.charAt(i);
		}

		System.out.println("Die Dezimalzahl ist: " + var);

		int anzahlStellen = 0;// Anzahl der Stellen der Dualzahl
		int varZwei = var;// Kopie der Zahl, da am Ende der while-Schleife die Zahl Null ist

		/*
		 * While Schleife soll die Anzahl der Stellen bestimmen
		 */
		while (varZwei != 0) {
			varZwei = varZwei / 2;// Zahl wird solange durch 2 dividiert bis 0 herauskommt
			anzahlStellen++;// Erhöhung der Zählvariablen
		}

		int zahlen[] = new int[anzahlStellen];// Array mit Länge der Zählvariablen

		for (int i = 0; i < anzahlStellen; i++) {
			zahlen[i] = var % 2;
			var = var / 2;
		}

		System.out.print(0);
		for (int i = zahlen.length - 1; i >= 0; i--) {
			System.out.print(zahlen[i]);
		}

	}

	public int rechnePotenz(int basis, int exponent) {

		int zahl = 1;
		for (int i = 1; i <= exponent; i++) {
			zahl *= basis;
		}

		return zahl;
	}

	public void vonBinaerZuDezimal() {
		scanner = new Scanner(System.in);

		System.out.println("Geben Sie ein Zeichen an");

		String varString = scanner.nextLine();

		System.out.println("\n" + "Das ist der Binärcode:" + "\n");

		String decimal = null;

		for (int i = 0; i < varString.length(); i++) {
			decimal = "0" + Integer.toBinaryString((int) varString.charAt(i));
			System.out.print("0" + Integer.toBinaryString((int) varString.charAt(i)) + "\n");
		}

		System.out.println("\n" + "Hier ist die Dezimalzahl" + "\n");

		char indexChar;
		int indexZahl[] = new int[8];

		for (int j = 0; j < decimal.length(); j++) {
			if (decimal != null) {
				indexChar = decimal.charAt(j);
				indexZahl[j] = Character.getNumericValue(indexChar);
			}
		}

		int a = indexZahl[0];
		int b = indexZahl[1];
		int c = indexZahl[2];
		int d = indexZahl[3];
		int e = indexZahl[4];
		int f = indexZahl[5];
		int g = indexZahl[6];
		int h = indexZahl[7];

		// mit der rechenPotenz Methode
		int result = rechnePotenz(2, 7) * a + rechnePotenz(2, 6) * b + rechnePotenz(2, 5) * c + rechnePotenz(2, 4) * d
				+ rechnePotenz(2, 3) * e + rechnePotenz(2, 2) * f + rechnePotenz(2, 1) * g + rechnePotenz(2, 0) * h;

		System.out.println(result);

	}

}
