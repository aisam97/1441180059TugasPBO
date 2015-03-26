//Mentok pak, yang baris pertama kurang 1 angka udah turun kebawah
public class sembilan
{
    public static void main(String[] args) 
    {
    System.out.println("*Mengurutkan Angka*");
    for (int i=1; i<=110; i++)
        {
            if (i==56) {
                System.out.println();
            }
            if (i%5==0) {
                System.out.print("JONI ");
                continue;
            }
            System.out.print(i+" ");
            if (i%11==0) {
                System.out.println(" ");
            }
        }   
    }
}