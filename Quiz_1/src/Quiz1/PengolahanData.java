package Quiz1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class PengolahanData {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        int pilihan;

        do {
            String menu = JOptionPane.showInputDialog(
                "MENU PENGOLAHAN DATA\n\n" +
                "1. Masukkan judul buku\n" +
                "2. Hapus Data\n" +
                "3. Output Seluruh Data buku\n" +
                "4. Keluar dari Program\n\n" +
                "Pilih menu:"
            );

            if (menu == null) {
                break;
            }

            try {
                pilihan = Integer.parseInt(menu);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null, "Masukkan pilihan berupa angka!"
                );
                continue;
            }

            switch (pilihan) {

                case 1:
                    String input = JOptionPane.showInputDialog(
                        "Masukkan nama buku yang ingin disimpan:"
                    );

                    if (input != null && !input.trim().isEmpty()) {
                        data.add(input);
                        JOptionPane.showMessageDialog(
                            null, "Data buku berhasil disimpan!"
                        );
                    } else if (input != null) {
                        JOptionPane.showMessageDialog(
                            null, "Data buku tidak boleh kosong!"
                        );
                    }
                    break;

                case 2:
                    if (data.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null, "Belum ada data yang tersimpan!"
                        );
                        break;
                    }

                    String hapus = JOptionPane.showInputDialog(
                        "Data saat ini:\n" + data +
                        "\n\nMasukkan indeks data yang ingin dihapus\n" +
                        "(indeks dimulai dari 0):"
                    );

                    if (hapus != null) {
                        try {
                            int indeks = Integer.parseInt(hapus);

                            if (indeks >= 0 && indeks < data.size()) {
                                data.remove(indeks);
                                JOptionPane.showMessageDialog(
                                    null, "Data berhasil dihapus!"
                                );
                            } else {
                                JOptionPane.showMessageDialog(
                                    null, "Indeks data tidak ditemukan!"
                                );
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(
                                null, "Indeks harus berupa angka!"
                            );
                        }
                    }
                    break;

                case 3:
                    if (data.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null, "Belum ada data yang tersimpan!"
                        );
                    } else {
                        String hasil = "DAFTAR SELURUH DATA\n\n";

                        for (int i = 0; i < data.size(); i++) {
                            hasil += i + ". " + data.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(null, hasil);
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(
                        null, "Program selesai. Terima kasih!"
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null, "Pilihan tidak tersedia!"
                    );
            }

        } while (true);
    }
}