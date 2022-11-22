import java.util.Scanner;
	public class tank {
		String namaProdusen;
		int kapasitasBerat;
		int jumlahPenumpang;
		int tahunProduksi;
		boolean masihLayakTempur;
		
		public tank(String namaProdusen, int  kapasitasBerat, int tahunProduksi) {
			this.namaProdusen = namaProdusen;
			this.kapasitasBerat = kapasitasBerat;
			this.tahunProduksi = tahunProduksi;
			this.masihLayakTempur = true;
			this.jumlahPenumpang = 0;
		}
		public boolean tempur(int kapasitasBeratTempur) {
			
			if(masihLayakTempur && kapasitasBerat >= kapasitasBeratTempur && tahunProduksi >2014){
				this.jumlahPenumpang ++;
				if(jumlahPenumpang > 5 ) {
					masihLayakTempur = false;
				}
				return true;
			}
			else{
				return false;
			}
		}
		
		public int getJumlahkapasitasBerat(){
			return kapasitasBerat;
		}
		public boolean getmasihLayakTempur(){
			return masihLayakTempur;
		}
		public int getJumlahPenumpang(){
			return jumlahPenumpang;
		}
		public int getTahunProduksi(){
			return tahunProduksi;
		}
		public static void main (String args[]){
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Masukkan Nama Produsen: ");
			String namaProdusen = keyboard.nextLine();
			System.out.print("Masukkan kapasitas Berat: ");
			int kapasitasBerat = keyboard.nextInt();
			System.out.print("Masukkan tahun Produksi: ");
			int tahunProduksi = keyboard.nextInt();
			tank Tank = new tank(namaProdusen, kapasitasBerat, tahunProduksi);
			while(keyboard.hasNextLine()){
				System.out.println("Apakah tank akan tempur ? (y/n)");
			if(keyboard.nextLine().equals("y")){
			System.out.println("Berapa berat nya? ");
			int kapasitasBeratTempur = keyboard.nextInt();
			if(Tank.tempur(kapasitasBeratTempur)){
				System.out.println("tank tempur");
			}
			else{
				System.out.println("tank tidak boleh Tempur");
			}
			}
			}
		}
	}

	
								 