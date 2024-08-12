package cond;

public class If4 {

    public static void main(String[] args) {
        int price = 20000;
        int age = 10;
        int discount = 0;

        if (price >= 20000) {
            discount = discount + 1000;
            System.out.println("20000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("discount: " + discount);
    }
}

// 이런 경우 If3 처럼 조건문을 활용하는 것이 맞다.
