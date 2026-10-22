package Pembelajaran02;

import java.util.Scanner;

public class Latihan05 {

    static String baris(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) sb.append("* ");
        for (int i = 0; i < 2 * (n - k); i++) sb.append("  ");
        for (int i = 0; i < k; i++) sb.append("* ");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row:");
        int n = input.nextInt();


        for (int k = n; k >= 1; k--) {      
            System.out.println(baris(n, k));
        }
        for (int k = 1; k <= n; k++) {   
            System.out.println(baris(n, k));
        }
        input.close();
    }
}
