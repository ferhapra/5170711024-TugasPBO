package tugaselearning;

import java.util.Scanner;

public class Manusia {

    public Scanner i = new Scanner(System.in);
    public Scanner j = new Scanner(System.in);
      String nama,jk;
    protected void Datadiri() {
        System.out.print("Nama : ");
        nama = i.nextLine();
        System.out.print("Umur : ");
        int umur = i.nextInt();
        System.out.print("Jenis Kelamin : ");
        jk = i.nextLine();
    }
}
