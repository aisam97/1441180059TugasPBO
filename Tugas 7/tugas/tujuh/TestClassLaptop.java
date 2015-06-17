package tugas.tujuh;

/**
 * Created by Muhammad Isam on 10/06/2015.
 */
public class TestClassLaptop {

    public static void main(String[] args) {

        Brand satu = new Brand("ACER","Tiongkok",1976, "www.acer.com");

        Laptop acer = new Laptop("ACER ASPIRE","Windows 7","Intel i3","Intel HD Graphic","1.8 GB",satu);

        System.out.println(acer.toString());

    }
}
