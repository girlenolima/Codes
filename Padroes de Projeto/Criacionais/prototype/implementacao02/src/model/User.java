package model;

public class User implements Cloneable{

    String name;
    String idade;
    Address address;

    public User(String name, String idade, Address address) {
        this.name = name;
        this.idade = idade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", idade='" + idade + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public User clone() throws CloneNotSupportedException{

        //return (User) super.clone();//shalow copy
        User cloneUser =  (User) super.clone();
        cloneUser.address = (Address) address.clone();

        return cloneUser;
    }
}
