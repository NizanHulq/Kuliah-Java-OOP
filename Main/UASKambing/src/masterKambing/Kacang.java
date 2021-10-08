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
public class Kacang extends Kambing {
    public Kacang(String jk, int tinggi, int bobot) {
        super(jk, tinggi, bobot);
        this.setDahiHidung("cembung");
        this.setTelinga("tegak pendek");
    }

    @Override
    public void setBobot(int bobot) {
        if ( getJk() == "jantan"){
            if (bobot > 25){
                super.setBobot(25);
            } else{
                super.setBobot(bobot);
            }
        }
        else if (getJk() == "betina"){
        if (bobot > 20){
                super.setBobot(20);
            } else{
                super.setBobot(bobot);
            }//To change body of generated methods, choose Tools | Templates.
    }

    
    
}

    @Override
    public void setTinggi(int tinggi) {
        if ( getJk() == "jantan"){
            if (tinggi > 65){
                super.setTinggi(65);
            } else{
                super.setTinggi(tinggi);
            }
        }
        else if (getJk() == "betina"){
        if (tinggi > 56){
                super.setTinggi(56);
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
