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
        Liga idn = new Liga("Indonesia");

//      set liga
        italy.setDaftarLiga(idn);
        italy.setDaftarLiga(italy);

// intasisasi Divisi
        Divisi serieA = new Divisi("Serie A", italy);
        Divisi serieB = new Divisi("Serie B", italy);
        Divisi ISL = new Divisi("ISL", idn);
        Divisi IPL = new Divisi("IPL", idn);

//      set divisi
        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);
        idn.setDaftarDivisi(ISL);
        idn.setDaftarDivisi(IPL);

        // objek klub
        Klub ir = new Klub("Internazionale", serieA, italy);
        Klub ac = new Klub("Ac Milan", serieA,italy);
        Klub jp = new Klub("Juventus", serieB,italy);
        Klub lz = new Klub("Lazio", serieB,italy);
        Klub ar = new Klub("Arema", ISL,idn);
        Klub jk = new Klub("Persija", IPL,idn);

//        Set daftar Klub
        serieB.setDaftarKlub(lz);
        serieA.setDaftarKlub(ir);
        serieA.setDaftarKlub(ac);
        serieB.setDaftarKlub(jp);
        ISL.setDaftarKlub(ar);
        IPL.setDaftarKlub(jk);

        System.out.println("Nomor 1 = ");
        System.out.println("Italy");
        italy.getDaftarDivisi("Italy");
        System.out.println("Indonesia");
        italy.getDaftarDivisi("Indonesia");
        System.out.println("Nomor 2 = ");
        System.out.println("Italy");
        serieA.getDaftarKlubLiga("Italy");
        System.out.println("Indonesia");
        IPL.getDaftarKlubLiga("Indonesia");
        System.out.println("Nomor 3 = ");
        System.out.println("Serie B");
        serieA.getDaftarKlubDivisi("Serie B");
        System.out.println("Serie A");
        serieA.getDaftarKlubDivisi("Serie A");
        System.out.print("Nomor 4 = ");
        ac.getDivisi("Lazio");
        System.out.print("Nomor 5 = ");
        ac.getLiga("Lazio");


    }
}