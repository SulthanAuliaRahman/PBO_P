import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Ambil input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Tokenisasi string menggunakan regex untuk memisahkan berdasarkan karakter non-alfabet
        String[] tokens = kalimat.split("[^a-zA-Z]+");

        // Menampilkan jumlah kata
        System.out.println(tokens.length);

        // Menampilkan setiap kata yang dihasilkan
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
