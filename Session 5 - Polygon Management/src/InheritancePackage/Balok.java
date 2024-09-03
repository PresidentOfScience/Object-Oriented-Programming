package InheritancePackage;

public class Balok extends Segiempat {
	private double tinggi;

	public Balok(double panjang, double lebar) {
		super(panjang, lebar);
	}

	public Balok(double panjang, double lebar, double tinggi) {
		super(panjang, lebar);
		this.tinggi = tinggi;
	}

	public double getVolume() {
		return this.panjang * this.lebar * this.tinggi;
	}

}
