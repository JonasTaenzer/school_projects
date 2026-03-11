import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


public class Notenrechner {
	static ArrayList<Integer> Punkte = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menue();
	}

	public static void menue() {
		System.out.println("------------------------------------------------------");
		System.out.println("(1) neue Punktezahlen eingeben");
		System.out.println("(2) alle gespeicherten Punkte mit Note anzeigen lassen");
		System.out.println("(3) den Durchschnitt berechnen");
		System.out.println("(4) die beste und schlechtete Punktzahl ausgeben");
		System.out.println("(5) eine Punktzahl löschen");
		System.out.println("(6) eine Punktzahl ändern");
		System.out.println("(0) Programm beenden");
		System.out.println("------------------------------------------------------");
		int auswahl = sc.nextInt();
		switch (auswahl) {
		case 1: {
			punktezahlen();
			break;
		}
		case 2: {
			punkteZuNote();
			break;
		}
		case 3: {
			durchschnitt();
			break;
		}
		case 4: {
			minMax();
			break;
		}
		case 5: {
			löschen();
			break;
		}
		case 6: {
			ändern();
			break;
		}
		case 0: {
			beenden();
			break;
		}
		default:
			System.out.println("Unerwartete Eingabe: " + auswahl);
			menue();
			break;
		}
	}

	public static void punktezahlen() {
		System.out.println("Geben sie ihre Punktezahl ein(0-100)!");
		int werte = sc.nextInt();
		if (werte >= 0 && werte <= 100) {
			if (Punkte.size() < 10) {
				Punkte.add(werte);
			} else {
				System.out.println("Maximal 10 Werte erreicht");
			}
		} else {
			System.out.println("Ungültig, bitte 0-100!");
			punktezahlen();
		}
		menue();
	}

	public static void punkteZuNote() {
		if (Punkte.size() > 0) {
			for (int i = 0; i < Punkte.size(); i++) {
				if (Punkte.get(i) >= 92) {
					System.out.println("Punkte: " + Punkte.get(i) + " ->Note: 1");
				} else if (Punkte.get(i) < 92 && Punkte.get(i) >= 81) {
					System.out.println("Punkte: " + Punkte.get(i) + " ->Note: 2");
				} else if (Punkte.get(i) < 81 && Punkte.get(i) >= 67) {
					System.out.println("Punkte: " + Punkte.get(i) + " ->Note: 3");
				} else if (Punkte.get(i) < 67 && Punkte.get(i) >= 50) {
					System.out.println("Punkte: " + Punkte.get(i) + " ->Note: 4");
				} else if (Punkte.get(i) < 50 && Punkte.get(i) >= 30) {
					System.out.println("Punkte: " + Punkte.get(i) + " ->Note: 5");
				} else if (Punkte.get(i) < 30 && Punkte.get(i) >= 0) {
					System.out.println("Punkte: " + Punkte.get(i) + " ->Note: 6");
				}
			}
		} else {
			System.out.println("Noch keine Punkte vorhanden");
			
		}
		menue();
	}
	
	public static void durchschnitt() {
		double summe = 0;
		for(int i = 0; i < Punkte.size(); i++) {
			summe += Punkte.get(i);
		}
		System.out.println("Durchschnitt: "+(summe/ Punkte.size()));
		menue();
	}
	
	public static void minMax() {
		if(Punkte.size()>0) {
			int min = Collections.min(Punkte);
			int max = Collections.max(Punkte);
			System.out.println("Beste Punktezahl: "+max);
			System.out.println("Schlechteste Punktezahl: "+min);
		}else {
			System.out.println("Noch keine Punkte vorhanden");
		}
		menue();
	}
	
	public static void löschen() {
		if(Punkte.size()>0) {
			System.out.println("Welchen Wert wollen sie löschen?");
			for(int i=0; i < Punkte.size(); i++ ) {
				System.out.println("("+(i+1)+") ="+Punkte.get(i));
			}
		}else {
			System.out.println("Noch keine Punkte vorhanden");
		}
		int auswahl = sc.nextInt();
		if(auswahl > 0 && auswahl<= Punkte.size()) {
			Punkte.remove(auswahl-1);
		}else {
			System.out.println("Feher! Versuchen sie es erneut!!");
			löschen();
		}
		menue();
	}
	
	public static void ändern() {
		if(Punkte.size()>0) {
			System.out.println("Welchen Wert wollen sie ändern?");
			for(int i=0; i < Punkte.size(); i++ ) {
				System.out.println("("+(i+1)+") ="+Punkte.get(i));
			}
		}else {
			System.out.println("Noch keine Punkte vorhanden");
		}
		int auswahl = sc.nextInt();
		if(auswahl > 0 && auswahl<= Punkte.size()) {
		System.out.println("Geben sie einen neuen Wert ein");
		int neuAuswahl = sc.nextInt();
		if(neuAuswahl >= 0 && neuAuswahl <= 100 ) {
		Punkte.set((auswahl-1), neuAuswahl);
		}else {
			System.out.println("Feher! Versuchen sie es erneut!!");
			ändern();
		}
		}else {
			System.out.println("Feher! Versuchen sie es erneut!!");
			ändern();
		}
		menue();
	}
	
	public static void beenden() {
		System.out.println("Programm wird beendet...");
		System.exit(0);
	}
}
