package LatihanPBO21AprilStatic;
import bangun2D.*;
import bangun3D.*;

public class LatihanPBOStatic {


    public static void main(String[] args) {


//        try {
//            PrismaSegitiga prisma1 = new PrismaSegitiga(null, 10);
//            System.out.println(prisma1);
//            System.out.println(prisma1.getVolume());
//            System.out.println(prisma1.getDetailAlas());
//            System.out.println("----------------------------");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        Persegi Per = new Persegi(5);
        Limas Pe = new Limas(Per, 12);
        Lingkaran Ling = new Lingkaran(7);
        Limas Li = new Limas(Ling, 21);
        PersegiPanjang Pan = new PersegiPanjang(3, 4);
        Limas Pa = new Limas(Pan, 10);
        SegitigaSiku S3Siku = new SegitigaSiku(3, 4);
        Limas SSiku = new Limas(S3Siku, 13);
        SegitigaSamaSisi S3Sisi = new SegitigaSamaSisi(4);
        Limas SSisi = new Limas(S3Sisi, 12);
        SegitigaSamaKaki S3Kaki = new SegitigaSamaKaki(8, 7);
        Limas SKaki = new Limas(S3Kaki, 6);

        System.out.println(Pe);
        System.out.println(Pe.getDetailAlas());
        System.out.println(Li);
        System.out.println(Li.getDetailAlas());
        System.out.println(Pa);
        System.out.println(Pa.getDetailAlas());
        System.out.println(SSiku);
        System.out.println(SSiku.getDetailAlas());
        System.out.println(SSisi);
        System.out.println(SSisi.getDetailAlas());
        System.out.println(SKaki);
        System.out.println(SKaki.getDetailAlas());

    }
}

