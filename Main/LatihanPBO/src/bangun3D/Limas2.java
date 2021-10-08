package bangun3D;
import bangun2D.*;


// ini dijadiin method dan class static truss limas2 yang lainn extend dari bangun2D
public abstract class Limas2 {
    private double TLimas, rusukTegak, phi =22.0/7;


    public Limas2(Persegi alas, double TLimas, double rusukTegak) {
        this.TLimas = TLimas;
        this.rusukTegak = rusukTegak;
    }

    public double getTLimas() {
        return TLimas;
    }

    public void setTLimas(double TLimas) {
        this.TLimas = TLimas;
    }

    public double getRusukTegak() {
        return rusukTegak;
    }

    public void setRusukTegak(double rusukTegak) {
        this.rusukTegak = rusukTegak;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }



    abstract public String getDetailAlas();



    abstract public double getLuasPermukaan();

    abstract public double getKeliling();

    abstract public double getLuasAlas();

    public double getVolume(){
        double volume = getLuasAlas() * TLimas / 3;
        return volume;
    };

    @Override
    public String toString() {
        return "{" +
                "TLimas=" + TLimas +
                ", rusukTegak=" + rusukTegak +
                ", LuasPermukaan=" + getLuasPermukaan()+
                ", Keliling=" + getKeliling()+
                ", LuasAlas=" + getLuasAlas()+
                ", Volume=" + getVolume()+
                '}';
    }
}