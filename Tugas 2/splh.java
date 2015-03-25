import java.util.Scanner; 
public class splh{
    public static void main(String[] args) 
    {
    System.out.println("*Menggambar sebuah persegi menggunakan karakter #*");
    System.out.print("SISI Persegi: ");
    Scanner nilai = new Scanner(System.in);
    int sisi = nilai.nextInt();
    System.out.println(" ");
    for(int i=1; i<=sisi; i++) 
    {
        for(int j=1; j<=sisi; j++) 
            {
                System.out.print("#"); 
            }
        System.out.println("");
    }
    }
}