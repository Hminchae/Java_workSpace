package casting;

public class Casting4 {

    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;

        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}

// 이걸 꼭 기억하자

/*
1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
- int + int = int
- double + double = double
3. 서로 다른 타입의 계산은 큰 범위로의 자동 형변환이 일어난다.
- int + long = long + long
 */

/* ✏️ 형변환 정리
int -> long -> double
- 작은 범위에서 큰 범위로는 대입할 수 있음(묵시적 형변환/자동 형변환)
- 큰 범위에서 작은 범위의 대입은 다음과 같은 문제가 발생할 수 있음. 이때는 묵시적 형변환을 하여야 함
  - 소수점 버림
  - 오버플로우
- 연산과 형변환
  - 같은 타입은 같은 결과를 낸다.
  - 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
 */