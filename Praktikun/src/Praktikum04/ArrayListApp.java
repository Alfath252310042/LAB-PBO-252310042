package Praktikum04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Rafli"); 					//input data
		System.out.println(nama.get(0));	// buat output
		
		//input dari username pake JOp
		JOptionPane jop =  new JOptionPane();
		nama.add(jop.showInputDialog(null, "Input Nama: "));
		jop.showMessageDialog(null, nama.getLast());

		nama.remove(0); 	//menghapus
		System.out.println("Nama Setelah dihapus:" + nama.get(0));
		
		
//		System.out.println();
	
		nama.add("Halisa");
		nama.add("Alfath");
		System.out.println("List nama");
		for (int i = 0; i < nama.size(); i++) {
			System.out.println(nama.get(i));
		}
		
		nama.clear(); //menghapus semua data
		System.out.println(nama.size());
		
	}
}