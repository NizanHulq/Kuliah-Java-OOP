package LatihanPBO21AprilStatic;

public class Main {
    public static void main(String[] args){
//        System.out.println(Mahasiswa.prodi);
//        System.out.println(Mahasiswa.nama);

        Mahasiswa st1 = new Mahasiswa("Mr X satu");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        Mahasiswa st2 = new Mahasiswa("Mr x dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        st1.setProdi("Teknologi RPL");
        st1.setNama("Aqua");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");

        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        Mahasiswa.setProdi("Software Engineering Technology");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());

        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

    }
}
