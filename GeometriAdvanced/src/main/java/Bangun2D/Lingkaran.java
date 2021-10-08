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
public class Lingkaran {
    //private double phi = 22/7;
    private double r;
    public Lingkaran(double r){
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getLuas(){
        return Matematika.phi*r*r;
    }
    public double getKeliling(){
        return Matematika.phi*2*r;
    }
    @Override
    public String toString(){
        return "jari jari : "+r;
    }
}