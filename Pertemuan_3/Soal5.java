import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Plat nomor1:");
        String mobil1 = scanner.next(); 
        System.out.print("Plat nomor2:");
        String mobil2 = scanner.next(); 
        System.out.print("Plat nomor3:");
        String mobil3 = scanner.next(); 
        System.out.print("Plat nomor4:");
        String mobil4 = scanner.next();

        String gabunganMobil = mobil1 + mobil2 + mobil3 + mobil4;
        
        long gabunganAngka = Long.parseLong(gabunganMobil);
        
        long hasil = gabunganAngka - 999999;
        System.out.println(hasil);
        System.out.println(hasil % 5);
        if (hasil % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
        
    }
}
