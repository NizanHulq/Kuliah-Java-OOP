package bangun2D;
import Master.Matematika;
/**
 *
 * @author ARIF
 */
public class Lingkaran extends BangunDatar{
    
//    private double phi = 22.0/7;
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLuas() {
        return Matematika.phi*r*r;
    }

    public double getKeliling() {
        return 2*Matematika.phi*r;
    }

    public String toString() {
        return "Lingkaran(" + "r" +r + ')';
    }
}
