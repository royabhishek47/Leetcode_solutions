package TutorOps;

public class runlength {
    public static void main(String[] args) {
        String s = "AAAAAAAAAAAAABBCCCCDD";
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            val += 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                val += 1;
                if (val == 9) {
                    System.out.print(val);
                    System.out.print(s.charAt(i));
                    val = 0;
                }
                i += 1;
            }
            System.out.print(val);
            System.out.print(s.charAt(i));
            val = 0;
        }
        System.out.println();
    }
}
