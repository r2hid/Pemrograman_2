class Mahasiswa {
    private String namaMahasiswa;
    private String nimMahasiswa;

    public Mahasiswa(String nama, String nim) {
        this.namaMahasiswa = nama;
        this.nimMahasiswa = nim;
    }

    public String getNama() {
        return namaMahasiswa;
    }

    public String getNim() {
        return nimMahasiswa;
    }
}