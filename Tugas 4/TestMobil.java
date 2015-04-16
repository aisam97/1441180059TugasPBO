class TestMobil{

	public static void main(String[] args) {
		
		Mobil toyota = new Mobil(50, "Di Jalan SoeHat", "N 1111 N", "Toyota", "Hitam Metalic", "Toyota INZ-FE 2500cc");
		Mobil suzuki = new Mobil(200, "Di Veteran", "M 154 M", "Toyota", "Hitam Metalic", "Turbo Charger 5000cc");

		System.out.println("Mobil Toyota:\nKecepatan\t: "+toyota.getKec()+"Km/hour"+"\nPosisi\t\t: "+toyota.getPosisi()+"\nNomor Plat\t: "+toyota.getNoplat()+"\nMerk\t\t: "+toyota.getMerk()+"\nWarna\t\t: "+toyota.getWarna()+"\nMesin\t\t: "+toyota.getMesin());
		
		System.out.println();
		toyota.maju();
		toyota.ngebut();
		toyota.ngerem();	
		toyota.mundur();
		toyota.belok();
		toyota.berhenti();
		
		System.out.println();
		System.out.println("Mobil Suzuki:\nKecepatan\t: "+suzuki.getKec()+"Km/hour"+"\nPosisi\t\t: "+suzuki.getPosisi()+"\nNomor Plat\t: "+suzuki.getNoplat()+"\nMerk\t\t: "+suzuki.getMerk()+"\nWarna\t\t: "+suzuki.getWarna()+"\nMesin\t\t: "+suzuki.getMesin());

		System.out.println();
		suzuki.maju();
		suzuki.ngebut();
		suzuki.ngerem();
		suzuki.mundur();
		suzuki.belok();
		suzuki.berhenti();

		System.out.println();
		System.out.println("Setelah Modif: \n");
		toyota.setKec(300);
		toyota.setMesin("Toyota INZ-FE 2500cc + Nos>");
		toyota.setWarna("Blue Metalic"); 
		toyota.setNoplat("H 4 NA");
	
		System.out.println("Mobil :\nKecepatan\t: "+toyota.getKec()+"Km/hour"+"\nPosisi\t\t: "+toyota.getPosisi()+"\nNomor Plat\t: "+toyota.getNoplat()+"\nMerk\t\t: "+toyota.getMerk()+"\nWarna\t\t: "+toyota.getWarna()+"\nMesin\t\t: "+toyota.getMesin());


	}

	
}