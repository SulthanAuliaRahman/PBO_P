import java.util.Scanner;
import java.math.BigInteger;
public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan A:");
        String a = scanner.next();
        System.out.println("Masukan B:");
        String b = scanner.next();
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
                
        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);
        
        System.out.println(sum);
        System.out.println(product);
    }
}
