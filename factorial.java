package TutorOps;

public class factorial {
    public static int fact(int a) {
        int m;
        if (a == 1) {
            return 1;
        } else {
            m = a * fact(a - 1);
        }
        return m;
    }

    public static void main(String[] args) {
        int a = 7;
        System.out.println(fact(a));
    }
}
