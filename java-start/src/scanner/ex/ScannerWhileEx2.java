package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하시면 종료됩니다.): ");
            String price = scanner.nextLine();

            if (price.equals("-1")) {
                break;
            }

            System.out.print("구매하시려는 상품의 수량을 입력하세요.");
            String count = scanner.nextLine();

            int num1 = Integer.parseInt(count);
            int num2 = Integer.parseInt(price);

            System.out.println("총 비용: " + num1 * num2);
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
