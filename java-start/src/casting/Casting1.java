package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("long value: " + longValue);

        doubleValue = intValue;
        System.out.println("double value: " + doubleValue);

        doubleValue = 20L;
        System.out.println("double value: " + doubleValue);
    }
}

/*
자동 형변환

doubleValue = (double)intValue <- 자동 형변환, 묵시적 형변환
작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환을 하지 않아도 됨
 */
