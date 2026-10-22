package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_05 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Masukkan teks : ");
			String teks = in.nextLine();
			System.out.println("Huruf besar   : " + teks.toUpperCase());
		}
    }
}
