package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 12;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
