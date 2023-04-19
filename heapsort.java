package TutorOps;

public class heapsort {
public static void max_heap(int a[],int n,int i)
{
    int l = 2*i;
    int r = 2*i+1;
    int largest = i;
    if(l<=n&&a[l]>a[i])
        largest = l;
    if(r<=n&&a[r]>a[largest])
        largest = r;
    if(i!=largest)
    {
        int t = a[i];
        a[i] = a[largest];
        a[largest] = t;
        max_heap(a,n,largest);
    }
}
public static void build_heap(int a[], int n)
{
    for(int i=n/2;i>=0;i--)
        max_heap(a,n,i);
}
public static void HeapSort(int a[])
{
    int n = a.length;
    build_heap(a,n);
    for(int i=n;i>1;i--)
    {
        int t = a[1];
        a[1] = a[i];
        a[i] = t;
        n--;
        max_heap(a,n,1);
    }
}
public static void main(String[] args) {
    int a[] = new int[] {8, 5, 2, 9, 5, 6, 3};
    HeapSort(a);
    for(int i = 0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
}
}
