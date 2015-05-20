public class TestBangun
{
	public static void main(String[] args)
	{
		Lingkaran circle = new Lingkaran();
		
		circle.radius = 14;
				
		circle.cetakKeLayar();

		System.out.println("Luas = " + circle.hitungLuas());

		System.out.println("Keliling = " + circle.hitungKeliling());

		circle.ubahProperty(21);
		
		System.out.println("Property baru =");
		
		circle.cetakKeLayar();		

		System.out.println("Luas baru = " + circle.hitungLuas());

		System.out.println("Keliling baru = " + circle.hitungKeliling());
		
		Segitiga segi = new Segitiga();
		
		segi.alas = 3;
		segi.tinggi = 4;
				
		segi.cetakKeLayar();

		System.out.println("Luas = " + segi.hitungLuas());

		System.out.println("Keliling = " + segi.hitungKeliling());

		segi.ubahProperty(9,15);
		
		System.out.println("Property baru =");
		
		segi.cetakKeLayar();		

		System.out.println("Luas baru = " + segi.hitungLuas());

		System.out.println("Keliling baru = " + segi.hitungKeliling());

	}
}
