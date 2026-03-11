
public class Kugel {
	private double radius;
	
	public Kugel(double radius) {
		this.radius = radius;
	}
	
	public void volumen() {
		double volumen = 4/3*Math.PI*(radius*radius*radius);
		System.out.println("Das Volumen der Kugel beträgt: "+volumen +"cm³.");
	}
	public void umfang() {
		double umfang = 2*Math.PI*radius;
		System.out.println("Der Umfang der Kugel beträgt: "+umfang +"cm.");
		
	}
	public void oberfläche() {
		double oberfläche =4*Math.PI*(radius*radius);
		System.out.println("Die Oberfläche der Kugel beträgt: "+oberfläche +"cm².");
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
