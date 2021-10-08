public class Bangun {
    public String warna;
    public Bangun(String warna){
        this.warna=warna;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String toString() {
        return "Bangun{" +
                "warna = " + warna +
                '}';
    }
}
