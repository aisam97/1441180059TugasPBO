package tugas.tujuh;

/**
 * Created by Muhammad Isam on 10/06/2015.
 */
public class TestClassLaptop {

    public static void main(String[] args) {

        Brand satu = new Brand("ACER","1TB Serial ATA 5400 RPM","16 inch", "1.7 kg");

        Laptop acer = new Laptop("Windows 7","Intel i3","Intel HD Graphic","1.8 GB",satu);

        System.out.println(acer.toString());

    }
}
