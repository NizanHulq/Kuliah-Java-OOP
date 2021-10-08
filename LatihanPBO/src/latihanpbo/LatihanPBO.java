package latihanpbo;

import bangun2D.Segitiga;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSamaSisi;
import bangun2D.SegitigaSiku;
import bangun3D.PrismaSegitiga;

public class LatihanPBO {
    public static void main(String[] args) {
        Segitiga segi3 = new SegitigaSiku(3, 4);
        PrismaSegitiga prisma1 = new PrismaSegitiga(segi3, 10);
        System.out.println(prisma1);
        System.out.println(prisma1.getVolume());
        System.out.println(prisma1.getDetailAlas());
        System.out.println("-------------------------");
        
        SegitigaSamaKaki kaki = new SegitigaSamaKaki(10, 7);
        PrismaSegitiga prisma2 = new PrismaSegitiga(kaki, 10);
        System.out.println(prisma2);
        System.out.println(prisma2.getVolume());
        System.out.println(prisma2.getDetailAlas());
        System.out.println("-------------------------");
    }
    
}