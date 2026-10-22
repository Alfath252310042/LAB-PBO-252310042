
package Pembelajaran_01;

import java.util.Scanner;

public class Latihan_03 {

    
    static double luas;
    static double keliling;
    static double volume;

    
    static double luasLayangLayang(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    static double kelilingLayangLayang(double a, double b) {
        return 2 * (a + b);
    }


    static void hitungPrismaSegitiga(
            double alas,
            double tinggiSegitiga,
            double sisiMiring,
            double tinggiPrisma) {


        double luasAlas = 0.5 * alas * tinggiSegitiga;
        double kelilingAlas = alas + (2 * sisiMiring);

        luas = (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
        volume = luasAlas * tinggiPrisma;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("PROGRAM PERHITUNGAN BANGUN");
        System.out.println("1. Layang-layang");
        System.out.println("2. Prisma Segitiga");
        System.out.print("Pilih bangun: ");

        int pilih = in.nextInt();

        switch (pilih) {

            case 1:
                System.out.print("Diagonal 1: ");
                double d1 = in.nextDouble();

                System.out.print("Diagonal 2: ");
                double d2 = in.nextDouble();

                System.out.print("Sisi a: ");
                double a = in.nextDouble();

                System.out.print("Sisi b: ");
                double b = in.nextDouble();

                luas = luasLayangLayang(d1, d2);
                keliling = kelilingLayangLayang(a, b);

                System.out.println("Luas layang-layang: " + luas);
                System.out.println("Keliling layang-layang: " + keliling);
                break;

            case 2:
                System.out.print("Alas segitiga: ");
                double al = in.nextDouble();

                System.out.print("Tinggi segitiga: ");
                double ts = in.nextDouble();

                System.out.print("Sisi miring segitiga: ");
                double sm = in.nextDouble();

                System.out.print("Tinggi prisma: ");
                double tp = in.nextDouble();

                hitungPrismaSegitiga(al, ts, sm, tp);

                System.out.println("Luas permukaan prisma: " + luas);
                System.out.println("Volume prisma: " + volume);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        in.close();
    }
}
