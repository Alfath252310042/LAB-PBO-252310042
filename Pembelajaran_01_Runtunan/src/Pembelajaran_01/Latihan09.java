package Pembelajaran_01;

import java.util.Scanner;

public class Latihan09 {
    Students myBio = new Students();

    public static void main(String[] args) {
        Latihan09 app = new Latihan09();
        Scanner in = new Scanner(System.in);

        System.out.print("NPM        : "); Integer npm = in.nextInt(); in.nextLine();
        System.out.print("Fullname   : "); String nama = in.nextLine();
        System.out.print("ClassName  : "); String kelas = in.nextLine();
        System.out.print("Semester   : "); Integer smt = in.nextInt();
        System.out.print("GPA        : "); Float gpa = in.nextFloat();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NPM       : " + app.myBio.getNpm(npm));
        System.out.println("Fullname  : " + app.myBio.getFullname(nama));
        System.out.println("ClassName : " + app.myBio.getClassname(kelas));
        System.out.println("Semester  : " + app.myBio.getSemester(smt));
        System.out.println("GPA       : " + app.myBio.getGpa(gpa));
    }
}
