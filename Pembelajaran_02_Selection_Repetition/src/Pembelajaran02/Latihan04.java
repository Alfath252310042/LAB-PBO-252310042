package Pembelajaran02;

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        long npm = input.nextLong();

        int n;
        do {
            System.out.print("Masukkan nilai faktor (minimal 20): ");
            n = input.nextInt();
            if (n < 20) {
                System.out.println("Nilai tidak boleh kurang dari 20!");
            }
        } while (n < 20);

        boolean genap = npm % 2 == 0;
        StringBuilder hasil = new StringBuilder();

        if (genap) { 
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (hasil.length() > 0) hasil.append(", ");
                    hasil.append(i);
                }
            }
        } else {     
            for (int i = n; i >= 1; i--) {
                if (n % i == 0) {
                    if (hasil.length() > 0) hasil.append(", ");
                    hasil.append(i);
                }
            }
        }
        System.out.println((genap ? "ASC" : "DESC") + ": Faktor " + n + " adalah " + hasil);
        input.close();
    }
}
