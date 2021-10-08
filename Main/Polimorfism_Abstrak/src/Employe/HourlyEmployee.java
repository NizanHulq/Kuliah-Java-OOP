package Employe;

public class HourlyEmployee extends Employee {
    private double rate,workingHours;

    public HourlyEmployee(int empCode, String firsName, String lastName,
    double rate, double workingHours){
        super(empCode, firsName, lastName);
        this.rate=rate;
        this.workingHours=workingHours;
    }

    public double getRate() {
        return rate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double pay() {
        return rate*workingHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                " empCode="+getEmpCode() +
                " name=" +getFirstName()+" "+getLastName()+
                " Salary="+pay()+
                '}';
    }
}
