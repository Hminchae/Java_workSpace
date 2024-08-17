package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료됩니다!) :  ");
            String inputName = scanner.nextLine();

            if (inputName.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 :  ");
            int inputAge = scanner.nextInt();

            scanner.nextLine(); // 라인을 읽고 버리면 된다!

            System.out.println("입력한 이름: " + inputName + ", 나이 : " + inputAge);
        }
    }
}
