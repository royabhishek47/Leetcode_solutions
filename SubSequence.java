package TutorOps;

import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        int arr[], seq[], c = 0;
        arr = new int[l];
        System.out.println("Enter the elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the length of the sequence");
        int s = sc.nextInt();
        seq = new int[s];
        System.out.println("Enter the elements:");
        for(int i = 0; i<seq.length; i++){
            seq[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i<seq.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(seq[i]==arr[j]){
                    c++;
                }
            }
        }
        if(c==seq.length)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
