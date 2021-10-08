import java.math.*;

public class Garis {
   Titik titikAwal, titikAkhir;
	

	public Garis(Titik titikAw, Titik titikAk){
			titikAwal=titikAw; // this.x variabel berarti dari class, kalo = x nya itu di parameter inputan
			titikAkhir=titikAk;
	}

	public Titik getTitikAwal(){
		return titikAwal;
	}
	public void setTitikAwal(Titik titik){
		titikAwal=titik;
	}
	
	public Titik getTitikAkhir(){
		return titikAkhir;
	}
	public void setTitikAkhir(Titik titik){
		titikAkhir=titik;
	}
	
	
	public double getPanjang(){
		double jarakX=Math.pow(titikAkhir.getX()-titikAwal.getX(), 2);
		double jarakY=Math.pow(titikAkhir.getY()-titikAwal.getY(), 2);
		double jarak=Math.pow(jarakX+jarakY, 0.5);
		return jarak;
	}
	
	
	public String toString(){
		return " Garis dari "+titikAwal+"sampai"+titikAkhir;
		}
	
}

