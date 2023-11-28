package soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, ras, warnaBulu;
        String[] kemampuan;
        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                nama = input.nextLine();
                System.out.print("Ras: ");
                ras = input.nextLine();
                System.out.print("Warna Bulu: ");
                warnaBulu = input.nextLine();

                Kucing cat = new Kucing(nama, ras, warnaBulu);
                cat.displayDetailKucing();
                break;

            case 2:
                System.out.print("Nama hewan peliharaan: ");
                nama = input.nextLine();
                System.out.print("Ras: ");
                ras = input.nextLine();
                System.out.print("Warna Bulu: ");
                warnaBulu = input.nextLine();
                System.out.print("Kemampuan: ");
                kemampuan = new String[]{input.nextLine()};

                Anjing dog = new Anjing(nama, ras, warnaBulu, kemampuan);
                dog.displayDetailAnjing();
                break;
        }
    }
}