package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다.
        System.out.println("입력한 문자열: " + str);

        System.out.println("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // 입력을 int로 가져온다.
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요: ");
        double doubleValue = scanner.nextDouble(); // 입력을 double로 가져온다.
        System.out.println("입력한 실수: " + doubleValue);
    }
}

/*
Scanner scanner = new Scanner(System.in);
scanner.nextLine() :
 - 엔터(\n)을 입력할 때 까지 문자를 가져옴
scanner.nextInt() :
 - 입력을 int 형으로 가져온다.
scanner.nextDouble() :
 - 입력을 double 형으로 가져온다.
 */