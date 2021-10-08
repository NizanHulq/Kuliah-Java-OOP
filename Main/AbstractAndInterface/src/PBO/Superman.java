package PBO;

public class Superman extends KarakterKartun implements Pahlawan{

    public Superman(String nama) {
        super(nama);
    }

    @Override
    public void menyanyi() {
        System.out.println("Na na na na");
    }

    @Override
    public void ketawa() {
        System.out.println("HA ha ha");

    }

    @Override
    public void terbang() {
        System.out.println("Terbang");

    }

    @Override
    public void berlari() {
        System.out.println("lariiii");
    }
}
