package method;

public class Method1Ref {

    public static void main(String[] args) {

        int sum1 = add(10, 20); // a: <- 변수 이름 보여주는 것임
        System.out.println("결과 1 출력: " + sum1);

        int sum2 = add(60, 20);
        System.out.println("결과 2 출력: " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a + b;
        return sum;
    }
}

// [메서드 선언]
// public static int add(int a, int b)
// - public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻.
// - static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
// [메서드 본문]
// 호출자의 입장에서 넘기는 값 -> Argument, 인수, 인자
