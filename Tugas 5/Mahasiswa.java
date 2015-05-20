// Class Mahasiswa
class Mahasiswa
{
// Atribut Nama dan Umur
	
	private String NamaMahasiswa;
	private int UmurMahasiswa;
// Konstruktor menerima dan mengeset nilai Atribut
	
	public Mahasiswa(String nama, int umur)
	{
		NamaMahasiswa = nama;
		UmurMahasiswa = umur;
	}
// getter dan setter setiap atribut

	// NamaMahasiswa
	public void setNama(String nama)
	{
		NamaMahasiswa = nama;
	}
	public String getNama()
	{
		return NamaMahasiswa;
	}

	// UmurMahasiwa
	public void setUmur(int umur)
	{
		UmurMahasiswa = umur;
	}
	public int getUmur()
	{
		return UmurMahasiswa;
	}
// method menampilkan biodata serta semua atribut
	
	public void tampilkanBiodata()
	{
		System.out.println("::: BIODATA :::");
		System.out.println("Nama:\t"+NamaMahasiswa);
		System.out.println("Umur:\t"+UmurMahasiswa);
	}
}