class TestLaptop{
public static void main(String[] args) {

		Laptop lSatu = new Laptop();
		Laptop lDua = new Laptop("Acer","Putih");
		Laptop lTiga = new Laptop("Asus", "Merah", "Terputus");
		Laptop lEmpat = new Laptop("Dell", "Biru", "Terhubung", 90);

		lSatu.menyala();
		System.out.println("Laptop Pertama	: Merk = "+ lSatu.getMerk() +" Warna = "+lSatu.getWarna()+"	Wifi = "+lSatu.getWifi()+" Baterai = "+lSatu.getBaterai());
		lSatu.indikatorBaterai();
		lSatu.indikatorWifi();
		lDua.menyala();
		System.out.println("Laptop Kedua	: Merk = "+ lDua.getMerk() +"	 Warna = "+lDua.getWarna()+"	Wifi = "+lDua.getWifi()+" Baterai = "+lDua.getBaterai());
		lDua.mati();
		lDua.indikatorBaterai();
		lDua.indikatorWifi();
		lSatu.mati();
		lTiga.menyala();
		System.out.println("Laptop Ketiga	: Merk = "+ lTiga.getMerk() +"	 Warna = "+lTiga.getWarna()+"	Wifi = "+lTiga.getWifi()+"  Baterai = "+lTiga.getBaterai());
		lTiga.mati();
		lTiga.indikatorBaterai();
		lTiga.indikatorWifi();
		lEmpat.menyala();
		System.out.println("Laptop Keempat	: Merk = "+ lEmpat.getMerk() +"	 Warna = "+lEmpat.getWarna()+"	Wifi = "+lEmpat.getWifi()+" Baterai = "+lEmpat.getBaterai());
		lEmpat.indikatorBaterai();
		lEmpat.indikatorWifi();
		lEmpat.mati();
		//setter
		System.out.println("Setelah Setter");
		lSatu.setMerk("Samsung"); lSatu.setWarna("Hijau"); lSatu.setWifi("Terputus"); lSatu.setBaterai(100);
		lSatu.menyala();
		System.out.println("Laptop Pertama	: Merk = "+ lSatu.getMerk() +" Warna = "+lSatu.getWarna()+"	Wifi = "+lSatu.getWifi()+"  Baterai = "+lSatu.getBaterai());
		lSatu.indikatorBaterai();
		lSatu.indikatorWifi();
		lSatu.mati();
		lEmpat.setBaterai(100);
		lEmpat.menyala();
		System.out.println("Laptop Keempat	: Merk = "+ lEmpat.getMerk() +"	 Warna = "+lEmpat.getWarna()+"	Wifi = "+lEmpat.getWifi()+" Baterai = "+lEmpat.getBaterai());
		lEmpat.indikatorBaterai();
		lEmpat.indikatorWifi();
		lEmpat.mati();
				}
}