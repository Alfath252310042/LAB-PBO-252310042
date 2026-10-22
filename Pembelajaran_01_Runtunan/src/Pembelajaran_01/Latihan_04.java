package Pembelajaran_01;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Latihan_04 {
    public static void main(String[] args) {
        final String NAMA_PRODUK = "ROTI ENAK";
        final int HARGA = 6300;

        Scanner in = new Scanner(System.in);
        NumberFormat rp = NumberFormat.getInstance(new Locale("id", "ID"));
        String tanggal = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", new Locale("id", "ID")));

        String garis = "======================================================";
        System.out.println(garis);
        System.out.println("                 TOKO AL FATH STORE IBIK");
        System.out.println(garis);
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = in.nextInt();
        System.out.println(tanggal);
        System.out.println();

        int total = qty * HARGA;

        int persenDiskon = (qty > 0 && qty % 3 == 0) ? 5 : 0;
        double subTotal = total - (total * persenDiskon / 100.0);

        System.out.printf("%-14s %-5s %-12s %-12s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println(garis);
        System.out.printf("%-14s %-5d Rp %-9s Rp %-9s%n",
                NAMA_PRODUK, qty, rp.format(HARGA) + ",-", rp.format(total));
        System.out.println("------------------------------------------------------");
        System.out.println("Diskon    : " + persenDiskon + "%");
        System.out.println("Sub Total : Rp " + rp.format(subTotal) + ",-");
    }
}
