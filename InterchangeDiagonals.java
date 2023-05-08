package TutorOps;

public class InterchangeDiagonals {
    public static void main(String[] args) {
        // declare variable
        int m, n, i, j, temp;
        m = 3;
        n = 5;
        int a[][] = new int[][] { { 0, -1, -3, 2, 0 }, { 1, -2, -5, -1, -3 }, { 3, 0, 0, -4, -1 } };

        System.out.println("original Matrix:");

        // print the original matrix
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        // perform interchange
        for (j = 0; j < m; j++) {
            temp = a[j][j];
            a[j][j] = a[j][n - 1 - j];
            a[j][n - 1 - j] = temp;
        }
        System.out.println(
                " after interchanging diagonals of matrix ");

        // print interchanged matrix
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
