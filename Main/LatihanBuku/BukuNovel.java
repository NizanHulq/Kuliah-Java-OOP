public class BukuNovel extends Buku{
	private String judul;
	private String namaPenerbit;
	private String namaPenulis;

	
	public BukuNovel(String judul, int jumlahHalaman, String namaPenulis, String namaPenerbit ){
		super(jumlahHalaman);  // untuk mengakses atribut di superclass 
		this.judul=judul;
		this.namaPenulis=namaPenulis;
		this.namaPenerbit=namaPenerbit;
		
	}
	
	public String getJudul(){
		return judul;
	}
	public String getNamaPenulis(){
		return namaPenulis;
	}
	public String getNamaPenerbit(){
		return namaPenerbit;
	}
	
	public void setJudul(String judul){
		this.judul=judul;
	}
	public void setNamaPenulis(String namaPenulis){
		this.namaPenulis=namaPenulis;
	}
	public void setNamaPenerbit(String namaPenerbit){
		this.namaPenerbit=namaPenerbit;
	}
    public String toString(){
        return " Judul buku: "+getJudul()+ " Penerbit: "+getNamaPenerbit();
    }
}