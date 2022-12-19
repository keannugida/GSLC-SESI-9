
public class Main {

	public Main() {
	/* PENJELASAN PROGRAM 
	 	Program ini dibuat untuk menampilkan jenis makanan dan sifat yang unik dari ketiga binatang ini, yaitu burung 
	 	elang, anjing herder, dan kucing persia. Saya membuat abstract parent class Binatang untuk child class Elang, 
	 	Herder, dan Persia. Kemudian saya membuat metode makan yang akan di override pada class Elang, Herder, dan 
	   	Persia. Untuk metode keunikan dari ketiga hewan tersebut, saya membuat tiga interface untuk masing-masing hewan
	   	dan akan melakukan implements di masing-masing class hewan tersebut.
	   	Tujuan dari program ini adalah untuk mengetahui metode penggunaan abstract class dan interface dan perbedaannya.
	 */
		// Membuat objek Elang
		Elang elang1 = new Elang("Burung Elang");
		elang1.makan(); // Menampilkan jenis makanan burung elang
		elang1.keunikanelang(); // Menampilkan keunikan burung elang
		System.out.println();
		
		// Membuat objek Herder
		Herder herder1 = new Herder("Anjing Herder");
		herder1.makan(); // Menampilkan jenis makanan anjing herder
		herder1.keunikanherder(); // Menampilkan keunikan anjing herder
		System.out.println();
		
		// Membuat objek Persia
		Persia persia1 = new Persia("Kucing Persia");
		persia1.makan(); // Menampilkan jenis makanan kucing persia
		persia1.keunikanpersia(); // Menampilkan keunikan kucing persia
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
