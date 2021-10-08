package HewanPeliharaan;

public class Ikan extends HewanPeliharaan {
    public Ikan(String nama, String warnaDominan){
        super(nama, warnaDominan);
    }

    @Override
    public String bergerak() {
        return "berenang";
    }

    @Override
    public String bersuara() {
        return "Blepp...blepp..";
    }

    @Override
    public String toString() {
        return getNama() + " adalah HewanPeliharaan yang bergerak dengan cara "
                + bergerak() + " dan bersuara " + bersuara();
    }
}
