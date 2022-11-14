package Assignment3;
import java.util.Scanner;
public class problem2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]array=new int[n][n];
        int c=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (array[i][j]==1){
                    c+=4;
                    if (i-1>=0&&array[i-1][j]==1){
                        c-=1;
                    }
                    if (j-1>=0&&array[i][j-1]==1){
                        c-=1;
                    }
                    if (j+1<n&&array[i][j+1]==1){
                        c-=1;
                    }
                    if (i+1<n&&array[i+1][j]==1){
                        c-=1;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
