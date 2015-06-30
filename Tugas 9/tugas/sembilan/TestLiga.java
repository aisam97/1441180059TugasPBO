package tugas.sembilan;

import com.sun.org.apache.xpath.internal.operations.Div;

/**
 * Created by Muhammad Isam on 24/06/2015.
 */
public class TestLiga {

    public static void main(String[] args) {
        // write your code here
        Liga italy = new Liga("Italy");
        Divisi serieA = new Divisi("Serie A",italy);
        Divisi serieB = new Divisi("Serie B",italy);

        italy.setDaftarDivisi(serieA);
        italy.setDaftarDivisi(serieB);

        // objek klub
        Klub inter = new Klub("Internazionale",serieA,italy);
        Klub ac = new Klub("Ac Milan",serieA,italy);
        Klub jp = new Klub("Juventus B",serieB,italy);
        Klub fn = new Klub("Fiorentina B",serieB,italy);
        serieA.setDaftarKlub(inter);
        italy.setDaftarKlub(inter);
        serieA.setDaftarKlub(ac);
        italy.setDaftarKlub(ac);
        serieB.setDaftarKlub(jp);
        italy.setDaftarKlub(jp);
        serieB.setDaftarKlub(fn);
        italy.setDaftarKlub(fn);
        System.out.println("Daftar Divisi dalam Liga Italy = "+italy.getDaftarDivisi());
        System.out.println("Daftar Klub dalam Liga Italy = "+italy.getDaftarKlub());
        System.out.println("Daftar Klub dalam Divisi Serie A = "+serieA.getDaftarKlub());
        System.out.println("Daftar Klub dalam Divisi Serie B = "+serieB.getDaftarKlub());
        System.out.println("Internazionale dalam Divisi = "+inter.getDivisi());
        System.out.println("Internazionale dalam Liga = "+inter.getLiga());
        System.out.println("Juventus dalam Divisi = "+jp.getDivisi());
        System.out.println("Juventus dalam Liga = "+jp.getLiga());


    }
}
