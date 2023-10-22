public class Buah {

    String NamaBuah;
    double BeratBuah;
    double HargaBuah;
    double JumlahBeli;
    double HargaSebelumDiskon;
    double TotalDiskon;
    double HargaSetelahDiskon;

    public Buah(String nama, double Berat, double Harga, double HargaSebelumDiskon, double JumlahBeli) {
        setNamaBuah(nama);
        setBeratBuah(Berat);
        setHargaBuah(Harga);
        setHargaSebelumDiskon(HargaSebelumDiskon);
        setJumlahBeli(JumlahBeli);
    }

    public void setNamaBuah(String nama) {
        this.NamaBuah = nama;
    }

    public void setBeratBuah(double Berat) {
        this.BeratBuah = Berat;
    }

    public void setHargaBuah(double Harga) {
        this.HargaBuah = Harga;
    }

    public void setJumlahBeli(double JumlahBeli) {
        this.JumlahBeli = JumlahBeli;
    }

    public void setHargaSebelumDiskon(double HargaSebelumDiskon) {
        this.HargaSebelumDiskon = HargaSebelumDiskon;
    }

    public void hitungTotalDiskon() {
        double diskonPerEmpatKg = 0.02 * HargaBuah * 4;
        int jumlahPembelianEmpatKg = (int) Math.floor(JumlahBeli / 4);
        TotalDiskon = jumlahPembelianEmpatKg * diskonPerEmpatKg;
        HargaSetelahDiskon = HargaSebelumDiskon - TotalDiskon;

        System.out.printf(" Total diskon : Rp%.2f\n", TotalDiskon);
        System.out.printf(" Harga setelah diskon : Rp%.2f\n\n", HargaSetelahDiskon);
    }

    public void buahInfo() {
        System.out.println(" Nama buah : " + NamaBuah);
        System.out.println(" Berat : " + BeratBuah);
        System.out.println(" Harga : " + HargaBuah);
        System.out.println(" Jumlah beli : " + JumlahBeli + "kg");
        System.out.printf(" Harga sebelum diskon : Rp%.2f\n", HargaSebelumDiskon);
        hitungTotalDiskon();
    }
}