package list.tests;

import list.List;

public class TestExpand {

    public static void main(String[] args) {
        List<Car> list = new List<>(0);
        Car car = new Car("rx7", 0000);
        System.out.println(list.getLength());
        list.add("00");
        list.add(car);
        list.add("00");
        System.out.println(list.getLength());
    }
}
