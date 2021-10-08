package UTS;

public class pegawai1 extends pegawai {
    private double gajiPokok,tunjangan,bonus;

    public pegawai1(String nama, String pekerjaan, double tunjangan) {
        super(nama, pekerjaan);
        this.tunjangan = tunjangan;
        this.gajiPokok = 750;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getBonus() {
        return (gajiPokok+tunjangan)*2/100;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double gajiTotal() {
        return gajiPokok+tunjangan+getBonus();
    }

    @Override
    public double asuransi() {
        return 25;
    }

    @Override
    public String toString() {
        return "Pegawai tetap bernama "+nama+
                " dengan pekerjaan "+pekerjaan+
                " mendapatkan total gaji sebesar "+gajiTotal()+
                " dan asuransi kesehatan sebesar "+asuransi();
    }
}
