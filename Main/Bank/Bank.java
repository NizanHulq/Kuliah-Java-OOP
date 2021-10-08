public class Bank{
    private int saldo;

    public Bank(){
        saldo = 100000;
    }
    public Bank(int saldo){
        this.saldo = saldo;
    }


    public void setSimpanUang(int saldo){
        this.saldo += saldo;
    }
    public void setAmbilUang(int saldo){
        if(this.saldo < saldo){
			System.out.println("Saldo anda tidak mencukupi!!");
			}
		else{
			this.saldo -= saldo;
		}

    }
    public int getSaldo(int saldo){
        
        return saldo;
    }

    public String toString(){
        return "saldo saat ini: Rp. " + saldo;
    }

}