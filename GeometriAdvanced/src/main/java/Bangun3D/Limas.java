/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
/**
 *
 * @author aqil
 */
public abstract class Limas {
    private double tinggi;
    public Limas(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getVolume(){
        return this.getLuasAlas() * tinggi / 3;
    }
    public abstract double getLuasAlas();
    public abstract double getKelilingAlas();
    public abstract String getDetailAlas();
    @Override
    public String toString(){
        return "Limas{tinggi: "+tinggi+"}";
    }
}
