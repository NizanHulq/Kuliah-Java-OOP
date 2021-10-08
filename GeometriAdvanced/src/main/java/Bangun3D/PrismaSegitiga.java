/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun3D;
import Bangun2D.*;
/**
 *
 * @author aqil
 */
public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggi;
    public PrismaSegitiga(Segitiga alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public Segitiga getAlas(){
        return alas;
    }
    public void setAlas(Segitiga alas){
        this.alas = alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getLuas(){
        return 2 * alas.getLuas() + alas.getKeliling()*tinggi;
    }
    public double getVolume(){
        return alas.getAlas() * tinggi;
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
    @Override
    public String toString(){
        return "PrismaSegitiga{alas:"+alas+", tinggi:"+tinggi+"}";
    }
}
