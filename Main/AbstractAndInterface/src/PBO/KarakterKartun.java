package PBO;

public abstract class  KarakterKartun {
    private String nama;

    public KarakterKartun(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void menyanyi();

    public abstract void ketawa();


}
