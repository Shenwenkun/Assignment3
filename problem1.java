package Assignment3;
import java.util.Scanner;
public class problem1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]array1=new int[n][n];
        int[][]array2=new int[n][n];
        int[][]array3=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array2[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n/2;i++){
            for (int j=0;j<n/2;j++){
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }
        for (int i=0,c;i<n/2;i++){
            c=0;
            for (int j=n/2;j<n;j++){
                for (int k=n/2;k<n;k++){
                    array3[i][j]+=array1[i][k]*array2[c][k];
                }
                c++;
            }
        }
        for (int i=n/2,c;i<n;i++){
            c=n/2;
            for (int j=0;j<n/2;j++){
                for (int k=0;k<n/2;k++){
                    array3[i][j]+=array2[i][k]*array1[c][k];
                }
                c++;
            }
        }
        for (int i=n/2;i<n;i++){
            for (int j=n/2;j<n;j++){
                array3[i][j]=array1[i][j]-array2[i][j];
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.printf("%d ",array3[i][j]);
            }
            System.out.println();
        }
    }
}
