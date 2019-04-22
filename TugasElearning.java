package tugaselearning;

public class TugasElearning {

    public static void main(String[] args) {
        Pelajar p = new Pelajar();
        Mahasiswa m = new Mahasiswa();

        System.out.println("Pelajar");
        p.Datadiri();
        p.Jenjang();
        p.Hobi();
        p.Kebutuhan();
        System.out.println("Mahasiswa");
        m.Datadiri();
        m.Jenjang();
        m.Hobi();
        m.Kebutuhan();
    }

}
