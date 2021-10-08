package UTS;

public class pegawaiPW extends pegawai {
    private double jamKerja,upahPerJam;

    public pegawaiPW(String nama, String pekerjaan, double jamKerja, double upahPerJam) {
        super(nama, pekerjaan);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    public double getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(double jamKerja) {
        this.jamKerja = jamKerja;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double gajiTotal() {
        return jamKerja*upahPerJam;
    }

    @Override
    public double asuransi() {
        return 0;
    }

    @Override
    public String toString() {
        return "Pegawai paruh waktu bernama "+nama+
                " dengan pekerjaan sebagai "+pekerjaan+
                " mendapatkan total gaji sebesar "+gajiTotal();
    }
}
