package method;

public class Overloading2 {

    public static void main(String[] args) {
        add(1, 2.5);
    }

    public static void add(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void add(int a, int b, int c) {
        System.out.println("2번 호출");
    }
}
