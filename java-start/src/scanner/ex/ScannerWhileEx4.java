package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료"); // 이렇게 하면 다시 문답이 생기지가 않아서 문제 의도처럼 하려면 while true 구문을 쓰는게 맞음

        int askNum;
        int total = 0;

        while ((askNum = scanner.nextInt()) != 3) {
            scanner.nextLine();

            switch (askNum) {
                case 1:
                    System.out.print("상품명을 입력하세요. : ");
                    String product = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요. : ");
                    int price = scanner.nextInt();

                    System.out.print("구매 수량을 입력하세요. : ");
                    int quantity = scanner.nextInt();

                    int productTotal = price * quantity;
                    total += productTotal;

                    System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity + " -> 합계: " + productTotal);
                    break;
                case 2:
                    System.out.println("총 비용: " + total);
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
