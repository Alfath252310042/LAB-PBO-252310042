package Pertemuan_1;

import java.util.Scanner;

public class Nyoba_segitiga {
	public static void main(String[] args) {
		System.out.println("Menghitung Luas Segitia: ");
		
		segitia segitiga = new Segitiga_1();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan Panjang Balok: ");
		Segitia_1.alas = scanner.nextDouble();
	}
}
