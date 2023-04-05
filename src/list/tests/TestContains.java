package list.tests;

import list.List;

public class TestContains {
    public static void main(String[] args) {

        List<Car> list1 = new List<>(0);

        Car car1 = new Car("Fiat Uno", 1996);
        Car car2 = new Car("Fiat Toro", 2022);
        Car car3 = new Car("Fiat Mobi", 2022);

        list1.add(car1);
        list1.add(car1);
        list1.add(car2);
        list1.add(car3);
        list1.add(car2);
        list1.add(car3);

        System.out.println(list1);
        System.out.println(list1.getSize());
        System.out.println(list1.contains(car3));
        System.out.println(list1.indexOf(car2));
    }
}
