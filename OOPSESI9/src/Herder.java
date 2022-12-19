
public class Herder extends Binatang implements SifatUnikHerder{

	public Herder(String nama) {
		super(nama);
		// TODO Auto-generated constructor stub
	}
	
	// Menggunakan override untuk metode makan karena jenis makanan ketiga hewan tersebut tidak sama
	@Override
	public void makan() {
		// TODO Auto-generated method stub
		System.out.println(this.getNama() + " Sedang makan dog food Royal Canin");
	}

	// Menggunakan override untuk metode keunikan karena keunikan ketiga hewan tersebut tidak sama
	@Override
	public void keunikanherder() {
		// TODO Auto-generated method stub
		System.out.println(this.getNama() + " Memiliki kecerdasan yang tinggi");
	}
	
	
	

}
