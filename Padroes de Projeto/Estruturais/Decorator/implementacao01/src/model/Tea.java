package model;

public class Tea implements Drinks{
    @Override
    public void serve() {
        System.out.println("- Adding 100ml of tea");
    }

    @Override
    public Double getPrice() {
        return 1d;
    }
}
