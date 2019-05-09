package tp.exo3;

public class Company extends Building{
    String  name;
    int     employeeCounter;
    double  avg;

    public Company(String owner, String address, double area, String name, int employeeCounter, double avg) {
        super(owner, address, area);
        this.name = name;
        this.employeeCounter = employeeCounter;
        this.avg = avg;
    }

    @Override
    double tax() {
        return 6.3 * area;
    }

    @Override
    void print() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCounter() {
        return employeeCounter;
    }

    public void setEmployeeCounter(int employeeCounter) {
        this.employeeCounter = employeeCounter;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
