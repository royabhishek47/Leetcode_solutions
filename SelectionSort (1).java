import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int mini;
        int n = sc.nextInt();

        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //selection sort
        for (int i = 0; i < n; i++) {
            mini = i;
            for (int j = i+1; j < n; j++) {
               if(a[j]<a[mini]) mini = j;
            }
            int temp = a[mini];
            a[mini] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        
    }
}