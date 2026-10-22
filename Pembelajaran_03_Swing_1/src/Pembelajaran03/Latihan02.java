package Pembelajaran03;

import javax.swing.JOptionPane;

public class Latihan02 {
    static Biodata bio = new Biodata();

    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog(null, "Masukkan Fullname :", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
        String usia     = JOptionPane.showInputDialog(null, "Masukkan Usia :", "Form Biodata", JOptionPane.QUESTION_MESSAGE);
        String alamat   = JOptionPane.showInputDialog(null, "Masukkan Alamat :", "Form Biodata", JOptionPane.QUESTION_MESSAGE);

        bio.setFullname(fullname);
        bio.setUsia(usia);
        bio.setAlamat(alamat);

        JOptionPane.showMessageDialog(null, bio.getInfo(), "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}
