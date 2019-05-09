package tp.exo3;

public abstract class Building {
    String owner;
    String address;
    double area;

    abstract double tax();
    abstract void print();

    public Building(String owner, String address, double area) {
        this.owner = owner;
        this.address = address;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Building{" +
                "Owner='" + owner + '\'' +
                ", Address='" + address + '\'' +
                ", Area=" + area +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
