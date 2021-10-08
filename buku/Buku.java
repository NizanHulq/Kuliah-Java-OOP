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
public class Buku {
    int JmlHalaman;
    String NamaPemilik;
    public Buku(){}
    public Buku(int jmlHal){
    JmlHalaman=jmlHal;
    }
    public Buku(int JmlHal,String Pemilik){
       JmlHalaman=JmlHal;
       NamaPemilik=Pemilik;
    }
    public int getJumlahHalaman(){
        return JmlHalaman;
    }
    public String getNamaPemilik(){
        return NamaPemilik;
    }
    public void setJumlahHalaman(int jmlHal){
        JmlHalaman=jmlHal;
    }
    public void setNamaPemilik(String pemilik){
        NamaPemilik=pemilik;
    }
}
