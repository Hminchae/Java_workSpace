package variable;

public class Var8 {

    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //  -2147483647 ~ 2147483647 (약 20억)

        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // 대략 7자리 정밀도
        double d = 1.0; // 15자리 정밀도
    }
}

/*

 💡변수 타입 정리 :

 메모리 용량은 매..우! 저렴하다.
 따라서 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효과적이다.

 그리고 자바는 기본으로 4byte(int)를 효율적으로 계산하도록 설계되어있음!
 그래서 byte, short, float, char 거의 사용하지 않는다... 앗 파일을 다룰때는(만) byte 사용한다!

 */