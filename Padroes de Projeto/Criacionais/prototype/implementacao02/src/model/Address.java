package model;

public class Address implements Cloneable{

    private String street;
    private String number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public Address clone() throws CloneNotSupportedException {

        return (Address) super.clone();//shalow copy

    }

}