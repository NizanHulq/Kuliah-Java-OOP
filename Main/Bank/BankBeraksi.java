import java.util.Scanner;

public class BankBeraksi {
  public static void main(String[] args){
	  
	Scanner input = new Scanner(System.in);
	  Bank ABC = new Bank ();
	  System.out.println("Selamat Datang Di Bank ABC");
		System.out.println("======================="); 
	  System.out.println(ABC.toString());

		System.out.println(" ");
		System.out.print(" Masukkan nominal uang yang akan anda simpan Rp. ");		
	int simpan = input.nextInt();
 
	  System.out.println("Simpan uang: Rp. " + simpan  ); 
	  ABC.setSimpanUang(simpan);
	  System.out.println(ABC.toString());
	 

		System.out.println("");	 
		System.out.print(" Masukkan nominal uang yang akan anda ambil Rp. ");	
	int ambil = input.nextInt();
	
	  System.out.println("Ambil uang: Rp. " + ambil );
	  ABC.setAmbilUang(ambil);
	  System.out.println(ABC.toString());  

  }  
}
