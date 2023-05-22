package TutorOps;
public class MonotonicArray {
    public static void main(String[] args) {
        int a[] = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean flag = true;
        if(a[0]>a[1]){
            for(int i = 1; i<a.length-1; i++){
                if(a[i]<a[i+1]){
                    flag = false;
                    break;
                }
            }
        }
        else{
            for(int i = 1; i<a.length-1; i++){
                if(a[i]>a[i+1]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
