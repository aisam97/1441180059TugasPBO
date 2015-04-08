class TestLaptop{
public static void main(String[] args) {

		Laptop lSatu = new Laptop();
		Laptop lDua = new Laptop("Acer","Putih");
		Laptop lTiga = new Laptop("Asus", "Merah", "Tidak Terhubung");
		Laptop lEmpat = new Laptop("Dell", "Biru", "Terhubung", 90);

		System.out.println("Merk = "+ lSatu.getMerk() +" Warna = "+lSatu.getWarna()+" Wifi = "+lSatu.getWifi()+" Baterai = "+lSatu.getBaterai());
		System.out.println("Merk = "+ lDua.getMerk() +" Warna = "+lDua.getWarna()+" Wifi = "+lDua.getWifi()+" Baterai = "+lDua.getBaterai());
		System.out.println("Merk = "+ lTiga.getMerk() +" Warna = "+lTiga.getWarna()+" Wifi = "+lTiga.getWifi()+" Baterai = "+lTiga.getBaterai());
		System.out.println("Merk = "+ lEmpat.getMerk() +" Warna = "+lEmpat.getWarna()+" Wifi = "+lEmpat.getWifi()+" Baterai = "+lEmpat.getBaterai());
		
		//setter
		lSatu.setMerk("Samsung");
		System.out.println("Merk = "+ lSatu.getMerk() +" Warna = "+lSatu.getWarna()+" Wifi = "+lSatu.getWifi()+" Baterai = "+lSatu.getBaterai());

		}
}