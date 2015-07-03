package tugas.sembilan;

/**
 * Created by Muhammad Isam on 24/06/2015.
 */
public class Klub{
    private String namaKlub;
    private Divisi divisi;
    private Liga liga;

    public Klub( String namaKlub, Divisi divisi, Liga liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(String namaKlub) {
        this.namaKlub = namaKlub;
    }

// nomor 4
    public void getDivisi(String cari )
    {
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(i);
            for (int j = 0; j <divisi.daftarKlub.size() ; j++)
            {
            l.daftarKlub.get(j);
            Klub c = l.daftarKlub.get(j);
                if (cari == c.getNamaKlub())
                {
                    System.out.println(l.getNamaDivisi());
                }
            }
        }
    }

    public void setDivisi(Divisi divisi) {
        this.divisi = divisi;
    }
// nomor 5
    public void getLiga(String cari) {
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Divisi l = liga.daftarDivisi.get(i);
            for (int j = 0; j <divisi.daftarKlub.size() ; j++)
            {
                l.daftarKlub.get(j);
                Klub c = l.daftarKlub.get(j);
                if (cari == c.getNamaKlub())
                {
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Klub " + namaKlub;
    }

}
