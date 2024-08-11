package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같음

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}

// 💡 연산자 우선순위가 복잡한 경우 괄호를 써서 가독성을 좋게 하여야 함


/*

✏️ 연산자 우선순위 :

1. 괄호()
2. 단항 연산자: ++, --, !, ~, new, (type)
3. 산술 연산자: *, /, % 이 다음 +, -
4. Shift 연산자: <<, >>, >>>
5. 비교 연산자: <, <=, >=, instanceof
6. 등식 연산자: ==, !=
7. 비트 연산자: &, ^, |
8. 논리 연산자: &&, ||
9. 삼항 연산자: ? :
10. 대입 연산자: =, +=, -=, *=, /=, %=

 */
