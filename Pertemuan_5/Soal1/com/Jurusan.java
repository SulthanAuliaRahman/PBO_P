package Soal1.com;

public class Jurusan {
    protected String namajurusan;
    protected String kodejurusan;

    public Jurusan(String jurusan, String kode) {
        this.namajurusan = jurusan;
        this.kodejurusan = kode;
    }

    public String getNamajurusan() {
        return this.namajurusan;
    }

    public String getKodejurusan() {
        return this.kodejurusan;
    }

    public void setNamajurusan(String namajurusan) {
        this.namajurusan = namajurusan;
    }

    public void setKodejurusan(String kodejurusan) {
        this.kodejurusan = kodejurusan;
    }

}