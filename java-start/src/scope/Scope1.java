package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;  // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 죽음

        System.out.println("main m = " + m);
        //System.out.println("main x = " + x); // 🚨cannot find symbol
    } // m 죽음
}
