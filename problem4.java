package Assignment3;
import java.util.Scanner;
public class problem4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]array2=new int[m][n];
        int e=m;
        int f=n;
        int a1=0,b1=1,count=0;
        for (int i=0;i<f;i++){
            for (int a=a1;a<m;a++){
                array2[a][i]=sc.nextInt();
                count++;
            }
            if (count==e*f){
                break;
            }
            if (n-1>0) {
                for (int b=b1; b < n; b++) {
                    array2[m - 1][b] = sc.nextInt();
                    count++;
                }
                if (count==e*f){
                    break;
                }
            }
            if (m-1>0&&n-1>0) {
                for (int c = m - 2; c >= a1; c--) {
                    array2[c][n - 1] = sc.nextInt();
                    count++;
                }
                if (count==e*f){
                    break;
                }
                for (int d = n - 2; d >= b1; d--) {
                    array2[a1][d] = sc.nextInt();
                    count++;
                }
                if (count==e*f){
                    break;
                }
            }
            m-=1;
            n-=1;
            b1++;
            a1++;
            if (count==e*f){
                break;
            }
        }
        for (int i=0;i<e;i++){
            for (int j=0;j<f;j++){
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
