package cond.ex;

public class CondEx3 {

    public static void main(String[] args) {
        int dollar = 800;

        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전금액은 " + won + "원 입니다.");
        }
    }
}
