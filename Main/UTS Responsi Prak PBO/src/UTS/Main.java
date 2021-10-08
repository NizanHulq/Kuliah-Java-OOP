package UTS;

public class Main {

    public static void main(String[] args) {

        pegawai tetap = new pegawai1("Jonno","Manager",20);
        pegawai tidakTetap = new pegawai2("Jonni","Staff IT");
        pegawai paruhWaktun = new pegawaiPW("Anna","Sekretaris",60,10);

        System.out.println(tetap);
        System.out.println(tidakTetap);
        System.out.println(paruhWaktun);
    }
}
