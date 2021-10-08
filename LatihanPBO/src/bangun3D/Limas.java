package bangun3D;

import bangun2D.BangunDatar;
import bangun2D.Segitiga;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;
import bangun2D.SegitigaSiku;
import bangun2D.Persegi;
import bangun2D.PersegiPanjang;
import bangun2D.Lingkaran;

public class Limas {
    private double tinggi;
    private BangunDatar alas;
    
    public Limas(BangunDatar alas, double tinggi) {
       this.alas = alas;
       this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public double getVolume() {
        return 1.0/3 * getLuasAlas() * tinggi;
    }
    
    public double getLuasAlas() {
        return alas.getLuas();
    }
    
    public double getKelilingAlas() {
        return alas.getKeliling();
    }
    
    public String getDetailAlas() {
        if (alas instanceof Persegi) {
            return "Persegi";
        }
        else if (alas instanceof PersegiPanjang) {
            return "Persegi Panjang";
        }
        else if (alas instanceof Lingkaran) {
            return "Lingkaran";
        }
        else  if (alas instanceof SegitigaSiku) {
            return "Segitiga Siku";
        }
        else if (alas instanceof SegitigaSamaKaki) {
            return "Segitiga Sama Kaki";
        }
        else if (alas instanceof SegitigaSamaSisi) {
            return "Segitiga Sama Sisi";
        }
        else{
            return "Segitiga";
        }
    }
    
    public String toString() {
        return getDetailAlas() + "{ alas=" + alas + ", tinggi=" + tinggi + '}';
    }
    
}
