import Soal1.com.*;
public class Main {
    public static void main(String[] args) {
        //Data Jurusan
        Jurusan jurusan = new Jurusan("JTK", "Gedung D");
        
        // Data Prodi
        Prodi prodi = new Prodi("JTK", "Gedung D", "D3 informatika");

        // Data Mahasiswa
        Mahasiswa[] mahasiswa = new Mahasiswa[10];
        mahasiswa[0] = new Mahasiswa("Ali", "M001", "Teknik Informatika");
        mahasiswa[1] = new Mahasiswa("Budi", "M002", "Sistem Informasi");
        mahasiswa[2] = new Mahasiswa("Cimol", "M001", "Teknik Informatika");
        mahasiswa[3] = new Mahasiswa("Dodi", "M002", "Sistem Informasi");
        mahasiswa[4] = new Mahasiswa("Erlang", "M001", "Teknik Informatika");
        mahasiswa[5] = new Mahasiswa("Fatur", "M002", "Sistem Informasi");
        mahasiswa[6] = new Mahasiswa("Galang", "M001", "Teknik Informatika");
        mahasiswa[7] = new Mahasiswa("Hanura", "M002", "Sistem Informasi");
        mahasiswa[8] = new Mahasiswa("Ilham", "M001", "Teknik Informatika");
        mahasiswa[9] = new Mahasiswa("Jono", "M002", "Sistem Informasi");

        // Data Dosen
        Dosen[] dosen = new Dosen[10];
        dosen[0] = new Dosen("Ade Chandra", "KO001N", "Basis Data");
        dosen[1] = new Dosen("Yudi Widyasana", "KO013N", "Graphic");
        dosen[2] = new Dosen("Yadhi Aditya Permana", "KO052N", "Pemrograman");
        dosen[3] = new Dosen("Zulkifli Arsyad", "KO061N", "Pemrograman");
        dosen[4] = new Dosen("Trishna Gelar", "KO078N", "Graphic");
        dosen[5] = new Dosen("Prof. Petrus", "D002", "Graphic");
        dosen[6] = new Dosen("Prof. Qris", "D001", "Graphic");
        dosen[7] = new Dosen("Prof. Rahmat", "D002", "Graphic");
        dosen[8] = new Dosen("Prof. Sumarecon", "D001", "Pemrograman");
        dosen[9] = new Dosen("Prof. Tirta", "D002", "Jaringan");

        // Menampilkan jadwal perkuliahan senin – jumat beserta info ruangan, dosen pengampunya.jadwal menggunakan jadwal yang saat ini berjalan
        MataKuliah[] mk = new MataKuliah[7];
        mk[0] = new MataKuliah("BasisData", "001", dosen[0]);
        mk[1] = new MataKuliah("CG-T", "002", dosen[1]);
        mk[2] = new MataKuliah("PBO-T", "003", dosen[2]);
        mk[3] = new MataKuliah("PBO-P", "004", dosen[3]);
        mk[4] = new MataKuliah("Komgraf-p", "005", dosen[4]);
        mk[5] = new MataKuliah("Komgraf-P", "006", dosen[5]);
        mk[6] = new MataKuliah("Basis Data", "007", dosen[6]);

        Ruangan[] ruangan = new Ruangan[7];
        ruangan[0] = new Ruangan("Kelas-1", "DI Gedung D");
        ruangan[1] = new Ruangan("Kelas-2", "DI Gedung D");
        ruangan[2] = new Ruangan("Kelas-3", "DI Gedung D");
        ruangan[3] = new Ruangan("Kelas-4", "DI Gedung D");
        ruangan[4] = new Ruangan("Kelas-5", "DI Gedung D");
        ruangan[5] = new Ruangan("Kelas-6", "DI Gedung D");
        ruangan[6] = new Ruangan("Kelas-7", "DI Gedung D");
        

        Jadwal[] jadwal = new Jadwal[5];
        jadwal[0] = new Jadwal(mk[0], ruangan[0], "Senin",dosen[0]);
        jadwal[1] = new Jadwal(mk[1], ruangan[1], "Selasa",dosen[1]);
        jadwal[2] = new Jadwal(mk[2], ruangan[2], "Rabu",dosen[2]);
        jadwal[3] = new Jadwal(mk[3], ruangan[3], "Kamis",dosen[3]);
        jadwal[4] = new Jadwal(mk[4], ruangan[4], "Jumat",dosen[4]);


        // Jadwal
        MataKuliah matkul1 = new MataKuliah("Algoritma", "MK001", dosen[0]);
        Ruangan ruangan1 = new Ruangan("Lab 1", "Gedung A");
        Jadwal jadwal1 = new Jadwal(matkul1, ruangan1, "Senin", dosen[0]);

        //Instansi
        System.out.println("Data Instansi");
        System.out.println(jurusan.getNamajurusan() + " "+jurusan.getKodejurusan() + " " + prodi.getNamaprodi());


        // Menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa m : mahasiswa) {
            System.out.println("Nama: " + m.getNama() + ", Jurusan: " + m.getJurusan());
        }
        for (Jadwal j:jadwal){
            j.tampilkanJadwal();
            System.out.println(" ");
        }
        // Menampilkan data dosen
        System.out.println("\nData Dosen:");
        for (Dosen d : dosen) {
            System.out.println("Nama: " + d.getNama() + ", Bidang: " + d.getBidang());
        }

        // Menampilkan jadwal perkuliahan
        System.out.println("\nJadwal Perkuliahan:");
        ((Jadwal) jadwal1).tampilkanJadwal();
    }
}
