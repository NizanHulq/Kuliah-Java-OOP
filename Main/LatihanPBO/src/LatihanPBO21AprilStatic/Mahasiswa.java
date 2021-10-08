package LatihanPBO21AprilStatic;

public class Mahasiswa {
    private static String prodi="TRPL";
    private String nama = "mr X";

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public static String getProdi() {
        return prodi;
    }

    public String getNama() {
        return nama;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' + "prodi='" +prodi+
                "'}";
    }
//    public static void gantiNamo(String namoBaru){
//        this.nama = nama;
//    }
//
//    public static String tanyaNama(){
//        return nama;
//    }
//
//    public static String tanyaProdi(){
//        return prodi;
//    }
//
//    public static String getDetail(){
//        return "Mahasiswa{" + "nama" + getNama()+"prodi="
//                + getProdi() + ')';
//    }

}


