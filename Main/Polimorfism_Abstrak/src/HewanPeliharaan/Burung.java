package HewanPeliharaan;

public class Burung extends HewanPeliharaan{
    public Burung(String nama, String warnaDominan){
        super(nama, warnaDominan);
    }

    @Override
    public String bergerak() {
        return "terbang";
    }

    @Override
    public String bersuara() {
        return "Cit..cuitt..";
    }

    @Override
    public String toString() {
        return getNama() + " adalah HewanPeliharaan yang bergerak dengan cara "
                + bergerak() + " dan bersuara " + bersuara();
    }
}
