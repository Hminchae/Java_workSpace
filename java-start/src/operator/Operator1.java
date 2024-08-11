package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 6;
        int b = 3;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multiply = a * b;
        System.out.println("a * b = " + multiply);

        // 나눗셈
        int divide = a / b;
        System.out.println("a / b = " + divide);

        double divide2 = a / b;
        System.out.println("a / b = " + divide2);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
