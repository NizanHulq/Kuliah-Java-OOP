package com.company;

public class Main {

    public static void main(String[] args) {

    	System.out.println("===Persegi Panjang===");
	PersegiPanjang pp = new PersegiPanjang(5,2);
	System.out.println(pp);
	System.out.println(pp.getLuas());
	System.out.println(pp.getKeliling());

		System.out.println("===Balok===");
	Balok b = new Balok(3,2,6);
		System.out.println(b);
	System.out.println(b.getVolume());


		System.out.println("===Kotak===");
	Kotak k = new Kotak(3,4);
	System.out.println(k);



    }
}
