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
public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi( double sisi){
        super(sisi,0);
        super.setTinggi(getTinggi());
    }
    @Override
    public double getTinggi(){
//        double tinggi = getAlas() * getAlas() - (getAlas()/2)*(getAlas()/2);
//        return Math.sqrt(tinggi);
        return Matematika.getLurus(getAlas(), getAlas()/2);
    }
    @Override
    public void setTinggi(double tinggi){
        double alasBaru = tinggi*tinggi*4/3;
        setAlas(Math.sqrt(alasBaru));
    }
    @Override
    public double getKeliling(){
        return getAlas()*3;
    }
    @Override
    public String toString(){
        return "alas : "+getAlas()+", tinggi : "+getTinggi();
    }
}
