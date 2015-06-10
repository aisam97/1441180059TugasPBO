package com.isam;

/**
 * Created by Muhammad Isam on 10/06/2015.
 */
public class TestClass {

    public static void main(String[] args) {

        Penulis hana = new Penulis("Hana", "Ngawi", 'P', "Insha Allah Menikah", 16);
        Penulis isam = new Penulis("Isam", "Ngawi", 'L', "Insha Allah Menikah", 18);

        Buku Java = new Buku("Java",45000.0,"Gramedia",hana);

        System.out.println(Java.toString());

    }
}
