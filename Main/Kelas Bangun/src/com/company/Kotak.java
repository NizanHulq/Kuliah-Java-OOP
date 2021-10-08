package com.company;

public class Kotak {
    int panjang, lebar;


    public Kotak(int panjang, int lebar ){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    public int getPanjang() {
        return panjang;

    }

    public int getLebar() {
        return lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public String toString() {
        return "Kotak " + panjang + "x" + lebar
                ;
    }
}
