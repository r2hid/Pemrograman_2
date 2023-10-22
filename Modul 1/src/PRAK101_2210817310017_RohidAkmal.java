import java.util.Scanner;

public class PRAK101_2210817310017_RohidAkmal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Nama Lengkap: ");
        String nama = in.nextLine();
        System.out.print("Masukan Tempat Lahir: ");
        String tempatlahir = in.nextLine();
        System.out.print("Masukan Tanggal Lahir: ");
        int tanggallahir = in.nextInt();
        System.out.print("Masukan Bulan Lahir: ");
        int bulanlahir = in.nextInt();
        System.out.print("Masukan Tahun Lahir: ");
        int tahunlahir = in.nextInt();
        System.out.print("Masukan Tinggi Badan: ");
        int tinggibadan = in.nextInt();
        System.out.print("Masukan Berat Badan: ");
        double beratbadan = in.nextDouble();

        String[] bulan = {"tidakada", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap "+nama+", Lahir di "+tempatlahir+" pada Tanngal "+tanggallahir+" "+ bulan[bulanlahir]+" "+tahunlahir+" Tinggi Badan "+tinggibadan+" cm dan Berat Badan "+beratbadan+" kilogram");
    }
}