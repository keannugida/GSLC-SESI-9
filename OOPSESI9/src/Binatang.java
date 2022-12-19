
public abstract class Binatang {
	// class Binatang menjadi parent class untuk child class Elang, Herder, Persia
	private String nama;

	// Constructor
	public Binatang(String nama) {
		super();
		this.nama = nama;
	}
	
	// Getter Setter
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public abstract void makan();
}
