package TutorOps;

import java.util.Scanner;

public class TwoNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = sc.nextInt();
        int arr[],targetsum;
        arr = new int[l];
        System.out.println("Enter the elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum");
        targetsum = sc.nextInt();
        sc.close();
        int i, temp;
        for(i=0;i<arr.length;i++){
            temp = targetsum - arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==temp)
                    System.out.print("["+arr[i]+" "+arr[j]+"] ");
            }
        }
    }
}