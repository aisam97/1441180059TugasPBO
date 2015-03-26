import java.util.Scanner; 
public class sbls{
    public static void main(String[] args) 
    {
    System.out.println("*Menggambar sebuah persegi menggunakan karakter #*");
    System.out.print("Panjang Persegi: ");
    Scanner nilai = new Scanner(System.in);
    int panjang = nilai.nextInt();
    System.out.print("Lebar Persegi : ");
    int lebar = nilai.nextInt();
    for(int i=1; i<=panjang; i++) 
    {
                    if (i%2==0) 
            {
            System.out.print(" ");
            }
        for(int j=1; j<=lebar; j++) 
            {
            System.out.print("#"); 
            }
        System.out.println("");
    }
    }
}