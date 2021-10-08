public class MainLagi {
    public static void main(String[] args) {
        Balok bal = new Balok("ungu",5.3,4,6);

        System.out.println(bal.getWarna());
        System.out.println(bal.getLuas());
        System.out.println(bal.getVolume());
        System.out.println(bal.getKeliling());
        System.out.println(bal);
        bal.setWarna("violet");
        System.out.println(bal);
    }
}
