package Interface;

public class Lingkaran implements BangunDatar {
	double radius;

	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}
	
	public double luas() {
		return (Math.PI * radius * radius);
	}
	
	public double keliling() {
		return (2 * Math.PI * radius);
	}
}
