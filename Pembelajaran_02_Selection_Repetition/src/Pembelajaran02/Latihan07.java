package Pembelajaran02;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto(input);
        char lagi;
        do {
            resto.chooseMenu();
            do {
                System.out.print("Apakah anda akan memesan kembali ? (y/n) ");
                lagi = Character.toLowerCase(input.next().charAt(0));
            } while (lagi != 'y' && lagi != 'n');
            System.out.println();
        } while (lagi == 'y');
        System.out.println("Terimakasih telah memesan.");
        input.close();
    }
}
