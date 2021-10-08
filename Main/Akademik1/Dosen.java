public class Dosen {
    String fakultas;
	String nama;
	String gelar;
	boolean isMale;
	
		public Dosen(){
			
		}
		public Dosen(String fakultas,String nama, String gelar, boolean isMale){
			this.fakultas=fakultas;
			this.nama=nama;
			this.gelar=gelar;
			this.isMale=isMale;
		}
		public String getNama(){
			return nama;
		
		//public void setNama(String nama){
		//	this.nama=nama;
		}
		public String sayHI(){
			return "Halo, nama saya "+getNama();
		}
}
