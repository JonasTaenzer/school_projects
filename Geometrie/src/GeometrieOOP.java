import java.util.Scanner;

public class GeometrieOOP {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("--------------");
		System.out.println("(1) Quader");
		System.out.println("(2) Kugel");
		System.out.println("(3) Zylinder");
		System.out.println("--------------");
		int auswahl = sc.nextInt();
		switch (auswahl) {
		case 1: {
			eins();
			break;
		}
		case 2: {
			zwei();
			break;
		}
		case 3: {
			drei();
			break;
		}
		case 4: {
			vier();
			break;
		}
		default:System.out.println("Falsche Eingabe!");
		}
	}
	
	public static void eins() {
		System.out.println("Bitte geben sie die Länge der Seite a ein in cm! (Quader)");
		double a = sc.nextDouble();
		System.out.println("Bitte geben sie die Länge der Seite b ein in cm! (Quader)");
		double b = sc.nextDouble();
		System.out.println("Bitte geben sie die Länge der Seite c ein in cm! (Quader)");
		double c = sc.nextDouble();
		Quader q = new Quader(a,b,c);
		q.volumen();
		q.oberfläche();
		q.raumdiagonale();
		q.gesamtkantenlänge();
	}
	public static void zwei() {
		System.out.println("Bitte geben sie den Radius der Kugel ein in cm!");
		double radius = sc.nextDouble();
		Kugel k = new Kugel(radius);
		k.umfang();
		k.volumen();
		k.oberfläche();
	}
	public static void drei() {
		System.out.println("Bitte geben sie die Höhe des Zylinders ein in cm!");
		double höhe = sc.nextDouble();
		System.out.println("Bitte geben sie die Radius des Zylinders ein in cm!");
		double radius = sc.nextDouble();
		Zylinder z = new Zylinder(höhe, radius);
		z.volumen();
		z.oberfläche();
	}
	public static  void vier() {
		System.exit(0);
	}
}
