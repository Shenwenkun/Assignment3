package Assignment3;
import java.util.Scanner;
public class problem3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]array=new int[203][203];
        double sum=0;
        for (int i=0;i<n;i++){
            int type=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if (type==2){
                array[101+x][101+y]=translate(array[101+x][101+y],1);
                array[100+x][101+y]=translate(array[100+x][101+y],1);
                array[100+1+x][102+y]=translate(array[101+x][102+y],1);
                array[99+x+1][101+y+1]=translate(array[100+x][102+y],1);
            }else {
                array[101+x][101+y]=translate(array[101+x][101+y],4);
                array[100+x][101+y]=translate(array[100+x][101+y],5);
                array[101+x][102+y]=translate(array[101+x][102+y],3);
                array[100+x][102+y]=translate(array[100+x][102+y],2);
            }
        }
        for (int i=0;i<203;i++){
            for (int j=0;j<203;j++){
                if (array[i][j]==0){
                    sum+=0;
                }else if (array[i][j]==1){
                    sum+=1;
                }else if (array[i][j]==2||array[i][j]==3||array[i][j]==4||array[i][j]==5){
                    sum+=Math.PI/4;
                }else if (array[i][j]==6||array[i][j]==7||array[i][j]==8||array[i][j]==9){
                    sum+=(Math.sqrt(3)/4+Math.PI/6);
                }
            }
        }
        System.out.printf("%.5f",sum);
    }
    public static int translate(int a,int b){
        int c=0;
        if (a==0){
            c=b;
        }else if (a==1||b==1){
            c=1;
        }else if (b==0){
            c=a;
        }else if (a==b){
            c=a;
        } else if ((a==2&&b==3)||(a==3&&b==2)){
            c=6;
        }else if (((a==2&&(b==4||b==7||b==8))||(b==2&&(a==4||a==7||a==8)))||((a==3&&(b==5||b==8||b==9))||(b==3&&(a==5||a==8||a==9)))){
            c=1;
        }else if ((a==2&&b==5)||(a==5&&b==2)){
            c=9;
        } else if ((a==3&&b==4)||(a==4&&b==3)){
            c=7;
        } else if ((a==4&&b==5)||(a==5&&b==4)){
            c=8;
        }else if (((a==6)&&(b==7||b==8||b==9||b==4||b==5))||(b==6)&&(a==7||a==8||a==9||a==4||a==5)){
            c=1;
        }else if ((a==7&&(b==8||b==9||b==5))||(b==7&&(a==8||a==9||a==5))){
            c=1;
        }else if (((a==8||a==4)&&b==9)||(a==9&&(b==8||b==4))){
            c=1;
        }else if (((a==2||a==3)&&b==6)||((b==2||b==3)&&a==6)){
            c=6;
        }else if (((a==2||a==5)&&b==9)||((b==2||b==5)&&a==9)){
            c=9;
        }else if (((a==4||a==3)&&b==7)||((b==4||b==3)&&a==7)){
            c=7;
        } else if (((a==4||a==5)&&b==8)||((b==4||b==5)&&a==8)) {
            c=8;
        }
        return c;
    }
}
