package bangun2D;

public class  Persegi extends Bangun2D {
    private static double sisi;

    public Persegi(double sisi) {
        Persegi.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        Persegi.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    @Override
    public String toString() {
        return "Persegi{" +
                "sisi=" + sisi +
                '}';
    }
}
