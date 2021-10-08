/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterKambing;

/**
 *
 * @author LENOVO
 */
public class Etawa extends Kambing {
    
    public Etawa(String jk, int tinggi, int bobot) {
        super(jk, tinggi, bobot);
        this.setDahiHidung("cembung");
        this.setTelinga("panjang terkulai kebawah");
    }

    @Override
    public void setBobot(int bobot) {
        if ( getJk() == "jantan"){
            if (bobot > 91){
                super.setBobot(91);
            } else{
                super.setBobot(bobot);
            }
        }
        else if (getJk() == "betina"){
        if (bobot > 63){
                super.setBobot(63);
            } else{
                super.setBobot(bobot);
            }//To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void setTinggi(int tinggi) {
        if ( getJk() == "jantan"){
            if (tinggi > 127){
                super.setTinggi(127);
            } else{
                super.setTinggi(tinggi);
            }
        }
        else if (getJk() == "betina"){
        if (tinggi > 92){
                super.setTinggi(92);
            } else{
                super.setTinggi(tinggi);
            }
        }
    }

    @Override
    public void makan() {
        super.setTinggi(super.getTinggi() + 7);
        super.setBobot(super.getBobot() + 5);
    }
    
    
}

    
    


   
