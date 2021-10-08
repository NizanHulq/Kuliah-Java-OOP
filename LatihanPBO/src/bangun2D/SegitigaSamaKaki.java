package bangun2D;
import Master.Matematika;
/**
 *
 * @author ARIF
 */
public class SegitigaSamaKaki extends Segitiga {
    
    public SegitigaSamaKaki(double a, double t) {
        super(a, t);
    }

    @Override
    public double getKeliling() {
        return getAlas() + 2 * getSisiMiring();
    }

    public double getSisiMiring() {
        return Matematika.getMiring(getAlas()/2, getTinggi());
    }

    @Override
    public String toString() {
        return "SegitigaSamaKaki {"+"a="+getAlas()+", t="+getTinggi()+'}';
    }
}
