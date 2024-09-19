package Soal1.com;

public class Ruangan {
    private String namaRuangan;
    private String lokasi;

    public Ruangan(String namaRuangan, String lokasi) {
        this.namaRuangan = namaRuangan;
        this.lokasi = lokasi;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public String getLokasi() {
        return lokasi;
    }
}
