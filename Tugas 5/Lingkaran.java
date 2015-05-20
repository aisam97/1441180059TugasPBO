class Lingkaran
{
	int radius;

	public void cetakKeLayar()
	{
		System.out.println("Lingkaran");
		System.out.println("Jari - jari = "+radius);
	}

	public  void ubahProperty(int radiusBaru)
	{
		radius = radiusBaru;	}

	public double hitungLuas()
	{
		double luas;
		luas = radius*radius*Math.PI;
		return luas;
	}

	public double hitungKeliling()
	{
		double keliling;
		keliling = 2*radius*Math.PI;
		return keliling;
	}	
}
class Segitiga
{
	double alas;
	double tinggi;

	public void cetakKeLayar()
	{
		System.out.println("Segitiga Siku - Siku");
		System.out.println("Alas: " + alas);
		System.out.println("Tinggi: "+ tinggi);
	}

	public  void ubahProperty(double alasBaru, double tinggiBaru)
	{
		alas = alasBaru;
		tinggi = tinggiBaru;
	}

	public double hitungLuas()
	{
		double luas;
		luas = 0.5*alas*tinggi;
		return luas;
	}

	public double hitungKeliling()
	{
		double keliling;
		double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
		keliling = alas+tinggi+sisiMiring;
		return keliling;
	}
}
