package bangun3D;

import  bangun2D.*;
import master.Matematika;

public class Limas2Persegi extends Limas2 {
    private Persegi alas;

    public Limas2Persegi(Persegi alas, double TLimas, double ruskuTegak) {
        super(alas, TLimas, ruskuTegak);
        this.alas = alas;
    }

    public Persegi getAlas() {
        return alas;
    }

    public void setAlas(Persegi alas) {
        this.alas = alas;
    }

    @Override
    public String getDetailAlas() {
        return "Alas Persegi dengan detail : "+getAlas().toString();
    }


    public double getSisiTegak() {
        double segitigaTegak =  Matematika.getMiring(getAlas().getSisi()/2,getTLimas())*getAlas().getSisi()/2;
        return segitigaTegak ;
    }

    @Override
    public double getLuasPermukaan() {
        return getLuasAlas()+ 4*getSisiTegak() ;
    }

    @Override
    public double getKeliling() {
        return alas.getKeliling()+4*getRusukTegak();
    }

    @Override
    public double getLuasAlas() {
        return alas.getLuas();
    }

    @Override
    public double getVolume() {
        return super.getVolume();
    }

    @Override
    public String toString() {
        return "Limas Pesegi"+super.toString();
    }
}
