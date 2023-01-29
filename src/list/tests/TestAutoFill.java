package list.tests;

import list.List;

public class TestAutoFill {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.autoFill();
        System.out.println(list);
    }
}
