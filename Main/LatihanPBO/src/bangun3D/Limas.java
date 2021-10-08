package bangun3D;
import bangun2D.*;
import master.Matematika;
public class Limas{
    private Bangun2D alas;
    private double TLimas;

    public Limas(Bangun2D alas, double TLimas) {
        this.alas = alas;
        this.TLimas = TLimas;
    }

    public Bangun2D getAlas() {
        return alas;
    }

    public void setAlas(Bangun2D alas) {
        this.alas = alas;
    }

    public double getTLimas() {
        return TLimas;
    }

    public void setTLimas(double TLimas) {
        this.TLimas = TLimas;
    }

    public String getDetailAlas() {
        if (alas instanceof Lingkaran){
            return "Alas Lingkaran dengan detail : "+getAlas().toString();
        }
        else if (alas instanceof Persegi){
            return "Alas Persegi dengan detail : "+getAlas().toString();
        }
        else if (alas instanceof PersegiPanjang){
            return "Alas Persegi Panjang dengan detail : "+getAlas().toString();
        }
        else if (alas instanceof SegitigaSamaKaki){
            return "Alas Segitiga Sama Kaki dengan detail : "+getAlas().toString();
        }
        else if (alas instanceof SegitigaSamaSisi){
            return "Alas Segitiga Sama Sisi dengan detail : "+getAlas().toString();
        }
        else if (alas instanceof SegitigaSiku){
            return "Alas Segitiga Siku dengan detail : "+getAlas().toString();
        }
        else {return "Bangun Datar";}
    }

    public double getKelilingAlas() {
        return alas.getKeliling();
    }

    public double getLuasAlas() {
        return alas.getLuas();
    }

    public double getVolume() {
        double volume = getLuasAlas() * TLimas / 3;
        return volume;
    }

    public String toString() {
        return "Limas{" +
                "Tinggi Limas = " + TLimas +
                ", Luas Alas = " + getLuasAlas()+
                ", Keliling Alas = " + getKelilingAlas()+
                ", Volume=" + getVolume()+
                '}';
    }





}
