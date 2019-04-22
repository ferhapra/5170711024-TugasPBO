package tugaselearning;

public class Pelajar extends Manusia {

    void Jenjang() {
        System.out.print("Jenjang Pendidikan : ");
        String jp = j.nextLine();
    }

    void Hobi() {
        System.out.print("Hobi : ");
        char hb = j.next().charAt(0);
    }

    void Kebutuhan() {
        System.out.print("Kebutuhan 1 bulan : ");
        float kb = i.nextFloat();
    }
    @Override
     protected void Datadiri() {
        System.out.print("Nama : ");
        nama = i.nextLine();
        System.out.print("Umur : ");
        int umur = i.nextInt();
        System.out.print("Jenis Kelamin : ");
        jk = j.nextLine();
    }
}
