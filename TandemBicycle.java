package TutorOps;

import java.util.Arrays;
import java.util.Scanner;

public class TandemBicycle {
    public int max(int a[], int b[]){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i])
                sum = sum + a[i];
            else
                sum = sum + b[i];
        }
        return sum;
    }
    public int min(int a[], int b[]){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i])
                sum = sum + a[i];
            else
                sum = sum + b[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        boolean fastest = sc.nextBoolean();
        sc.close();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length/2; i++){
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        TandemBicycle ob = new TandemBicycle();
        if(fastest == true)
            System.out.println(ob.max(a,b));
        else
            System.out.println(ob.min(a,b));
    }
}
