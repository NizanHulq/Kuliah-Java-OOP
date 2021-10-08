/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimensi;

import java.math.*;

public class Garis {
    Titik titikAwal, titikAkhir;
    public Garis(Titik titikAw,Titik titikAk){
        titikAwal=titikAw;
        titikAkhir=titikAk;
    }
    public void setTitikAwal(Titik titik){
        titikAwal=titik;
    }
    public void setTitikAkhir(Titik titik){
        titikAkhir=titik;
    }
    public Titik getTitikAwal(){
        return titikAwal;
    }
    public Titik getTitikAkhir(){
        return titikAkhir;
    }
    public double getPanjang(){
        double jarakX=Math.pow(titikAkhir.getX()-titikAwal.getX(), 2);
        double jarakY=Math.pow(titikAkhir.getY()-titikAwal.getY(), 2);
        double jarak = Math.pow((jarakX+jarakY),0.5);
        return jarak;
    }
    public String toString(){
        return "Garis dari "+titikAwal+" sampai "+titikAkhir;
    }
    
}
