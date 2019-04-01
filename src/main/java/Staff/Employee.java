package Staff;

public class Employee {
    private String name;
    private String NInumber;
    private int salary;

    public Employee(String name, String NInumber, int salary){
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
