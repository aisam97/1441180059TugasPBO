public class delapan{
    public static void main(String[] args) {
        int bg=110;
    System.out.println("*Hasil Urutan Angka 1-110*");
    System.out.println("*Ganti Baris Setiap 11 Angka*");
    for (int i=1; i<=bg; i++)
    {
        System.out.print(i+" ");
        if (i%11==0) {
            System.out.println("");
        }
        }
    }
}