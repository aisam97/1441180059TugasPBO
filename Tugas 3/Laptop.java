class Laptop{
		private  String merk;
		private  String warna;
		private  String wifi;
		private  int baterai;

		public Laptop()
		{
		
		  merk 		= "Toshiba";
		  warna 	= "Hitam";
		  wifi 		= "Terhubung";
		  baterai 	= 80;

		}

		public Laptop(String merkInput, String warnaInput)
		{
			
			merk 	= merkInput;
			warna 	= warnaInput;
			wifi 	= "Terhubung";
			baterai = 88;

		}

		public Laptop(String merkInput, String warnaInput, String wifiInput)
		{
			
			merk 	= merkInput;
			warna 	= warnaInput;
			wifi 	= wifiInput;
			baterai = 45;

		}

		public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
		{

			merk 	= merkInput;
			warna 	= warnaInput;
			wifi 	= wifiInput;
			baterai = bateraiInput;

		}

		public void menyala()
		{

			System.out.println("Welcome to Laptop");

		}

		public void mati()
		{

			System.out.println("Thankyou have a nice day");

		}

		public void indikatorBaterai()
		{

			System.out.println("Baterai tinggal : " + baterai + "%");

		}

		public void indikatorWifi()
		{

			System.out.println("Wifi : " + wifi);

		}

		// getter
		public String getMerk()
		{
			return merk;
		}
		public String getWarna()
		{
			return warna;
		}
		public String getWifi()
		{
			return wifi;
		}
		public int getBaterai()
		{
			return baterai;
		}

		//setter
		public String setMerk(String merk)
		{
			return this.merk = merk;
		}
		public String setWarna(String warna)
		{
			return this.warna = warna;
		}
		public String setWifi(String wifi)
		{
			return this.wifi = wifi;
		}
		public int setBaterai(int baterai)
		{
			return this.baterai = baterai;
		}
		
}