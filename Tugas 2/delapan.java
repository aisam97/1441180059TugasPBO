public class delapan{
    public static void main(String[] args) {
        int bg=110;
    System.out.println("*Hasil Urutan Angka 1-10*");
    for (int i=1; i<=bg; i++)
    {
        System.out.print(i);
        if (i%11==0) {
            System.out.println("");
        }
        }
    }
}