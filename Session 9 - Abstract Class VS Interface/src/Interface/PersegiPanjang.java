package Interface;

public class PersegiPanjang implements BangunDatar {
	double panjang, lebar;

	public PersegiPanjang(double panjang, double lebar) {
		super();
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public double luas() {
		return (panjang*lebar);
	}
	
	public double keliling() {
		return 2*(panjang + lebar);
	}
}
