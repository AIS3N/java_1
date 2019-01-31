package exo7;

import java.util.Objects;

public class Address implements Cloneable {
    int     number;
    String  street;

    public Address(int number, String street) {
        this.number = number;
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, street);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
