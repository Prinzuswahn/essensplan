import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println("Willkommen bei Deinem Essensplangenerator!");
		Scanner scan = new Scanner(System.in);


		// Eingabe der Essenswünsche für Mo-Fr
		String[] wochentage = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
		String[] essen = new String[wochentage.length];


		for (int i = 0; i < wochentage.length; i++) {
			System.out.println("Tag: " + wochentage[i]);
			System.out.println("Bitte Gericht für " + wochentage[i] + " eingeben: ");
			essen[i] = scan.nextLine();

		}

		System.out.println("\nDer Speiseplan für die kommende Woche:\n");

		for (int i = 0; i < wochentage.length; i++) {

			System.out.println(wochentage[i] + ": " + essen[i]);

		}

	}


}










