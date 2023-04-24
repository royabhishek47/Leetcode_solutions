package TutorOps;
import java.lang.Math;
public class ArrayMultiply {
    public static void main(String[] args) {
        int p=1;
        int a[] = new int[] {5,4,7,6,2};
        for(int i = 0; i< a.length; i++){
            p = p*a[i];
        }
        double x;
        x = (double)(p % (Math.pow(10, 9)+7));
        System.out.println(x);
    }
}
