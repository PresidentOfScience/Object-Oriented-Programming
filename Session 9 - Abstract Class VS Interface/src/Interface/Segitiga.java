package Interface;

public class Segitiga implements BangunDatar {
	double sisi1, sisi2, sisi3;

	public Segitiga(double sisi1, double sisi2, double sisi3) {
		super();
		this.sisi1 = sisi1;
		this.sisi2 = sisi2;
		this.sisi3 = sisi3;
	}
	
	public double keliling() {
		return (sisi1 + sisi2 + sisi3);
	}
	
	public double s() {
		return (keliling()/2);
	}
	
	public double luas() {
		return Math.sqrt(s()*(s()-sisi1)*(s()-sisi2)*(s()-sisi3));
	}
}
