package stack.tests;
import list.tests.Car;
import stack.Stack;

public class TestRemove {
    public static void main(String[] args) {

        Stack<Car> stack = new Stack(4);

        Car car1 = new Car("palio", 2001);
        Car car2 = new Car("palio", 2002);
        Car car3 = new Car("palio", 2003);
        Car car4 = new Car("palio", 2004);

        stack.add(car1);
        stack.add(car2);
        stack.add(car3);
        stack.add(car4);
        System.out.println(stack);

        for (int i = 0; i < stack.getLength(); i++) {
            stack.remove();
            System.out.println(stack);
        }
    }
}
