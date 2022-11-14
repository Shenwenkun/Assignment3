package Assignment3;
import java.util.Scanner;

public class problem5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]array1=new int[2*n];
        int[]array2=new int[2*n];
        int[][]array=new int[n][n];
        boolean flag=true;
        int a=0,b=0,s=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for (int j=0;j<=n-5;j++){
                for (int k=j;k<j+5;k++){
                    if (array[i][k]==0) {
                        count++;
                        a = i;
                        b = k;
                        if (count >= 2) {
                            break;
                        }
                    }
                        if (count==1&&k==j+4){
                            array1[s]=a+1;
                            array2[s]=b+1;
                            s++;
                        }
                }
                count=0;
            }
        }
        for(int j=0;j<n;j++){
            for (int i=0;i<=n-5;i++){
                for (int k=i;k<i+5;k++){
                    if (array[k][j]==0) {
                        count++;
                        a = k;
                        b = j;
                        if (count >= 2) {
                            break;
                        }
                    }
                        if (count==1&&k==i+4){
                            array1[s]=a+1;
                            array2[s]=b+1;
                            s++;
                        }
                }
                count=0;
            }
        }
        for (int i=0;i<=n-5;i++){
            for (int j=0;j<=n-5;j++){
                for (int k=0;k<5;k++){
                    if (array[i+k][j+k]==0) {
                        count++;
                        a = i+k;
                        b = j+k;
                        if (count >= 2) {
                            break;
                        }
                    }
                        if (k==4&&count==1){
                            array1[s]=a+1;
                            array2[s]=b+1;
                            s++;
                        }
                }
                count=0;
            }
        }
        for (int i=4;i<n;i++){
            for (int j=0;j<=n-5;j++){
                for (int k=0;k<5;k++){
                    if (array[i-k][j+k]==0) {
                        count++;
                        a = i-k;
                        b = j+k;
                        if (count >= 2) {
                            break;
                        }
                    }
                    if (count==1&&k==4){
                        array1[s]=a+1;
                        array2[s]=b+1;
                        s++;
                    }
                }
                count=0;
            }
        }
        int o,g;
        for (int u=0;u<n*(2*n+1);u++) {
            for (int i = 0; i < 2*n-1; i++) {
                if (i+1<2*n-1&&array1[i] >array1[i + 1]) {
                    o=array1[i];
                    g=array2[i];
                    array2[i]=array2[i+1];
                    array1[i]=array1[i+1];
                    array2[i+1]=g;
                    array1[i+1]=o;
                }else if (i+1<2*n-1&&array1[i] ==array1[i + 1]){
                    if (array2[i]>array2[i+1]){
                        o=array1[i];
                        g=array2[i];
                        array2[i]=array2[i+1];
                        array1[i]=array1[i+1];
                        array2[i+1]=g;
                        array1[i+1]=o;
                    }else if (i+1<n*2-1&&array2[i]==array2[i+1]){
                        array2[i+1]=0;
                        array1[i+1]=0;
                    }
                }
            }
        }
        for (int i=0;i<2*n;i++){
            if (array1[i]!=0||array2[i]!=0){
                System.out.println(array1[i]+" "+array2[i]);
                flag=false;
            }
        }
        if (flag){
            System.out.println(-1);
        }
    }
}
