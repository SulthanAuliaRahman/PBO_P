
package Soal1.com;

// Subclass Dosen (Generalisasi)
public class Dosen extends Person {
    private String bidang;

    public Dosen(String nama, String Code_dosen, String bidang) {
        super(nama, Code_dosen);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }
    
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

}