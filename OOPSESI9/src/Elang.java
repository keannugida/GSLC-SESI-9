
public class Elang extends Binatang implements SifatUnikElang {
	
	public Elang(String nama) {
		super(nama);
		// TODO Auto-generated constructor stub
	}


	// Menggunakan override untuk metode makan karena jenis makanan ketiga hewan tersebut tidak sama
	@Override
	public void makan() {
		// TODO Auto-generated method stub
		System.out.println(this.getNama() + " Sedang makan tikus");
	}
	
	// Menggunakan override untuk metode keunikan karena keunikan ketiga hewan tersebut tidak sama
	@Override
	public void keunikanelang() {
		// TODO Auto-generated method stub
		System.out.println(this.getNama() + " Memiliki pengelihatan yang tajam");
	}




	
	

}
