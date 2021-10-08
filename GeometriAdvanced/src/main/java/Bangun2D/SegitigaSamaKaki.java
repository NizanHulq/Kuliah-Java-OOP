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
public class SegitigaSamaKaki extends Segitiga {
    public SegitigaSamaKaki(double alas, double tinggi){
        super(alas,tinggi);
    }
    @Override
    public double getKeliling(){
        return getAlas() + 2*getSisiMiring();
    }
    public double getSisiMiring(){
        //return Math.sqrt(Math.pow(getAlas()/2, 2) + Math.pow(getTinggi(),2));
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }
    @Override 
    public String toString(){
        return "alas : "+getAlas()+", tinggi : "+getTinggi();
    }
}