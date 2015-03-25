import java.util.Scanner;
public class tiga{
    public static void main(String[] args) {
    System.out.println("*Mengganti Angak dengan Huruf*");
    System.out.println("*If Else*");
    System.out.print("Masukkan Angka : ");
    Scanner nilai = new Scanner(System.in);
    int n = nilai.nextInt();  
    if (n == 1)
        System.out.println("Satu");
    else if (n == 2 )
        System.out.println("Dua");
    else if (n == 3 )
        System.out.println("Tiga");
    else if (n == 4 )
        System.out.println("Empat");
    else if (n == 5 )
        System.out.println("Lima");
    else if (n == 6 )
        System.out.println("Enam");
    else if (n == 7 )
        System.out.println("Tujuh");
    else if (n == 8 )
        System.out.println("Delapan");
    else if (n == 9 )
        System.out.println("Sembilan");
    else
        System.out.println("Error");
    }
}