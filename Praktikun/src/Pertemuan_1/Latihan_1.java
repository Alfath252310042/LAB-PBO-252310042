package Pertemuan_1;

import java.util.Scanner;

public class Latihan_1 {
	public static void main(String[] args) {
		System.out.println("Program Menghitung Volume Balok");
		
		Balok balok = new Balok();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan Panjang Balok: ");
		balok.panjang = scanner.nextDouble();
		
		System.out.print("Masukan Lebar Balok: ");
		balok.lebar= scanner.nextDouble();
		
		System.out.print("Masukan Tinggi Balok: ");
		balok.tinggi= scanner.nextDouble();
		
		System.out.println("Volume dari Balok Adalah: " + balok.getVolume());
		
		
	}
}
