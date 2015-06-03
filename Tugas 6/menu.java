import java.util.Scanner;
class menu
{
public static void main(String[] args) 
	{
		Scanner aritmatika = new Scanner(System.in);
		Scanner Menu = new Scanner(System.in);
		for (int i = 0;i < 9999 ; i++) 
		{
			System.out.println("--Program Aritmatika--");
			System.out.println("1. Penjumlahan");
			System.out.println("2. Pengurangan");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.println("5. Keluar");
			System.out.print("Masukkan Pilihan = ");
			int pilihan = Menu.nextInt();
	    	switch (pilihan) 
	    	{
	    	case 1 :
	    		System.out.println("::Penjumlahan::");
	    		System.out.println("Masukkan Angka Pertama");
				int jml_a = aritmatika.nextInt();
				System.out.println("Masukkan Angka Kedua");
				int jml_b = aritmatika.nextInt();
				int hasil = jml_a+jml_b;
	        	System.out.println(jml_a+"+"+jml_b+"="+hasil);
	        break;
	        case 2 :
	        	System.out.println("::Pengurangan::");
				System.out.println("Masukkan Angka Pertama");
				int krg_a = aritmatika.nextInt();
				System.out.println("Masukkan Angka Kedua");
				int krg_b = aritmatika.nextInt();
				int hasil_a = krg_a-krg_b;
				System.out.println(krg_a+"-"+krg_b+"="+hasil_a);
			break;
			case 3 :
				System.out.println("::Perkalian::");
				System.out.println("Masukkan Angka Pertama");
				int kali_a = aritmatika.nextInt();
				System.out.println("Masukkan Angka Kedua");
				int kali_b = aritmatika.nextInt();
				int hasil_b = kali_a*kali_b;
				System.out.println(kali_a+"*"+kali_b+"="+hasil_b);
			break;
			case 4 :
				System.out.println("::Pembagian::");
				System.out.println("Masukkan Angka Pertama");
				int bagi_a = aritmatika.nextInt();
				System.out.println("Masukkan Angka Kedua");
				int bagi_b = aritmatika.nextInt();
				int hasil_c = bagi_a/bagi_b;
				System.out.println(bagi_a+"/"+bagi_b+"="+hasil_c);
			break;
			case 5 : 
				System.exit(0);
				System.out.println("Terima Kasih");
			break;
			default:
				System.out.println("Error");
			break;
			}		
		}	
	}
}