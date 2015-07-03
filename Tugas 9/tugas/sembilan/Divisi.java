package tugas.sembilan;

import java.util.ArrayList;

public class Divisi{

    private String namaDivisi;
    private Liga liga;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    public Divisi(String namaDivisi, Liga liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public ArrayList<Klub> getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    //    nomor 2

   public void getDaftarKlubLiga(String ligaCari)
   {
       if (ligaCari == liga.getNamaLiga())
       {
           for (int i = 0; i < liga.daftarDivisi.size() ; i++)
           {
               Divisi l = liga.daftarDivisi.get(i);
               System.out.println(l.getNamaDivisi());
               for (int j = 0; j <daftarKlub.size() ; j++)
               {
                   System.out.println(l.daftarKlub.get(j));
               }
           }
       }
       else
       {
           System.out.println("Tidak Dapat Ditemukan");
       }
   }
//    nomor 3
   public void getDaftarKlubDivisi(String divisiCari)
   {
       for (int i = 0; i < liga.daftarDivisi.size() ; i++)
       {
           Divisi l = liga.daftarDivisi.get(i);
           if (divisiCari == l.getNamaDivisi())
           {
               for (int j = 0; j <daftarKlub.size() ; j++)
               {
                   System.out.println(l.daftarKlub.get(j));
               }
           }
       }
           for (int i = 0; i < liga.daftarDivisi.size() ; i++)
           {
               Divisi l = liga.daftarDivisi.get(0);
               Divisi k = liga.daftarDivisi.get(1);
               if (divisiCari != k.getNamaDivisi())
               {
                   if (divisiCari != l.getNamaDivisi())
                   {
                       System.out.println("Tidak Ketemu");
                       break;
                   }
               }
           }

   }

    @Override
    public String toString() {
        return  "Divisi " + namaDivisi;
    }

}
