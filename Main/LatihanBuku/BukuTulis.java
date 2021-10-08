public class BukuTulis extends Buku{
	private String merk;


	
	public BukuTulis(int jumlahHalaman, String merk ){
		super(jumlahHalaman);  /* untuk mengakses konstruktor di superclass*/
		this.merk=merk;
		
	}
	
	public String getMerk(){
		return merk;
	}
	public String getNamaPemilik(){
		return namaPemilik;
	}

	
	public void setMerk(String Merk){
		this.merk=merk;
	}
	public void setNamaPemilik(String namaPemilik){
		this.namaPemilik=namaPemilik;
	}
    @Override
    public String toString(){
        return " Pemilik buku: "+getNamaPemilik()+ "\n Merk buku: "+getMerk()+"\n jumlah halaman: "+getJumlahHalaman();
    }
}