package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;

        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

/*

변수의 생존 범위는 아래의 이유로 신중하게 구성해야한다.
- 비효율적인 메모리 사용
- 코드 복잡성 증가

 ✏️ while 문보다는 for문을 사용하여 스코프를 제한하는 것이 메모리 사용과 유지 보수 관점에서 더 좋다.

 - 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자.
 메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있다.
 - 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.

 */