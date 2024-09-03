package AbstractClass;

public class Persegi extends BangunDatar {
	double sisi;

	public Persegi(double sisi) {
		super();
		this.sisi = sisi;
	}
	
	double luas() {
		return (sisi*sisi);
	}
	
	double keliling() {
		return (4*sisi);
	}
}
