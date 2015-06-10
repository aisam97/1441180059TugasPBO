package tugas.tujuh;

/**
 * Created by Muhammad Isam on 10/06/2015.
 */
public class Brand{

    private String nama;
    private String HDD;
    private String layar;
    private String berat;

    public Brand(String nama, String HDD, String layar, String berat) {
        this.nama = nama;
        this.HDD = HDD;
        this.layar = layar;
        this.berat = berat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getLayar() {
        return layar;
    }

    public void setLayar(String layar) {
        this.layar = layar;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "nama='" + nama + '\'' +
                ", HDD='" + HDD + '\'' +
                ", layar='" + layar + '\'' +
                ", berat='" + berat + '\'' +
                '}';
    }
}
