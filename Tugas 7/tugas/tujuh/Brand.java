package tugas.tujuh;

/**
 * Created by Muhammad Isam on 10/06/2015.
 */
public class Brand{

    private String nama;
    private String negara;
    private int tahunBerdiri;
    private String situsWeb;

    public Brand(String nama, String negara, int tahunBerdiri, String situsWeb) {
        this.nama = nama;
        this.negara = negara;
        this.tahunBerdiri = tahunBerdiri;
        this.situsWeb = situsWeb;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getnegara() {
        return negara;
    }

    public void setnegara(String negara) {
        this.negara = negara;
    }

    public int gettahunBerdiri() {
        return tahunBerdiri;
    }

    public void settahunBerdiri(int tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }

    public String getsitusWeb() {
        return situsWeb;
    }

    public void setsitusWeb(String situsWeb) {
        this.situsWeb = situsWeb;
    }

    @Override
    public String toString() {
        return "Brand\n" +
                "Nama = " + nama +
                "\nNegara = " + negara +
                "\nTahun Berdiri = " + tahunBerdiri +
                "\nSitus Web = " + situsWeb;
    }
}
