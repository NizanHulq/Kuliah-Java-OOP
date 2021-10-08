public class Mahasiswa {
    int NIM;
	String nama;
	
		public Mahasiswa(){
			
		}
		public Mahasiswa(int NIM,String nama){
			this.NIM=NIM;
			this.nama=nama;
		}
		public String getNama(){
			return nama;
		}
		public void setNama(String nama){
			this.nama=nama;
		}
		public String sayHI(){
			return "Halo, nama saya"+getNama();
		}
}
