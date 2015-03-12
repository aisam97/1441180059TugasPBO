import java.io.*;
public class IfElse2 {
    public static void main (String[] args) throws IOException {
    BufferedReader dataAngka=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("*Menghitung Grade Nilai*");
    System.out.println("========================");
    System.out.print("Masukkan Nilai Anda : ");
    String str1 = dataAngka.readLine();
    int bil1 = Integer.parseInt(str1);
    if (bil1 >= 75)
        System.out.println("Grade : A");
    else if((bil1 < 75) && (bil1 >= 65))
        System.out.println("Grade : B");
    else if((bil1 < 65) && (bil1 >= 55))
        System.out.println("Grade : C");
    else if((bil1 < 55) && (bil1 >= 45))
        System.out.println("Grade : D");
    else if((bil1 < 45) && (bil1 >= 0))
        System.out.println("Grade : E");
    }
}