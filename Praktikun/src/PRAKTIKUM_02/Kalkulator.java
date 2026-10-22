package PRAKTIKUM_02;

import java.util.Scanner;

public class Kalkulator {
	static double hitung(double x, double y, char oprator) {
		switch(oprator) {
		case '+':
			return x + y;
		case '-':
			return x - y;
		case '*':
			return x * y;
		case '/':
			if (y == 0) {
				throw new Error("Tidak Boleh dibagi dengan nol");
			}
			return x / y;
		default:
			throw new Error("Oprator Invalid");
		}
	}
	public static void main(String[] args) {
		System.out.println("Kalkulator sederhana");
		
		double x, y;
		char operator, again = 'Y';
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Input x: ");
			x = scanner.nextDouble();
			
			System.out.print("Input Y: ");
			y = scanner.nextDouble();
			
			System.out.print("Input Oprator: ");
			operator = scanner.next().charAt(0);
			
			
			double hasil = hitung(x, y, operator);
			System.out.println("Hasil " + hasil);
			
			System.out.println("Ulang (Y/N)?");
			again = scanner.next().charAt(0);
			
		} while (Character.toUpperCase(again) == 'Y');
	}
}
