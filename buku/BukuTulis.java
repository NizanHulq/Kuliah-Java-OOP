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
public class BukuTulis extends Buku{
    String Merk;
    public BukuTulis(){        
    }
    public BukuTulis(int jmlHal,String Merk){
        super(jmlHal);
        this.Merk=Merk;
    }
    public BukuTulis(int jmlHal,String Pemilik,String Merk){
        super(jmlHal,Pemilik);
        this.Merk=Merk;
    }
    public void setMerk(String merk){
        Merk=merk;
    }
    public String getMerk(){
        return Merk;
    }
    @Override
    public String toString(){
        return " Pemilik buku: "+getNamaPemilik()+ "\n Merk buku: "+getMerk()+"\n jumlah halaman: "+getJumlahHalaman();
    }
}
