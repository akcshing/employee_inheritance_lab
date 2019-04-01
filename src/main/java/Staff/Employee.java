package Staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public void setNInumber(String NInumber) {
        this.NInumber = NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void raiseSalary(double salaryIncrement) {
        setSalary(this.salary + salaryIncrement);
    }

    public double payBonus() {
        return this.getSalary()*0.01;
    }
}
