import java.util.Scanner;
 
/**
 * Program ini skeleton untuk tugas 6 ... program nya massih ada kelemahan cari kelemahannya benerin :3
 */
public class Menu_a {
 
    public static void main(String[] args) {
        // Local variable
        int pilihanMenu;
        Scanner aritmatika = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
            System.out.println("=================================");
            System.out.println("|     Program Memilih Menu      |");
            System.out.println("=================================");
            System.out.println("| Options:                      |");
            System.out.println("|        1. Penjumlahan         |");
            System.out.println("|        2. Pengurangan         |");
            System.out.println("|        3. Perkalian           |");
            System.out.println("|        4. Pembagian           |");
            System.out.println("|        5. Exit                |");
            System.out.println("=================================");
            System.out.println("Pilih Menu");
        pilihanMenu= Integer.parseInt(in.nextLine());
        switch (pilihanMenu)
        {
                case 1:
                    System.out.println("=================================");
                    System.out.println("|     Program Penjumlahan       |");
                    System.out.println("=================================");
                    System.out.println("Penjumlahan");
                    System.out.println("Masukkan Angka Pertama");
                    int jml_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int jml_b = aritmatika.nextInt();
                    int hasil = jml_a+jml_b;
                    System.out.println(jml_a+"+"+jml_b+"="+hasil);
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("|     Program Pengurangan       |");
                    System.out.println("=================================");
                    System.out.println("Masukkan Angka Pertama");
                    int krg_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int krg_b = aritmatika.nextInt();
                    int hasil_a = krg_a-krg_b;
                    System.out.println(krg_a+"-"+krg_b+"="+hasil_a);
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("|     Program Perkalian         |");
                    System.out.println("=================================");
                    System.out.println("Masukkan Angka Pertama");
                    int kali_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int kali_b = aritmatika.nextInt();
                    int hasil_b = kali_a*kali_b;
                    System.out.println(kali_a+"*"+kali_b+"="+hasil_b);
                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.println("|     Program Pembagian         |");
                    System.out.println("=================================");
                    System.out.println("Masukkan Angka Pertama");
                    int bagi_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int bagi_b = aritmatika.nextInt();
                    int hasil_c = bagi_a/bagi_b;
                    System.out.println(bagi_a+"/"+bagi_b+"="+hasil_c);
                    break;
                case 5:
                    System.out.println("Keluar Aplikasi");
                    break;
                default:
                    System.out.println("Pilihan Menu Salah");
                    break; // This break is not really necessary
            }
        while(pilihanMenu != 5){
 
            System.out.println("=================================");
            System.out.println("|     Program Memilih Menu      |");
            System.out.println("=================================");
            System.out.println("| Options:                      |");
            System.out.println("|        1. Penjumlahan         |");
            System.out.println("|        2. Pengurangan         |");
            System.out.println("|        3. Perkalian           |");
            System.out.println("|        4. Pembagian           |");
            System.out.println("|        5. Exit                |");
            System.out.println("=================================");
            System.out.println("Pilih Menu");
            pilihanMenu= Integer.parseInt(in.nextLine());
 
            switch (pilihanMenu){
                case 1:
                    System.out.println("=================================");
                    System.out.println("|     Program Penjumlahan       |");
                    System.out.println("=================================");
                    System.out.println("Penjumlahan");
                    System.out.println("Masukkan Angka Pertama");
                    int jml_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int jml_b = aritmatika.nextInt();
                    int hasil = jml_a+jml_b;
                    System.out.println(jml_a+"+"+jml_b+"="+hasil);
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.println("|     Program Pengurangan       |");
                    System.out.println("=================================");
                    System.out.println("Masukkan Angka Pertama");
                    int krg_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int krg_b = aritmatika.nextInt();
                    int hasil_a = krg_a-krg_b;
                    System.out.println(krg_a+"-"+krg_b+"="+hasil_a);
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.println("|     Program Perkalian         |");
                    System.out.println("=================================");
                    System.out.println("Masukkan Angka Pertama");
                    int kali_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int kali_b = aritmatika.nextInt();
                    int hasil_b = kali_a*kali_b;
                    System.out.println(kali_a+"*"+kali_b+"="+hasil_b);
                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.println("|     Program Pembagian         |");
                    System.out.println("=================================");
                    System.out.println("Masukkan Angka Pertama");
                    int bagi_a = aritmatika.nextInt();
                    System.out.println("Masukkan Angka Kedua");
                    int bagi_b = aritmatika.nextInt();
                    int hasil_c = bagi_a/bagi_b;
                    System.out.println(bagi_a+"/"+bagi_b+"="+hasil_c);
                    break;
                case 5:
                    System.out.println("Keluar Aplikasi");
                    break;
                default:
                    System.out.println("Pilihan Menu Salah");
                    break; // This break is not really necessary
            }
 
 
        }
    }
}