package TutorOps;

import java.util.Scanner;

public class encryptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        System.out.println("Enter a key value: ");
        int k = sc.nextInt();
        sc.close();
        int i = 0;
        while(i<s.length()){
            int ascii = s.charAt(i);
            int k1 = k;
            if(ascii + k >122){
                int temp = 122 - ascii;
                k -= temp;
                ascii = 96;
            }
            ascii += k;
            System.out.print((char)ascii);
            k = k1;
            i += 1;
        }
    }
}
