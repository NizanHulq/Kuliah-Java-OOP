package UTS;

public class pegawai2 extends pegawai {
    private double gajiPokok,bonus;

    public pegawai2(String nama, String pekerjaan) {
        super(nama, pekerjaan);
        this.gajiPokok = 750;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getBonus() {
        return gajiPokok*2/100;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



    @Override
    public double gajiTotal() {
        return gajiPokok+getBonus();
    }

    @Override
    public double asuransi() {
        if (gajiTotal()*5/100 <= 25){
            return gajiTotal()*5/100;
        }
        else {return 25;}
    }

    public double gajiAkhir(){
        return gajiTotal()-asuransi();
    }

    @Override
    public String toString() {
        return "Pegawai tidak tetap bernama "+nama+
                " dengan pekerjaan "+pekerjaan+
                " mendapatkan total gaji sebesar "+gajiTotal()+
                " dan dipotong asuransi kesehatan sebesar "+asuransi()+
                " sehingga gaji akhir sebesar "+gajiAkhir();
    }


}
