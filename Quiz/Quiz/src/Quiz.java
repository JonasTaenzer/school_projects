import java.util.Scanner;
import java.util.ArrayList;


public class Quiz {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<String> fragen = new ArrayList<String>();
	public static ArrayList<String> antworten = new ArrayList<String>();
	public static ArrayList<String> vorschläge = new ArrayList<String>();
	public static int punkte;
	public static Questions q = new Questions(fragen, antworten, vorschläge, punkte);
	
	public static void main(String[] args) {
		fragen.add("Wie viele Finger hat eine Hand?");
		fragen.add("In welcher Himmelsrichtung liegt der Nordpol?");
		fragen.add("Was ist ein Immergrün?");
		fragen.add("Wann ist die Sommersonnenwende?");
		fragen.add("Wie viele Stunden geht ein Tag?");
		fragen.add("Welcher Planet ist der Erde am nächsten?");
		fragen.add("Wie viele Tage hat eine Woche?");
		fragen.add("Welche Farbe entsteht aus Blau und Gelb?");
		fragen.add("Welches Tier wird oft als König der Tiere bezeichnet?");
		fragen.add("Wie viele Minuten hat eine Stunde?");
		
		antworten.add("A");
		antworten.add("B");
		antworten.add("C");
		antworten.add("B");
		antworten.add("A");
		antworten.add("B");
		antworten.add("C");
		antworten.add("A");
		antworten.add("B");
		antworten.add("A");
		
		vorschläge.add("(A) 5 (B) 3 (C) 8");
		vorschläge.add("(A) Süden (B) Norden (C) Westen");
		vorschläge.add("(A) Tier (B) Mensch (C) Pflanze");
		vorschläge.add("(A) Dezember (B) Juni (C) März");
		vorschläge.add("(A) 24 (B) 36 (C) 80");
		vorschläge.add("(A) Mars (B) Venus (C) Jupiter");
		vorschläge.add("(A) 5 (B) 6 (C) 7");
		vorschläge.add("(A) Grün (B) Rot (C) Lila");
		vorschläge.add("(A) Tiger (B) Löwe (C) Elefant");
		vorschläge.add("(A) 60 (B) 30 (C) 100");
		
		menü();
		

	}
	
	public static void menü() {
		System.out.println("----------------");
		System.out.println("(S) Start");
		System.out.println("(Q) Quiz beenden");
		System.out.println("----------------");
		String auswahl = sc.nextLine();
		if(auswahl.toUpperCase().equals("S")) {
			for (int i = 0; i < 5; i++) {
				q.fragenBeantworten();
				System.out.println("Deine Punkte sind: "+ q.getPunkte()+" von 5 Max.");
				System.out.println("");
			}
		}else if(auswahl.toUpperCase().equals("Q")) {
			System.out.println("Quiz wird beendet.");
			System.exit(0);
		}else {
			System.out.println("Falsche Eingabe, bitte überprüfen!");
			menü();
		}
	}

}
