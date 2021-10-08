package bangun3D;
import bangun2D.Persegi;

public class Kubus extends Persegi {

    public Kubus(double sisi) {
        super(sisi);
    }


    public double getLuasPermukaan() {
        return 6*super.getLuas();
    }


    public double getKeliling() {
        return 12*getSisi();
    }

    public double getLuasAlas(){
        return super.getLuas();
    }

    public double getVolume(){
        return super.getLuas()*getSisi();
    }

    @Override
    public String toString() {
        return "Kubus{" +
                "sisi" + getSisi()+
                '}';
    }
}
