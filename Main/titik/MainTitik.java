public class MainTitik {
	public static void main(String[] args) {
    Titik koordinat1 = new Titik(0,0);
	System.out.println(koordinat1.toString());
	
	Titik koordinat2 = new Titik(4,6);
	System.out.println(koordinat2.toString());
	
	Titik koordinat3 = new Titik(-1,-2);
	System.out.println(koordinat3.toString());
	
	koordinat1.setX(7);
	System.out.println(koordinat1.toString());
	
	koordinat1.turun();
	System.out.println(koordinat1.toString());

	koordinat2.naik();
	System.out.println(koordinat2.toString());

	koordinat2.kanan();
	System.out.println(koordinat2.toString());

	koordinat3.kiri();
	System.out.println(koordinat3.toString());	
	
	koordinat3.serong(5,6);
	System.out.println(koordinat3.toString());		
	
	
	}
	

}