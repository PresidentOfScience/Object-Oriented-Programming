package AbstractClass;

public class PersegiPanjang extends BangunDatar {
	double panjang, lebar;

	public PersegiPanjang(double panjang, double lebar) {
		super();
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	double luas() {
		return (panjang*lebar);
	}
	
	double keliling() {
		return 2*(panjang + lebar);
	}
}
