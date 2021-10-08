public class Mobil{
	String noPlat;
	int v;
	char gigi;
	
	public Mobil(){
		v = 0;
		gigi = 'N';
	}
	public Mobil(String noPlat){
		this.noPlat=noPlat;
		this.gigi = gigi;
		this.v = v;
		

	}
	public void setNoPlat(String noPlat){
		this.noPlat=noPlat;
	}
	public void setV(int v){
		this.v=v;
	}
	public void setGigi(char gigi){
		this.gigi=gigi;
	}
	public String getNoPlat(){
		return noPlat;
	}
	public int getV(){
		return v;
	}
	public char getGigi(){
		return gigi;
	}
	
	
	
	public void oper(char gigi){
		if (v >= 0){
			this.gigi = gigi;
		}
		else if (v <= 0){
			this.gigi = gigi;
		}
		else{
			this.gigi = gigi;
		}
	}
	
	public void gas(){
		if (gigi == 'D'){
			v++;
		}
		else if (gigi == 'R') { 
			v--;
		}
	}
	
	public void rem(){
		if (v > 0){
			v--;
		}
		else if (v < 0){
			v++;
		}
	}
	
	public String toString(){
		return "Mobil dengan nomor plat "+noPlat+" melaju dengan kecepatan "+v+" Km/h"+" pada posisi perseneling di "+gigi;
	}

}