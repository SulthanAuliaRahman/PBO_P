package Soal1.com;

public class Person {
    protected String nama;
    protected String id;
    protected String Alamat;

    public Person(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void alamat(String alamat){
        this.Alamat = alamat;
    }
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
