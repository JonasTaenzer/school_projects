import java.util.Scanner;
import java.util.ArrayList;

public class Questions {
	private ArrayList<String> fragen;
	private ArrayList<String> antworten;
	private ArrayList<String> vorschläge;
	private int punkte;
	public Scanner sc = new Scanner(System.in);

	public Questions(ArrayList<String> fragen, ArrayList<String> antworten, ArrayList<String> vorschläge, int punkte) {
		this.fragen = fragen;
		this.antworten = antworten;
		this.vorschläge = vorschläge;
		this.punkte = punkte;
	}
	
	public void fragenBeantworten() {
		int zufall = (int) (Math.random() * fragen.size());
		System.out.println(fragen.get(zufall));
		System.out.println(vorschläge.get(zufall));
		String beantwortung = sc.nextLine();
		if(antworten.get(zufall).toUpperCase().equals(beantwortung.toUpperCase())) {
			punkte++;
			System.out.println("Richtige Antwort!");
		}else{
			System.out.println("Falsche Antwort!");
		}
		fragen.remove(zufall);
	    vorschläge.remove(zufall);
	    antworten.remove(zufall);
	}
	
	
	public ArrayList<String> getFragen() {
		return fragen;
	}
	public void setFragen(ArrayList<String> fragen) {
		this.fragen = fragen;
	}
	public ArrayList<String> getAntworten() {
		return antworten;
	}
	public void setAntworten(ArrayList<String> antworten) {
		this.antworten = antworten;
	}
	public ArrayList<String> getVorschläge() {
		return vorschläge;
	}
	public void setVorschläge(ArrayList<String> vorschläge) {
		this.vorschläge = vorschläge;
	}
	public int getPunkte() {
		return punkte;
	}
	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}
	
}
