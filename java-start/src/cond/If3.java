package cond;

public class If3 {

    public static void main(String[] args) {
        int price = 20000;
        int age = 19;
        int discount = 0;

        if (price >= 20000) {
            discount = discount + 1000;
            System.out.println("20000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("discount: " + discount);
    }
}
