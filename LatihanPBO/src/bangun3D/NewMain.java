package bangun3D;

import bangun2D.BangunDatar;
import bangun2D.Segitiga;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;
import bangun2D.SegitigaSiku;
import bangun2D.Persegi;
import bangun2D.PersegiPanjang;
import bangun2D.Lingkaran;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SegitigaSamaSisi s3smSS = new SegitigaSamaSisi(2);
        Limas LS3SS = new Limas(s3smSS, 10);
        System.out.println(LS3SS.getDetailAlas());
        System.out.println(LS3SS.getLuasAlas());
        System.out.println(LS3SS.getVolume());
        System.out.println("======================");
        Persegi prsg = new Persegi(2);
        Limas prsgi = new Limas(prsg, 10);
        System.out.println(prsgi.getDetailAlas());
        System.out.println(prsgi.getLuasAlas());
        System.out.println(prsgi.getVolume());
    }
    
}