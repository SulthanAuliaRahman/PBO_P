import java.util.Scanner;

class Soal5{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("masukan Kata 1 = ");
        String Kata1 = Input.nextLine();
        System.out.print("masukan Kata 2 = ");
        String Kata2 = Input.nextLine();
        Boolean jawaban;
        Boolean Cek = true;
        int i = 0;
        
        int jumlah_karakter = Kata1.length()+Kata2.length();

        System.out.println("=================");
        System.out.println("1.Jumlah Total Karakter = "+jumlah_karakter);//no.1

        while (Cek) { //no.2
            
            if (Kata1.charAt(i) > Kata2.charAt(i) )
            {
                jawaban = true;
                Cek = false;
                System.out.println("2."+jawaban);
            }
            else if (Kata1.charAt(i)<Kata2.charAt(i)) {
                jawaban = false;
                Cek = false;
                System.out.println("2."+jawaban);
            }else{
                i++;
            }
        }
        //No.3
        String Besar_kata1 = Kata1.substring(0, 1).toUpperCase() + Kata1.substring(1);
        String Besar_kata2 = Kata2.substring(0, 1).toUpperCase() + Kata2.substring(1);

        System.out.println("3."+Besar_kata1 +" "+ Besar_kata2);
        Input.close();
    }
        
}