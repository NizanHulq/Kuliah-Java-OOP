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
public class LimasPersegiPanjang extends Limas {
    private PersegiPanjang alas;
    public LimasPersegiPanjang(PersegiPanjang alas, double tinggi){
        super(tinggi);
        this.alas = alas;
    }
    public PersegiPanjang getAlas(){
        return alas;
    }
    public void setAlas(PersegiPanjang alas){
        this.alas = alas;
    }
    public double getLuasAlas(){
        return alas.getLuas();
    }
    public double getKelilingAlas(){
        return alas.getKeliling();
    }
    public String getDetailAlas(){
        return "Persegi Panjang";
    }
    @Override
    public String toString(){
        return "Limas Persegi {alas : "+alas+", tinggi : "+super.getTinggi()+"}";
    }
}
