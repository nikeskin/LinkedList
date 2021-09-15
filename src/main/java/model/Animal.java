package model;

public class Animal {

    private String value;

    public Animal (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + value + '\'' +
                '}';
    }
}
