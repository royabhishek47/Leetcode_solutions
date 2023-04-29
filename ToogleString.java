package TutorOps;

import java.util.Scanner;

public class ToogleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.next();
        sc.close();
        if(s.length()>=1 && s.length()<=100){
            StringBuilder a = new StringBuilder(s);
        for(int i = 0; i<a.length(); i++){
            Character c = a.charAt(i);
            if(Character.isUpperCase(c)){
                a.setCharAt(i, Character.toLowerCase(c));
            }
            else{
                a.setCharAt(i, Character.toUpperCase(c));
            }
        }
        System.out.println(a);
        } 
    }    
}
