package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(num + "단 구구단 시작!");
        for (int i = 0; i <= 9; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
