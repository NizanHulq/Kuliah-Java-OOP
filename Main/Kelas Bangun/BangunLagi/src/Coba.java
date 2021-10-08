public class Coba {
    public static void main(String[] args) {
        Bangun bang = new Bangun("merah");
        System.out.println(bang);
        bang.setWarna("merah muda");
        System.out.println(bang.getWarna());

        PersegiPanjang PP = new PersegiPanjang("biru",5.3, 4);
        System.out.println(PP.getWarna());
        System.out.println(PP.getLuas());
        System.out.println(PP.getKeliling());
        System.out.println(PP);
        PP.setLebar(10);
        PP.setPanjang(0);
        System.out.println(PP);
        PP.setWarna("biru langit");
        System.out.println(PP);
    }
}
