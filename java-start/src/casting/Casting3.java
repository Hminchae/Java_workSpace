package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L + 199999999; //int 최고값 + 1(초과) int intValue = 0;
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648
    }
}

// Int 의 가장 작은 범위부터 다시 시작 하게 됨.. -> 오버 플로우!
