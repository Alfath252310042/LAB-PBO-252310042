package Pembelajaran03;

import javax.swing.JOptionPane;

public class Latihan03 {
    static Biodata bio = new Biodata();

    // Menampilkan dialog input; jika CANCEL/Close langsung keluar (belum ada konfirmasi di soal 3)
    static String input(String label) {
        String v = JOptionPane.showInputDialog(null, "Masukkan " + label + " :", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
        if (v == null) {
            System.exit(0);
        }
        return v.trim();
    }

    static void error(String pesan) {
        JOptionPane.showMessageDialog(null, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }

    static boolean isAngka(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        // ===== Fullname =====
        String fullname;
        while (true) {
            fullname = input("Lengkap");
            if (fullname.isEmpty()) {
                error("Field Lengkap tidak boleh kosong");
                continue;
            }
            break;
        }

        // Usia 
        String usia;
        while (true) {
            usia = input("Usia");
            if (usia.isEmpty()) {
                error("Field usia tidak boleh kosong");
                continue;
            }
            if (!isAngka(usia)) {
                error("Isian usia harus angka");
                continue;
            }
            break;
        }

        // Alamat 
        String alamat;
        while (true) {
            alamat = input("Alamat");
            if (alamat.isEmpty()) {
                error("Field alamat tidak boleh kosong");
                continue;
            }
            if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter", "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            break;
        }

        bio.setFullname(fullname);
        bio.setUsia(usia);
        bio.setAlamat(alamat);
        JOptionPane.showMessageDialog(null, bio.getInfo(), "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}
