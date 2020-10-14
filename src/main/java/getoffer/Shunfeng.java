package getoffer;

import java.util.Arrays;
import java.util.Scanner;

public class Shunfeng {
    public static void main(String[] args){
       /* Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int max=0;
        int sum=0;
        int point=0;
        int [] arr=new int[n];
        int [][] yusuan=new int[m][n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            yusuan[i][0]=scanner.nextInt();
            yusuan[i][1]=scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(yusuan[j][0]>0&&arr[i]>=yusuan[j][0]){
                    if(yusuan[j][1]>max){
                        max=yusuan[j][1];
                        point=j;
                    }
                }
            }
            sum+=max;
            yusuan[point][0]= -1;
            max=0;
        }
        System.out.print(sum);*/
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long end=0;
        long max=0;
        long [][] a=new long[n][3];
        for(int i=0;i<n;i++){
            a[i][0]=scanner.nextLong();
            a[i][1]=scanner.nextLong();
            a[i][2]=scanner.nextLong();
            if(a[i][1]>end)end=a[i][1];
        }
        long [] dp=new long[(int)end+1];
        dp[1]=0;
        for(int i=1;i<=end;i++){
            for(int j=0;j<n;j++){
                if(a[j][1]==i){
                    if(a[j][2]+dp[(int)a[j][0]]>max){
                        max=a[j][2]+dp[(int)a[j][0]];
                    }
                }
            }
            dp[i]=max;
            max=dp[i];
        }
        System.out.print(dp[(int)end]);
    }
}
