package Praktikum2_Soal3;

//nama class harus sama dengan nama file
public class Pegawai {
    public String nama;
    //public char asal salah karena char bukan tipe data
    public String asal;
    public String jabatan;
    //integer umur tidak memiliki nilai sehingga ketika di run hasilnya 0
    public int umur = 17;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //public void setJabatan (){ Baris ini menghasilkan error karena
    //metode setJabatan() tidak menerima parameter apapun sehingga menimbulkan masalah saat di run.
    //Metode yang diperbaiki membutuhkan parameter String j dan mengubah properti jabatan sesuai dengan nilainya.
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}