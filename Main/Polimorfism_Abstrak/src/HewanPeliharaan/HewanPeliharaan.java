package HewanPeliharaan;
// abstrak class tidak bisa dijadikan object
// ini kelas abstrak = kelas yang method nya masih ambigu/ tidak pasti isinya apa sebelum membuat subclass

// method overload adalah method yang sama penamaannya tetapi beda inputannya/parameternya
abstract public class HewanPeliharaan {
    private String nama,warnaDominan;

    public HewanPeliharaan(String nama, String warnaDominan){
        this.nama=nama;
        this.warnaDominan=warnaDominan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarnaDominan() {
        return warnaDominan;
    }

    abstract public String bergerak();

    abstract public String bersuara();
    @Override
    abstract public String toString();

}
