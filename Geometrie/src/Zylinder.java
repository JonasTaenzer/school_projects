
public class Zylinder {
	private double höhe, radius;
	
	public Zylinder(double höhe, double radius) {
		this.höhe=höhe;
		this.radius=radius;
	}
	
	public void volumen() {
		double volumen = Math.PI*radius*radius*höhe;
		System.out.println("Das Volumen des Zylinders beträgt: "+volumen +"cm³.");
	}
	public void oberfläche() {
		double oberfläche = 2*(Math.PI)*radius*höhe;
		System.out.println("Die Oberfläche beträgt: "+oberfläche +"cm².");
	}

	public double getHöhe() {
		return höhe;
	}

	public void setHöhe(double höhe) {
		this.höhe = höhe;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
