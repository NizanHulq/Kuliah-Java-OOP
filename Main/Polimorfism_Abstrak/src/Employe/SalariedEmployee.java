package Employe;

public class SalariedEmployee extends Employee{

    private double comisionRate,grossSales,basic;

    public SalariedEmployee(int empCode, String firsName, String lastName,double comisionRate, double grossSales, double basic){
        super(empCode, firsName, lastName);
        this.basic=basic;
        this.comisionRate=comisionRate;
        this.grossSales=grossSales;
    }

    public double getBasic() {
        return basic;
    }

    public double getComisionRate() {
        return comisionRate;
    }

    public double getGrossScales() {
        return grossSales;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setComisionRate(double comisionRate) {
        this.comisionRate = comisionRate;
    }

    public void setGrossScales(double grossScales) {
        this.grossSales = grossSales;
    }

    @Override
    public double pay() {
        return basic+grossSales+comisionRate;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                " empCode="+getEmpCode() +
                " name=" +getFirstName()+" "+getLastName()+
                " Salary="+ pay()+
                '}';
    }
}
