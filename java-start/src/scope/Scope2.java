package scope;

public class Scope2 {

    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } // i 죽음

        // System.out.println("main i = " + i); // 🚨오류, i에 접근 불가
        System.out.println("main m = " + m);
    }
}
