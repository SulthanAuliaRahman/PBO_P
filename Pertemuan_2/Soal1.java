
import java.util.Scanner;

public class Soal1 {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    
    System.out.print("Masukan angka = ");
    String nilai = Input.nextLine();
    
    try {
        long jumlah = Long.parseLong(nilai);
        
        if (jumlah >= Byte.MIN_VALUE && jumlah <= Byte.MAX_VALUE){
            System.out.println(nilai + " Bisa masuk ke tipe data byte");
        }else if(jumlah >= Short.MIN_VALUE && jumlah <= Short.MAX_VALUE){
            System.out.println(nilai + " Bisa masuk ke tipe data short");
        }else if(jumlah >= Integer.MIN_VALUE && jumlah <= Integer.MAX_VALUE){
            System.out.println(nilai + " Bisa masuk ke tipe data Integer");
        }else if(jumlah >= Long.MIN_VALUE && jumlah <= Long.MAX_VALUE){
            System.out.println(nilai + " Bisa masuk ke tipe data Long");
        }
    }
    catch(NumberFormatException e) {
    System.out.println("tidak Bisa masuk ke tipe data mana pun");
    }
    System.out.println(Input);
  }
  
