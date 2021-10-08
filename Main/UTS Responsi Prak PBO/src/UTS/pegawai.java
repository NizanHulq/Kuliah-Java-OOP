package UTS;

abstract public class pegawai {
    public String nama,pekerjaan;

    public pegawai(String nama, String pekerjaan) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getpekerjaan() {
        return pekerjaan;
    }

    public void setpekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    abstract public double gajiTotal();
    abstract public double asuransi();
    abstract public String toString();
}
