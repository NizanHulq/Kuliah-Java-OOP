package com.company;

public class PersegiPanjang extends Kotak {


    public PersegiPanjang(int panjang, int lebar){
        super(panjang, lebar);
    }

    public String getLuas(){
        return "Luas "+ (panjang * lebar);
    }
    public  Object getKeliling(){
        return "Keliling "+ (panjang*2 + lebar*2);
    }

    @Override
    public String toString() {
        return "PersegiPanjang "+panjang+"x"+lebar;
    }
}
