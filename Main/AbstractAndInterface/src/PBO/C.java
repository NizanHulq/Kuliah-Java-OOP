package PBO;

public class C extends KarakterKartun implements Penduduk{
    public C(String nama) {
        super(nama);
    }

    @Override
    public void menyanyi() {
        System.out.println("Na na na na");
    }

    @Override
    public void ketawa() {
        System.out.println("WKKWWKK");
    }

    @Override
    public void berlari() {
        System.out.println("Lariiilarii");
    }
}
