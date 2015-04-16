import java.util.Scanner;
class Tabungan{

	// atribut simpanan, pemilik, no rek, bunga
	private int simpanan;
	private String pemilikRek;
	private int noRek;
	private static double bunga = 4.25;
	Scanner uang = new Scanner(System.in);
	public Tabungan()
	{
		simpanan 	= 2000000;
		pemilikRek 	= "DJ Arot";
		noRek 		= 1441180074;
	}

	public Tabungan(int s)
	{
		simpanan 	= s;
		pemilikRek 	= "Afrilda";
		noRek 		= 1441180001;
	}

	public Tabungan(int s, String p)
	{
		simpanan 	= s;
		pemilikRek 	= p;
		noRek 		= 1441180105;
	}

	public Tabungan(int s, String p, int n)
	{
		simpanan 	= s;
		pemilikRek 	= p;
		noRek 		= n;
	}

	// method menabung, mengambil, transfer, menerima transfer, cek saldo
	public void menabung()
	{
		System.out.print("Anda Menabung Sebesar  		= Rp.");
		int nabung = uang.nextInt();
		simpanan = simpanan + nabung;
	}
	public void mengambil()
	{
		System.out.print("Anda Mengambil Sebesar 		= Rp.");
		int ambil = uang.nextInt();
		simpanan = simpanan - ambil;
	}
	public void menransfer()
	{
		System.out.print("Anda Menransfer Sebesar		= Rp.");
		int transfer = uang.nextInt();
		simpanan = simpanan - transfer;
	}

	int rdm = (int) (Math.random()*500000);
	public void menerima()
	{
		simpanan = simpanan + rdm;
		System.out.println("Anda menerima transfer sebesar	= Rp."+rdm);
	}

	// getter
	public int getSimpanan()
	{
		return simpanan;
	}
	public String getPemilikRek()
	{
		return pemilikRek;
	}
	public int getNoRek()
	{
		return noRek;
	}
	public double getBunga()
	{
		return bunga;
	}
	// setter
	public int setSimpanan(int simpanan)
	{
		return this.simpanan = simpanan;
	}
	public void saldo()
	{
		System.out.println("Saldo Anda 			= Rp."+simpanan);
	}
}