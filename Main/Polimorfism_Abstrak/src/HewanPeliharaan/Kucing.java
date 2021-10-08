package HewanPeliharaan;

public class Kucing extends HewanPeliharaan {

    public Kucing(String nama, String warnaDominan){
        super(nama, warnaDominan);
    }

    @Override
    public String bergerak() {
        return "berjalan";
    }

    @Override
    public String bersuara() {
        return "Meoong";
    }

    @Override
    public String toString() {
        return getNama() + " adalah HewanPeliharaan yang bergerak dengan cara "
                + bergerak() + " dan bersuara " + bersuara();
    }
}
