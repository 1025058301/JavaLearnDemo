package getoffer;

import java.util.ArrayList;
import java.util.Scanner;

public class Didi {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        /*ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        int a=n/200;
        for(int b=0;b<9;b++){
            for(int c=0;c<9;c++){
                if(a*100+b*10+c+a*100+c*10+c==n){
                    sum++;
                    list.add(b);
                    list.add(c);
                }
            }
        }
        System.out.println(sum);
        for(int i=0;i<list.size()/2;i++){
            System.out.print(a*100+list.get(2*i)*10+list.get(2*i+1)+" ");
            System.out.println(a*100+list.get(2*i+1)*10+list.get(2*i+1));
        }*/
        ArrayList<Long> list=new ArrayList<>();
        long [][] a=new long [n][n];
        long beforeone=1;
        long beforetwo=1;
        for(int i=0;i<n*n;i++){
            if(i==0||i==1){
                list.add(1L);
            }else {
                long cur=beforeone+beforetwo;
                beforetwo=beforeone;
                beforeone=cur;
                list.add(cur);
            }
        }
        int left=0;
        int right=n-1;
        int high=0;
        int low=n-1;
        int point=0;
        int i=list.size()-1;
        while (left<=right&&high<=low){
            while (point<=right){
                a[high][point]=list.get(i--);
                point++;
            }
            high++;
            point=high;
            while (point<=low){
                a[point][right]=list.get(i--);
                point++;
            }
            right--;
            point=right;
            while (point>=left){
                a[low][point]=list.get(i--);
                point--;
            }
            low--;
            point=low;
            while(point>=high){
                a[point][left]=list.get(i--);
                point--;
            }
            left++;
            point=left;
        }
        for(int c=0;c<n;c++){
            for(int j=0;j<n;j++){
                System.out.print(a[c][j]+" ");
            }
            System.out.println();
        }
    }

}
