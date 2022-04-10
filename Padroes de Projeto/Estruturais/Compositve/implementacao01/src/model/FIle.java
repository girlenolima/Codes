package model;

public class FIle implements FileSystemItem {

    private String name;

    public FIle(String name) {
        this.name = name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
