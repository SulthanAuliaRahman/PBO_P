package Soal1.com;

public class Prodi extends Jurusan {

    protected String namaprodi;
    public Prodi(String jurusan, String kode, String prodi) {
        super(jurusan, kode);
        this.namaprodi = prodi;
    }

    public String getNamaprodi() {
        return this.namaprodi;
    }

    public void setNamaprodi(String namaprodi) {
        this.namaprodi = namaprodi;
    }
    
}
