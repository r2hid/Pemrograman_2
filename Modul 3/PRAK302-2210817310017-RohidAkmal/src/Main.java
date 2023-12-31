import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int jumlahNegara = inputScanner.nextInt();
        inputScanner.nextLine();
        LinkedList<Negara> negaraList = new LinkedList<>();
        HashMap<Integer, String> namabulanMap = new HashMap<>();
        namabulanMap.put(1, "Januari");
        namabulanMap.put(2, "Februari");
        namabulanMap.put(3, "Maret");
        namabulanMap.put(4, "April");
        namabulanMap.put(5, "Mei");
        namabulanMap.put(6, "Juni");
        namabulanMap.put(7, "Juli");
        namabulanMap.put(8, "Agustus");
        namabulanMap.put(9, "September");
        namabulanMap.put(10, "Oktober");
        namabulanMap.put(11, "November");
        namabulanMap.put(12, "Desember");

        for (int x = 1; x <= jumlahNegara; x++) {
            String namaNegara = inputScanner.nextLine();
            String jenisKepemimpinan = inputScanner.nextLine();
            String namaPemimpin = inputScanner.nextLine();
            int tanggalKemerdekaan = 0; int bulanKemerdekaan = 0; int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = inputScanner.nextInt();
                bulanKemerdekaan = inputScanner.nextInt();
                tahunKemerdekaan = inputScanner.nextInt();
                inputScanner.nextLine();
            }
            Negara negaraObjek = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negaraObjek);
        }
        for (Negara negara : negaraList) {
            String jenisKepemimpinan = negara.getJenisKepemimpinan();

            if (jenisKepemimpinan.equals("monarki")) {
                jenisKepemimpinan = "Raja";
                System.out.println("Negara " + negara.getNama() + " mempunyai " + jenisKepemimpinan + " bernama " + negara.getNamaPemimpin() + "\n");
            }
            else {
                int bulanKemerdekaan = negara.getBulanKemerdekaan();
                String namaBulan = namabulanMap.get(bulanKemerdekaan);
                System.out.println("Negara " + negara.getNama() + " mempunyai " + jenisKepemimpinan + " bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + namaBulan + " " + negara.getBulanKemerdekaan() + "\n");
            }
        }
    }
}