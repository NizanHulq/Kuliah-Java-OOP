/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import Bangun3D.*;
import Bangun2D.*;
/**
 *
 * @author aqil
 */
public class LatihanPBO {
    public static void main(String args[]){
        //Prisma Segitiga siku siku
        Segitiga sikusiku = new SegitigaSikuSiku(3,4);
        PrismaSegitiga prisma1 = new PrismaSegitiga(sikusiku, 10);
        System.out.println(prisma1);
        System.out.println(prisma1.getVolume());
        System.out.println(prisma1.getDetailAlas());
        System.out.println("------------------------------");
        
        //Prisma Segitiga sama kaki
        Segitiga samakaki = new SegitigaSamaKaki(10,7);
        PrismaSegitiga prisma2 = new PrismaSegitiga(samakaki,10);
        System.out.println(prisma2);
        System.out.println(prisma2.getVolume());
        System.out.println(prisma2.getDetailAlas());
        System.out.println("-----------------------------------");
        
        //Prisma Segitiga sama sisi
        Segitiga samasisi = new SegitigaSamaSisi(12);
        PrismaSegitiga prisma3 = new PrismaSegitiga(samasisi, 10);
        System.out.println(prisma3);
        System.out.println(prisma3.getVolume());
        System.out.println(prisma3.getDetailAlas());
        System.out.println("-----------------------------------");
        
        //Limas Persegi
        Persegi persegi = new Persegi(6);
        Limas limaspersegi = new LimasPersegi(persegi, 10);
        System.out.println(limaspersegi);
        System.out.println(limaspersegi.getVolume());
        System.out.println(limaspersegi.getDetailAlas());
        System.out.println("-----------------------------------");
        
        //Limas Persegi Panjang
        PersegiPanjang persegipanjang = new PersegiPanjang(6, 4);
        Limas limaspersegipanjang = new LimasPersegiPanjang(persegipanjang, 10);
        System.out.println(limaspersegipanjang);
        System.out.println(limaspersegipanjang.getVolume());
        System.out.println(limaspersegipanjang.getDetailAlas());
        System.out.println("-----------------------------------");
        
        //Limas Segitiga Siku Siku
        Limas limassegitigasikusiku = new LimasSegitiga(sikusiku, 10);
        System.out.println(limassegitigasikusiku);
        System.out.println(limassegitigasikusiku.getVolume());
        System.out.println(limassegitigasikusiku.getDetailAlas());
        System.out.println("-----------------------------------");
        
        //Limas Segitiga Sama Kaki
        Limas limassegitigasamakaki = new LimasSegitiga(samakaki, 10);
        System.out.println(limassegitigasamakaki);
        System.out.println(limassegitigasamakaki.getVolume());
        System.out.println(limassegitigasamakaki.getDetailAlas());
        System.out.println("-----------------------------------");
        
        //Limas Segitiga Sama Sisi
        Limas limassegitigasamasisi = new LimasSegitiga(samasisi, 10);
        System.out.println(limassegitigasamasisi);
        System.out.println(limassegitigasamasisi.getVolume());
        System.out.println(limassegitigasamasisi.getDetailAlas());
        System.out.println("-----------------------------------");
        
        Lingkaran lingkaran = new Lingkaran(7);
        Limas limaslingkaran = new LimasLingkaran(lingkaran, 10);
        System.out.println(limaslingkaran);
        System.out.println(limaslingkaran.getVolume());
        System.out.println(limaslingkaran.getDetailAlas());
        System.out.println("-----------------------------------");
        
    }
}
