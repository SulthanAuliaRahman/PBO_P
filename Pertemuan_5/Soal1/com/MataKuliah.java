package Soal1.com;

public class MataKuliah {
    private String namaMataKuliah;
    private String kodeMataKuliah;
    private Dosen dosenPengampu;

    public MataKuliah(String namaMataKuliah, String kodeMataKuliah, Dosen dosenPengampu) {
        this.namaMataKuliah = namaMataKuliah;
        this.kodeMataKuliah = kodeMataKuliah;
        this.dosenPengampu = dosenPengampu;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public String getKodeMataKuliah() {
        return this.kodeMataKuliah;
    }
    
    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }
    public void setDosenPengampu(Dosen dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }
    
}