package Praktikum04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrayApp {
	public static void main(String[] args) {
		String[] nama = new String [4];
		nama[0] = "eqas"; 			// cara input
		System.out.println(nama[0]); 	//Cara output
		System.out.println(nama[1]);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Nama =");
		nama[1] = scanner.nextLine();
		System.out.println("Nama yang di input: " + nama[1]);
		
		System.out.println("Nama-nama: ");
		for (int i = 0; i < 4; i++){
			System.out.println(nama[i]);
		}
	}
}



