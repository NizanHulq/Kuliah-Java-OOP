package bangun3D;
import bangun2D.*;
import master.Matematika;

public class Limas2PersegiPanjang extends Limas2 {
    private PersegiPanjang alas;

    public Limas2PersegiPanjang(Persegi alas, double TLimas, double rusukTegak, PersegiPanjang alas1) {
        super(alas, TLimas, rusukTegak);
        this.alas = alas1;
    }

    public PersegiPanjang getAlas() {
        return alas;
    }

    public void setAlas(PersegiPanjang alas) {
        this.alas = alas;
    }

    @Override
    public String getDetailAlas() {
        return "Alas Persegi Panjang dengan detail : " + getAlas().toString();
    }


    public double getSisiTegakPanjang() {
        double segitigaTegak = Matematika.getMiring(getAlas().getLebar() / 2, getTLimas()) * getAlas().getPanjang() / 2;
        return segitigaTegak;
    }

    public double getSisiTegakLebar() {
        double segitigaTegak = Matematika.getMiring(getAlas().getPanjang() / 2, getTLimas()) * getAlas().getLebar() / 2;
        return segitigaTegak;
    }

    @Override
    public double getLuasPermukaan() {
        return getLuasAlas() + 2 * getSisiTegakPanjang() + 2 * getSisiTegakLebar();
    }

    @Override
    public double getKeliling() {
        return alas.getKeliling() + 4 * getRusukTegak();
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
        return "Limas Pesegi" + super.toString();
    }
}

