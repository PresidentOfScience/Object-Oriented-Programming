package AbstractClass;

public class Lingkaran extends BangunDatar {
	double radius;

	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}
	
	double luas() {
		return (Math.PI * radius * radius);
	}
	
	double keliling() {
		return (2 * Math.PI * radius);
	}
}
