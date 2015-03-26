public class sembilan{
    public static void main(String[] args) 
    {
    System.out.println("*Mengurutkan Angka*");
    for (int i=1; i<=110; i++)
        {
            System.out.print(i+" ");
            if (i%11==0) 
            {
            System.out.println(" ");
            }
            else if (i%5==0) {
                System.out.print("JONI ");
            }continue;
        }       
    }
}