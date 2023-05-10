package TutorOps;

import java.util.Scanner;

public class MinCount {
    public int stepCount(int a[], int b[], int n){
        int min = a[0];
        for (int i =1; i< n; i++){
            if(a[i]<a[0])
                min = a[i];
        }
        int count = 0;
        int c = 0;
        for(int i =0;i<n;i++){
            if(a[i]>min && a[i]>=b[i]){
                while(a[i]>min){
                    a[i] = a[i] - b[i];
                    count = count + 1;
                }
            }
            if(a[i] == min){
                c = count;
            }  
            else
                break; 
        }
        if(c>0)
            return c;
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            b[i] = sc.nextInt();
        }
        sc.close();
        MinCount ob = new MinCount();
        System.out.println(ob.stepCount(a,b,n));
        }
}
