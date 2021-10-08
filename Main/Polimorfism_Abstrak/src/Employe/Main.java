package Employe;

public class Main {
    public static void main(String[] args) {
        Employee HE = new HourlyEmployee(12345,"Nizan","Dhiaulhaq",50000,176);
        Employee SE = new SalariedEmployee(123,"Dono","Prandono",2000000,1000000,1500000);

        System.out.println(HE);
        System.out.println(SE);
    }
}
