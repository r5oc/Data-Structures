package stack.tests;

import stack.Stack;

public class TestAdd {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack(4);

        System.out.println(stack);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack);
    }
}
