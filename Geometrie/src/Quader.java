
public class Quader {
	private double a, b, c;
	
	public Quader(double a, double b, double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public void volumen() {
		double volumen=a*b*c;
		System.out.println("Das Volumen des Quaders beträgt: "+volumen +"cm³.");
	}
	public void oberfläche() {
		double oberfläche=(2*a*b)+(2*a*c)+(2*b*c);
		System.out.println("Die Oberfläche des Quaders beträgt: "+oberfläche +"cm².");
	}
	public void raumdiagonale() {
		double raumdiagonale=Math.sqrt((a*a)+(b*b)+(c*c));
		System.out.println("Die Länge der Raumdiagonale des Quaders beträgt: "+raumdiagonale +"cm.");
	}
	public void gesamtkantenlänge() {
		double gesamtkantenlänge=4*(a+b+c);
		System.out.println("Die Länge der Gesamtkantenlänge des Quaders beträgt: "+gesamtkantenlänge +"cm.");
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
