import InheritancePackage.Balok;
import InheritancePackage.Segiempat;

public class ManagerClass {

	public static void main(String[] args) {
		Segitiga triangle = new Segitiga(100, 50);
		System.out.println("Luas: " + triangle.getArea());
		
		Segiempat petak = new Segiempat(10, 20);
		Balok balok = new Balok(10, 20, 30);
		System.out.println("Volume: " + balok.getVolume());
	}

}
