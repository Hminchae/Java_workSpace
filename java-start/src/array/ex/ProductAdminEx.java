package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int num = 0;

        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");

        while (true) {
            System.out.print("메뉴를 선택하세요: ");
            int menuNum = scanner.nextInt();
            scanner.nextLine();

            if (menuNum == 1) {
                if (num == 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[num] = scanner.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[num] = scanner.nextInt();
                num++;
            } else if (menuNum == 2) {
                if (num == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                }
                for(int i = 0; i < num; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else {
                break;
            }
        }
    }
}
