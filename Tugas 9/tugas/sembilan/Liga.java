package tugas.sembilan;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;
import java.lang.String;

import static java.lang.String.*;

/**
 * Created by Muhammad Isam on 24/06/2015.
 */
public class Liga{
    private String namaLiga;
    ArrayList<Liga> daftarLiga = new ArrayList<Liga>();
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }
//    nomor 1
    public void getDaftarDivisi(String liga)
    {
        for (int i = 0; i < daftarLiga.size() ; i++)
        {
            Liga l = daftarLiga.get(i);
            if (liga == l.getNamaLiga())
            {
                for (int j = 0; j <daftarDivisi.size() ; j++)
                {
                    System.out.println(l.daftarDivisi.get(j));
                }
            }

        }

    }

    public void setDaftarDivisi(Divisi divisi)
    {
        this.daftarDivisi.add(divisi);
    }
    public void setDaftarLiga(Liga liga)
    {
        this.daftarLiga.add(liga);
    }

    @Override
    public String toString() {
        return "Liga " + namaLiga ;
    }

}
