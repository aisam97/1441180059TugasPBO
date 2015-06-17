package tugas.delapan;

/**
 * Created by Muhammad Isam on 17/06/2015.
 */
public class Nasabah {

    private String Nama;
    private Rekening saldo;

    public Nasabah(String nama, Rekening saldo) {
        Nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public Rekening getSaldo() {
        return saldo;
    }

    public void setSaldo(Rekening saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "saldo=" + saldo +
                ", Nama='" + Nama + '\'' +
                '}';
    }
}
