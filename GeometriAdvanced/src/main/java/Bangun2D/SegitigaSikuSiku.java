/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun2D;
import Master.Matematika;
/**
 *
 * @author aqil
 */
public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(double alas, double tinggi){
        super(alas, tinggi);
    }
    @Override
    public double getKeliling(){
        return getAlas() + getTinggi() + getSisiMiring();
    }
    public double getSisiMiring(){
        //return Math.sqrt( getAlas()*getAlas() + getTinggi()*getTinggi() );
        return Matematika.getMiring(getAlas(), getTinggi());
    }
    @Override 
    public String toString(){
        return "alas : "+getAlas()+", tinggi : "+getTinggi()+", Sisi Miring : "+getSisiMiring();
    }
}
