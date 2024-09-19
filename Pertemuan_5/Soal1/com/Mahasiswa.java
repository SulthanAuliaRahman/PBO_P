package Soal1.com;

public class Mahasiswa extends Person {
    private String jurusan;

    public Mahasiswa(String nama, String NIM, String jurusan) {
        super(nama, NIM);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
}
