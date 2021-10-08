/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
import Bangun2D.Lingkaran;
/**
 *
 * @author aqil
 */
public class LimasLingkaran extends Limas {
    private Lingkaran alas;
    public LimasLingkaran(Lingkaran alas, double tinggi){
        super(tinggi);
        this.alas = alas;
    }
    public Lingkaran getAlas(){
        return alas;
    }
    public void setAlas(Lingkaran alas){
        this.alas = alas;
    }
    public double getLuasAlas(){
        return alas.getLuas();
    }
    public double getKelilingAlas(){
        return alas.getKeliling();
    }
    public String getDetailAlas(){
        return "Lingkaran";
    }
    @Override 
    public String toString(){
        return "Limas Lingkaran { alas : "+alas+", tinggi : "+super.getTinggi()+"}";
    }
    
}
