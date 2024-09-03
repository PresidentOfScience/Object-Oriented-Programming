package Interface;

public class Persegi implements BangunDatar {
	double sisi;

	public Persegi(double sisi) {
		super();
		this.sisi = sisi;
	}
	
	public double luas() {
		return (sisi*sisi);
	}
	
	public double keliling() {
		return (4*sisi);
	}
}
