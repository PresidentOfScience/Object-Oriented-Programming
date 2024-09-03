package AbstractClass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program Matematika Penghitung Luas dan Keliling");
		System.out.println("===============================================");
		System.out.println("Pilih bangun datar:");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga");
		System.out.println("4. Lingkaran");
		System.out.print(">> ");
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		scan.nextLine();
		System.out.println();
		
		if(choice == 1) {
			System.out.print("Masukkan panjang sisi (dalam cm): ");
			double sisi = scan.nextDouble();
			Persegi p = new Persegi(sisi);
			System.out.println("Luas = " + p.luas() + " cm2");
			System.out.println("Keliling = " + p.keliling() + " cm");
		}
		else if(choice == 2) {
			System.out.print("Masukkan panjang (dalam cm): ");
			double panjang = scan.nextDouble();
			System.out.print("Masukkan lebar (dalam cm): ");
			double lebar = scan.nextDouble();
			PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
			System.out.println("Luas = " + pp.luas() + " cm2");
			System.out.println("Keliling = " + pp.keliling() + " cm");
		}
		else if(choice == 3) {
			System.out.print("Masukkan panjang sisi pertama (dalam cm): ");
			double sisi1 = scan.nextDouble();
			System.out.print("Masukkan panjang sisi kedua (dalam cm): ");
			double sisi2 = scan.nextDouble();
			System.out.print("Masukkan panjang sisi ketiga (dalam cm): ");
			double sisi3 = scan.nextDouble();
			Segitiga s = new Segitiga(sisi1, sisi2, sisi3);
			System.out.println("Luas = " + s.luas() + " cm2");
			System.out.println("Keliling = " + s.keliling() + " cm");
		}
		else if(choice == 4) {
			System.out.print("Masukkan panjang jari-jari (dalam cm): ");
			double radius = scan.nextDouble();
			Lingkaran l = new Lingkaran(radius);
			System.out.println("Luas = " + l.luas() + " cm2");
			System.out.println("Keliling = " + l.keliling() + " cm");
		}
		else {
			System.out.println("Input salah!");
		}
	}

}
