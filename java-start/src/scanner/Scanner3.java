package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요. : ");
        int num1 = scanner.nextInt();

        System.out.println("첫번째 숫자와 비교할 두번째 숫자를 입력하세요. : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("첫번째 숫자가 두번째 숫자보다 큽니다.");
        } else if (num1 == num2 ) {
            System.out.println("첫번째 숫자와 두번째 숫자가 같습니다.");
        } else {
            System.out.println("두번째 숫자가 첫번째 숫자보다 큽니다.");
        }
    }
}
