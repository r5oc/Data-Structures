package list.tests;

public class Car {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + name + ", ");
        sb.append(year + "]");
        return sb.toString();
    }


}
