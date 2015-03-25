import java.util.Scanner;
public class tinggi{
    public static void main(String[] args) {
    System.out.println("*Mengecek Tinggi Badan*");
    System.out.print("Masukkan Tinggi Anda : ");
    Scanner nilai = new Scanner(System.in);
    int tg = nilai.nextInt();  
    if (tg < 100)
        System.out.println("Tidak Memenuhi Syarat");
    else 
        System.out.println("Memenuhi Syarat");
    }
}