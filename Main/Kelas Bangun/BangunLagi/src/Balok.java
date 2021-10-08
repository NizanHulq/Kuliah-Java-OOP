public class Balok extends PersegiPanjang {
    private double tinggi;

    public Balok(String warna, double panjang, double lebar, double tinggi){
        super(warna, panjang, lebar);
        this.tinggi=tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        }
        else {
            System.out.println("tidak bisa");
        }
    }

    @Override
    public double getLuas() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }

    @Override
    public double getKeliling() {
        return (panjang*4)+(lebar*4)+(tinggi*4);
    }

    public double getVolume(){
        return panjang*lebar*tinggi;
    }

    @Override
    public String toString() {
        return "Balok{" +
                ", warna = " + warna +
                ", panjang = " + panjang +
                ", lebar = " + lebar +
                ", Luas = "+getLuas() +
                ", Keliling = "+ getKeliling() +
                ", Volume = "+ getVolume() +
                '}';
    }
}
