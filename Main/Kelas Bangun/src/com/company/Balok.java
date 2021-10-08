package com.company;

public class Balok extends Kotak {
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi){
        super(panjang,lebar);
        this.tinggi=tinggi;

    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public String getVolume(){
        return String.format("Volume %s", panjang * lebar * tinggi);
    }

    @Override
    public String toString() {
        return "Balok "+panjang+"x"+lebar+"x"+tinggi;
    }


}
