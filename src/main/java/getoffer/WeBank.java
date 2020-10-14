package getoffer;

import java.util.HashSet;
import java.util.Scanner;

public class WeBank {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt()%4;
        int y=in.nextInt()%2;
        int z=in.nextInt()%4;
        int n=in.nextInt();
        int m=in.nextInt();
        int Q=in.nextInt();
        for(int i=0;i<Q;i++){
            int oldX=in.nextInt();
            int oldY=in.nextInt();
            int newX=oldX;
            int newY=oldY;
            for(int j=0;j<x;j++){
                newX=oldY;
                newY=n+1-oldX;
                oldX=newX;
                oldY=newY;
            }
            if(y==1){
                oldY=m-oldY+1;
                newY=oldY;
            }
            for(int j=0;j<z;j++){
                newX=m-oldY+1;
                newY=oldX;
                oldX=newX;
                oldY=newY;
            }
            System.out.println(newX+" "+newY);
        }

    }
    public static void getLikeVal(HashSet<Integer> set,int v){
        if(set.contains(v)){
            System.out.println(v);
            return;
        }
        int num=1;
        while (true){
            if(set.contains(v-num)){
                System.out.println(v-num);
                return;
            }else if(set.contains(v+num)){
                System.out.println(v+num);
                return;
            }
            num++;
        }
    }
}
