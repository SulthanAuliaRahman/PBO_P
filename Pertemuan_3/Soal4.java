import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Item terjual:");
        int jumlah = scanner.nextInt(); 
        float pokok = 500000;
        int jual = 50000;
        float total;

        if (jumlah > 80) {
            total =  pokok + (float) (jual * jumlah * 0.35) ;
        }else if (jumlah > 40) {
            total =  pokok + (float) (jual * jumlah * 0.25);
        }else if (jumlah > 15) {
            total = pokok + (float)(jual * jumlah * 0.1);
        }else{
            total = pokok - (float)(jual * jumlah * 0.15);
        }
        System.out.println("Total Gaji = " + total);
    }
}
