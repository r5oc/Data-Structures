package list.tests;

import list.List;

public class TestExpand {

    public static void main(String[] args) {
        List<Car> list = new List<>(0);
        Car car = new Car("rx7", 0000);
        System.out.println(car);
        System.out.println(list.getLength());
        for (int i =0; i < 100; i++){
            list.add(car);
        }
        System.out.println(list.getLength());
    }
}
