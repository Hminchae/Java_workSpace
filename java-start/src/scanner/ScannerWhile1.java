package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit: 종료): ");
            String inputStr = scanner.nextLine();

            if (inputStr.equals("exit")) {
                break;
            }

            System.out.println("입력된 문자열 : " + inputStr);
        }

        System.out.println("프로그램이 종료되었습니다.");
    }
}
