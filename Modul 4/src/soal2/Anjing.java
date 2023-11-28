package soal2;
import java.util.Arrays;

public class Anjing extends HewanPeliharaan{
    public String warnaBulu;
    public String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super.nama = n;
        super.ras = r;
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + nama);
        System.out.println("Dengan ras: " + ras);
        System.out.println("Memiliki warna bulu: " + warnaBulu);
        System.out.println("Memiliki kemampuan: " + Arrays.toString(kemampuan).replace("[", "").replace("]", "").replace(",", ""));
    }
}