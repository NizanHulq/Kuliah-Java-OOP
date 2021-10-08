/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
import Bangun2D.PersegiPanjang;
/**
 *
 * @author aqil
 */
public class Balok extends PersegiPanjang {
    private double tinggi;
    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    @Override
    public double getLuas(){
        return 2 * (getPanjang()*getLebar() + getLebar()*tinggi + getPanjang()*tinggi);
    }
    @Override
    public double getKeliling(){
        return 4*(getPanjang()+getLebar()+tinggi);
    }
    public double getLuasAlas() {
        return super.getLuas();
    }
    public double getVolume(){
        return super.getLuas()*tinggi;
    }
    @Override
    public String toString(){
        return "Balok{panjang="+getPanjang()+", lebar="+getLebar()+", tinggi="+tinggi;
    }
}
