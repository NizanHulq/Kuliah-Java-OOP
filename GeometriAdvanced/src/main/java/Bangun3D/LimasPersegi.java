/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
import Bangun2D.Persegi;
/**
 *
 * @author aqil
 */
public class LimasPersegi extends Limas {
    private Persegi alas;
    public LimasPersegi(Persegi alas, double tinggi){
        super(tinggi);
        this.alas = alas;
    }
    public Persegi getAlas(){
        return alas;
    }
    public void setAlas(Persegi alas){
        this.alas = alas;
    }
    public double getLuasAlas(){
        return alas.getLuas();
    }
    public double getKelilingAlas(){
        return alas.getKeliling();
    }
    public String getDetailAlas(){
        return "Persegi";
    }
    @Override
    public String toString(){
        return "Limas Persegi {sisi alas : "+alas+", tinggi : "+super.getTinggi()+"}";
    }
}
