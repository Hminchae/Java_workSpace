package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while (i < 3);
    }
}


// 최초 한번은 실행하고 싶을 때 do while 문을 사용함