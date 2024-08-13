package loop.ex;

public class whileEx3 {

    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (true) {
            sum += i;
            i += 1;
            if (i > max) {
                break;
            }
        }

        System.out.println(sum);
    }
}
