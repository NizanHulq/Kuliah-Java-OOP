import javax.swing.*;

public class PersegiPanjang extends Bangun {
    public double panjang,lebar;

    public PersegiPanjang(String warna,double panjang, double lebar) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        if (panjang > 0 && panjang >= this.lebar){
            this.panjang = panjang;
        }
        else {
            System.out.println("tidak bisa");
        }
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        if (lebar > 0 && lebar <= this.panjang){
            this.lebar = lebar;
        }
        else {
            System.out.println("tidak bisa");
        }
    }

    public double getLuas(){
        return panjang*lebar;
    }

    public double getKeliling(){
        return (2*panjang)+(2*lebar);
    }

    @Override
    public String toString() {
        return "PersegiPanjang{" +
                ", warna = " + warna +
                ", panjang = " + panjang +
                ", lebar = " + lebar +
                 ", Luas = "+getLuas() +
                ", Keliling = "+ getKeliling() +'}';
    }
}
