
public class Persia extends Binatang implements SifatUnikPersia{
	
	public Persia(String nama) {
		super(nama);
		// TODO Auto-generated constructor stub
	}

	// Menggunakan override untuk metode makan karena jenis makanan ketiga hewan tersebut tidak sama
	@Override
	public void makan() {
		// TODO Auto-generated method stub
		System.out.println(this.getNama() + " Sedang makan daging");
	}
	
	// Menggunakan override untuk metode keunikan karena keunikan ketiga hewan tersebut tidak sama
	@Override
	public void keunikanpersia() {
		// TODO Auto-generated method stub
		System.out.println(this.getNama() + " Memiliki hidung yang pesek");
	}
	
	
	

}
