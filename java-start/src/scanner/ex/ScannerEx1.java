package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력해주세요. : ");
        String name = scanner.nextLine();
        System.out.print("당신의 나이를 입력해주세요. : ");
        int age = scanner.nextInt();

        System.out.println("나이가 " + age + "세 이신 " + name + "님 안녕하세요.");
    }
}
