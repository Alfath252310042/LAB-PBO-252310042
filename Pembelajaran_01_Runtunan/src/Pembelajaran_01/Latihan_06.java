package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Usia      : "); String usia = in.nextLine();
        System.out.print("Firstname : "); String first = in.nextLine();
        System.out.print("Lastname  : "); String last = in.nextLine();
        System.out.print("NPM       : "); String npm = in.nextLine();

        String hasil = usia.concat(first).concat(last).concat(npm);
        System.out.println("Output    : " + hasil);
    }
}
