package Soal1.com;

public class Jadwal {
    private MataKuliah mataKuliah;
    private Ruangan ruangan;
    private String hari;
    private String pengampu;

    public Jadwal(MataKuliah mataKuliah, Ruangan ruangan, String hari,Dosen pengampu) {
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
        this.hari = hari;
        this.pengampu = pengampu.nama;
    }


    
    public void tampilkanJadwal() {
        System.out.println("Hari: " + hari);
        System.out.println("Mata Kuliah: " + mataKuliah.getNamaMataKuliah());
        System.out.println("Dosen Pengampu: " + mataKuliah.getDosenPengampu().getNama());
        System.out.println("Ruangan: " + ruangan.getNamaRuangan() + " - Lokasi: " + ruangan.getLokasi());
    }
}
