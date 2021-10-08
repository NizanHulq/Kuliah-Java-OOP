package PBO;

public abstract class A  implements Pahlawan,Penduduk {

    @Override
    public void terbang() {
        System.out.println("Terbanggg");
    }

    @Override
    public void berlari() {
        System.out.println("Lariiii");
    }
}
