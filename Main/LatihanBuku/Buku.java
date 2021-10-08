public class Buku{
	int jumlahHalaman;
	String namaPemilik;
	
	public Buku(int jumlahHalaman, String namaPemilik){
		this.jumlahHalaman=jumlahHalaman;
		this.namaPemilik=namaPemilik;
	}
	public Buku(int jumlahHalaman){
		this.jumlahHalaman=jumlahHalaman;

	}
	
	
	public int getJumlahHalaman(){
		return jumlahHalaman;
	}
	
	public String getNamaPemilik(){
		return namaPemilik;
	}
	
	public void setJumlahHalaman(int jumlahHalaman){
		this.jumlahHalaman=jumlahHalaman;
	}
	public void setNamaPemilik(String namaPemilik){
		this.namaPemilik=namaPemilik;
	}
}
