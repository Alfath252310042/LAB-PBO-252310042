package Pembelajaran03;

public class Biodata {
    // Attribute
    String Fullname;
    String Usia;
    String Alamat;

    // Method untuk menyimpan value
    void setFullname(String value) {
        Fullname = value;
    }

    void setUsia(String value) {
        Usia = value;
    }

    void setAlamat(String value) {
        Alamat = value;
    }

    // Method untuk membentuk teks hasil
    String getInfo() {
        return "Fullname : " + Fullname + "\n"
             + "Usia     : " + Usia + " tahun\n"
             + "Alamat   : " + Alamat;
    }
}
