package tugas.delapan;

/**
 * Created by Muhammad Isam on 17/06/2015.
 */
public class TestUnit {

    public static void main(String[] args) {

//      Membuat objek rekening
        Rekening satu = new Rekening(50000000.0);
//      Membuat objek nasabah
        Nasabah dua = new Nasabah("Isam",satu);

        System.out.println(dua.toString());

//        tarik 10jt
        satu.tarik(10000000.0);
        System.out.println(dua.getSaldo());

//        setor 20jt
        satu.setor(20000000.0);
        System.out.println(dua.getSaldo());
    }
}
