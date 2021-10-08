package Employe;

public abstract class Employee {
    private int empCode;
    private String firstName,lastName;

    public Employee(int empCode, String firsName, String lastName){
        this.empCode= empCode;
        this.firstName= firsName;
        this.lastName= lastName;
    }

    public int getEmpCode() {
        return empCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    abstract public double pay();

    @Override
    abstract public String toString();
}

