package Pertemuan_1;

public class Intro {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		// Variable
		int angka1 = 10;
		int angka2 = 20;
		
		// Tipe data
		String nama = "Alfath";
		
		//Oprator
		int hasilTambah = angka1 + angka2;
		hasilTambah++;
		
		//oprator perbandingan
		boolean pembanding = angka1 > angka2;
		boolean tesNama = nama == "Alfath";
		
		//oprator kondisional
		boolean kondisional = (true || false) && (true && true);
		
		//oprator asigment
		angka1 *= angka2; // angka1 di kali dengan angka2
							// hasilnya disimpan di angka2
		
		Dog mydog = new Dog();
		mydog.hungry();
		String name = "Tomi";
		mydog.puppyName(name);
	}
}


		
