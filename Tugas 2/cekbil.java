import java.util.Scanner;
class cekbil{
public static void main(String[] args){
	int pl;
  System.out.println("Program Mengecek Angka Genap atau Ganjil");
  System.out.printf("Masukkan angka : ");
  Scanner nilai = new Scanner(System.in);
  int angka = nilai.nextInt();
  pl = angka;
angka %= 2;
if(angka==0){
	System.out.print(pl );
	System.out.println(" Adalah Bilangan GENAP");
			}
else {
	System.out.print(pl );
	System.out.println("  Bilangan GANJIL");
	}
}
}