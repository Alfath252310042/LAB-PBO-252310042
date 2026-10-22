package Pembelajaran02;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final long NPM = 252310042;   
        long saldo = 150000000;          

        long pin;
        do {
            System.out.print("Masukkan PIN: ");
            pin = input.nextLong();
            if (pin != NPM) System.out.println("PIN salah, silakan coba lagi.");
        } while (pin != NPM);

        char lagi;
        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan nominal setor tunai: ");
                    long setor = input.nextLong();
                    saldo += setor;
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan nominal tarik tunai: ");
                    long tarik = input.nextLong();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;
                case 4:
                    break; 
                default:
                    System.out.println("Menu tidak tersedia.");
            }

            do {
                System.out.print("Kembali ke menu? (y/n) ");
                lagi = Character.toLowerCase(input.next().charAt(0));
            } while (lagi != 'y' && lagi != 'n');
        } while (lagi == 'y');

        System.out.println("Terima kasih.");
        input.close();
    }
}
