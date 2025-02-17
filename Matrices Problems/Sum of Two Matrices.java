import java.util.Scanner;
public class Programme2 {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int m, n, i, j;
             m = scan.nextInt();
             n = scan.nextInt();
             int A[][] = new int[m][n];
             int B[][] = new int[m][n];
             int sum[][] = new int[m][n];

        System.out.println("Enter the Values of A matrix");
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
               A[i][j]= scan.nextInt();
            }
        }
        System.out.println("Enter the Values of B matrix");
        for(i =0;i<m;i++){
            for(j=0;j<n;j++){
                B[i][j]= scan.nextInt();
            }
        }
        System.out.println("Add the Two matrices");
        for(i =0;i<m;i++){
            for(j=0;j<n;j++){
                sum[i][j]= A[i][j] + B[i][j];
            }
        }
        System.out.println("Print the Sum of Two Matrices");
        for(i =0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(sum[i][j] +" ");
            }
        }
    }
}
