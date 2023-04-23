package TutorOps;

import java.util.Scanner;

public class Ali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string (The format should be DDXDDD-DD)");
        String in = sc.next();
        sc.close();
        Character c = in.charAt(2);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='Y'){
            System.out.println("invalid");
        }
        else{
            int flag = 0;
            for(int i=0; i<in.length()-1; i++){
                if(i==2 || i+1==2 || i==6 || i+1==6)
                    continue;
                else{
                    if(((int)in.charAt(i)+(int)in.charAt(i+1))%2!=0){
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag==0)
                System.out.println("valid");
            else
                System.out.println("invalid");
        }
    }
}
