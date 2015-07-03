package tugas.sembilan;

import com.sun.org.apache.xpath.internal.operations.Div;

/**
 * Created by Muhammad Isam on 24/06/2015.
 */
public class TestLiga
{
    public static void main(String[] args) {
        // write your code here
//        instansiasi liga
        Liga italy = new Liga("Italy");


// intasisasi Divisi
        Divisi serieA = new Divisi("Serie A", italy);
        Divisi serieB = new Divisi("Serie B", italy);

//      set divisi
        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);

        // objek klub
        Klub ir = new Klub("Internazionale", serieA, italy);
        Klub ac = new Klub("Ac Milan", serieA,italy);
        Klub jp = new Klub("Juventus", serieB,italy);
        Klub lz = new Klub("Lazio", serieB,italy);

//        Set daftar Klub
        serieB.setDaftarKlub(lz);
        serieA.setDaftarKlub(ir);
        serieA.setDaftarKlub(ac);
        serieB.setDaftarKlub(jp);


        System.out.println("Nomor 1 = ");
        System.out.println("Liga Italy");
        italy.getDaftarDivisi("Italy");
        italy.getDaftarDivisi("Ital");
        System.out.println("Nomor 2 = ");
        System.out.println("Liga Italy");
        serieA.getDaftarKlubLiga("Italy");
        System.out.println("Liga Indonesia");
        serieA.getDaftarKlubLiga("Indonesia");
        System.out.println("Nomor 3(daftar klub by divisi) = ");
        System.out.println("Divisi Serie B = ");
        serieA.getDaftarKlubDivisi("Serie B");
        System.out.println("Divisi Serie A = ");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.println("Divisi Serie C = ");
        serieA.getDaftarKlubDivisi("Serie C");
        System.out.print("Nomor 4 = ");
        ac.getDivisi("Lazio");
        ac.getDivisi("Lazi");
        System.out.print("Nomor 5 = ");
        ac.getLiga("Lazio");


    }
}