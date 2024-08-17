package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("홀짝을 판별할 정수를 하나 입력해보세요 : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("당신이 입력한 정수는 짝수예요.");
        } else {
            System.out.println("당신이 입력한 정수는 홀수예요.");
        }
    }
}