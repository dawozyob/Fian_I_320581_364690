package demo04_benutzereingaben_filtern;

import java.awt.event.KeyAdapter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NutzereingabenFiltern {
	public static void main(String[] args) {

//		wertEinLesenMitFehler();
//		wertEinlesenMitExceptionHandling();
//		wertEinlesenMitStringFilterung();
//		wertEinlesenMitStringFilterung2();
		wertEinlesenMitRegEx();
		KeyAdapter k;
	}

	private static void wertEinlesenMitRegEx() {
		String regEx = "[0-9]+";
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben");
		String wert = sc.next();
		boolean isNumeric = wert.matches(regEx);
		if(isNumeric) {
			System.out.println("Sie haben einen numerischen Wert eingegeben");
		}else {
			System.out.println("Bitte nur Zahlen eingeben");
		}
	}

	private static void wertEinlesenMitStringFilterung2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben");
		String wert = sc.next();
		boolean isNumeric = wert.chars().allMatch(i -> Character.isDigit(i));
		if(isNumeric) {
			System.out.println("Sie haben einen numerischen Wert eingegeben");
		}else {
			System.out.println("Bitte nur Zahlen eingeben");
		}
	}

	private static void wertEinlesenMitStringFilterung() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben");
		String nutzerEingabe = "a12a3";
		String clean = "";
		for (int i = 0; i < nutzerEingabe.length(); i++) {
			if(Character.isDigit(nutzerEingabe.charAt(i))) {
				clean += nutzerEingabe.charAt(i);
			}
			if(!Character.isDigit(nutzerEingabe.charAt(i))) {
				System.out.println("Bitte nur Zahlen eingeben");
			}
		}		
		if(clean.length()>0) {
			Integer i1 = Integer.parseInt(clean);
			System.out.println(i1);
		}		
		System.out.println(clean);
		
	}

	private static void wertEinlesenMitExceptionHandling() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben");

		int wert = 0;
		try {
			wert = sc.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Exception abgefangen");
		}

		System.out.println("Sie haben folgendes eingegeben: " + wert);

	}

	private static void wertEinLesenMitFehler() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben");

		int wert = sc.nextInt();
		System.out.println("Sie haben folgendes eingegeben: " + wert);
	}

}
