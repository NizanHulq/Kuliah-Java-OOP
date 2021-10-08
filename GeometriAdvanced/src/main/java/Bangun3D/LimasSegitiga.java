/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
import Bangun2D.Segitiga;
import Bangun2D.SegitigaSikuSiku;
import Bangun2D.SegitigaSamaKaki;
import Bangun2D.SegitigaSamaSisi;
/**
 *
 * @author aqil
 */
public class LimasSegitiga extends Limas {
    private Segitiga alas;
    public LimasSegitiga(Segitiga alas, double tinggi){
        super(tinggi);
        this.alas = alas;
    }
    public Segitiga getAlas(){
        return alas;
    }
    public void setAlas(Segitiga alas){
        this.alas = alas;
    }
    public String getDetailAlas(){
        if (alas instanceof SegitigaSikuSiku){
            return "Segitiga Siku Siku";
        } else if (alas instanceof SegitigaSamaKaki){
            return "Segitiga Sama Kaki";
        } else if (alas instanceof SegitigaSamaSisi){
            return "Segitiga Sama Sisi";
        } else {
            return "Segitiga";
        }
    }
    public double getLuasAlas(){
        return alas.getLuas();
    }
    public double getKelilingAlas(){
        return alas.getKeliling();
    }
    @Override
    public String toString(){
        return "Limas Persegi {sisi alas : "+alas+", tinggi : "+super.getTinggi()+"}";
    }
}
