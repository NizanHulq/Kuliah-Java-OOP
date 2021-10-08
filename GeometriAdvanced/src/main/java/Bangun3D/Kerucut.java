/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
import Master.Matematika;
/**
 *
 * @author aqil
 */
public class Kerucut extends Tabung {
    //private double phi = 22/7;
    public Kerucut(double r, double tinggi){
        super(r,tinggi);
    }
    public double getLuas(){
        return getLuasAlas() + Matematika.phi*getR()*getSisiMiring();
    }
    public double getSisiMiring(){
//        double s = getR()*getR() + getTinggi()*getTinggi();
//        return Math.sqrt(s);
        return Matematika.getMiring(getR(), getTinggi());
    }
    public double getVolume(){
        return super.getVolume()/3;
    }
    @Override
    public String toString(){
        return "Kerucut{r="+getR()+", tinggi="+getTinggi();
    }
}
