import java.util.Scanner;
public class empat{
    public static void main(String[] args) {
    System.out.println("*Mengganti Angak dengan Huruf*");
    System.out.println("*Switch Case*");
    System.out.print("Masukkan Angka : ");
    Scanner nilai = new Scanner(System.in);
    int n = nilai.nextInt();
    switch (n) {
    case 1 :
        System.out.println("Satu");
        break;
    case 2 :
        System.out.println("Dua");
        break;
    case 3 :
        System.out.println("Tiga");
        break;
    case 4 :
        System.out.println("Empat");
        break;
    case 5 :
        System.out.println("Lima");
        break;
    case 6 :
        System.out.println("Enam");
        break;
    case 7 :
        System.out.println("Tujuh");
        break;
    case 8 :
        System.out.println("Delapan");
        break;
    case 9 :
        System.out.println("Sembilan");
        break;
    default :
        System.out.println("Error");
        break;
          
      }  
    }
}