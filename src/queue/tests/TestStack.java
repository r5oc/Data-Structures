package queue.tests;

import list.tests.Car;
import queue.Queue;

public class TestStack {
    public static void main(String[] args) {
        Queue<Car> queue = new Queue<>(3);

        Car car = new Car("type r", 2023);
        Car car2 = new Car("nsx type s", 2022);
        Car car3 = new Car("civic", 2018);

        queue.add(car);
        queue.add(car2);
        queue.add(car3);
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
    }
}
