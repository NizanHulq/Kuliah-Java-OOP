/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.buku;

/**
 *
 * @author hp
 */
public class BukuNovel extends Buku{
    String Judul, Penerbit, Penulis;
    public BukuNovel(){}
    public BukuNovel(String Judul, int jmlHal, String Penulis, String Penerbit){
        super(jmlHal);
        this.Judul=Judul;
        this.Penerbit=Penerbit;
        this.Penulis=Penulis;
    }
    public String getJudul(){
        return Judul;
    }
    public String getNamaPenerbit(){
        return Penerbit;
    }
    public String getNamaPenulis(){
        return Penulis;
    }
    public void setJudul(String judul){
        Judul=judul;
    }
    public void setNamaPenerbit(String penerbit){
        Penerbit=penerbit;
    }
    public void setNamaPenulis(String Penulis){
        this.Penulis=Penulis;
    }
    public String toString(){
        return " Judul buku: "+getJudul()+ " Penerbit: "+getNamaPenerbit();
    }
}
