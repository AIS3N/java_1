package exo6;

public class Projet {
    private String name;
    private String employee;
    private String service;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Projet(String name, String employee, String service) {
        this.name = name;
        this.employee = employee;
        this.service = service;
    }
}
