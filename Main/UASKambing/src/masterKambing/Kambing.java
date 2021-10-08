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
public abstract class  Kambing {
    private String jk;
    private int tinggi,bobot;
    private String dahiHidung,telinga;

    public Kambing(String jk, int tinggi, int bobot) {
        this.jk = jk;
        this.tinggi = tinggi;
        this.bobot = bobot;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
    }
    
        public String getDahiHidung() {
        return dahiHidung;
    }

    public void setDahiHidung(String dahiHidung) {
        this.dahiHidung = dahiHidung;
    }

    public String getTelinga() {
        return telinga;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }
    
    abstract public void makan();
    
    
}
