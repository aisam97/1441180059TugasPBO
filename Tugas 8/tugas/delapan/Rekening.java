package tugas.delapan;

/**
 * Created by Muhammad Isam on 17/06/2015.
 */
public class Rekening {

    private double saldo;

    public Rekening(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tarik(double jumlah){
        saldo = saldo - jumlah;
    }

    public void setor(double jumlah){
        saldo = saldo + jumlah;
    }


    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
}
