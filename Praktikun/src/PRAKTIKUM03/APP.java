package PRAKTIKUM03;

import javax.swing.JOptionPane;

public class APP {
	public static void main(String[] args) {
		JOptionPane Jop = new JOptionPane();
		
		String nama, npm;
		int umur;
		
		int confirm = 0;
		
		do { 
			nama = Jop.showInputDialog(null,
					"Masukan nama anda",
					"Input",
					JOptionPane.QUESTION_MESSAGE);
			confirm = JOptionPane.showConfirmDialog(
					null,
					"Apakah anda yakin nama anda " + nama
					);
			if (confirm == 2) {
				return;
			}
		} while (confirm != 0);
		
		
		npm = Jop.showInputDialog(
				null,
				"Input NPM"
				);
		
	umur = Integer.parseInt(Jop.showInputDialog(null, "Input Umur"));
		
	String output = "Nama: " + nama + "\n" +
					"NPM: " + npm + "\n" +
					"Umur:  " + umur;
	Jop.showMessageDialog(null, output, "Biodata,", Jop.WARNING_MESSAGE);
	}
}
