
public class Segitiga {
	private double alas, tinggi;

	public Segitiga() { // default constructor

	}

	public Segitiga(double a, double t) {
		this.alas = a;
		this.tinggi = t;
	}

	public double getArea() {
		return 0.5 * (alas * tinggi);
	}
}
