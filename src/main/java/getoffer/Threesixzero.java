package getoffer;

import java.util.ArrayList;
import java.util.Scanner;

public class Threesixzero {
    public static void main(String[] args){
        /*Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean isright=true;
        int sum=0;
        for(int i=0;i<n;i++){
            String s=scanner.next();
            if (s.length()>10)continue;
            for(int j=0;j<s.length();j++){
                if(!((s.charAt(j)>='a'&&s.charAt(j)<='z')||(s.charAt(j)>='A'&&s.charAt(j)<='Z'))){
                    isright=false;
                }
            }
            if(isright)sum++;
            isright=true;
        }
        System.out.print(sum);*/
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int [] arrayM=new int[M];

        ArrayList<Integer> list=new ArrayList<>(N+2);
        for(int i=1;i<=N;i++){
            list.add(i);
        }
        for(int i=0;i<M;i++){
            arrayM[i]=scanner.nextInt();
        }
        for(int i=0;i<M;i++){
            if(arrayM[i]==1){
                list.add(list.get(0));
                list.remove(0);
            }
            if(arrayM[i]==2){
                if(arrayM[i+1]==1){
                    for(int j=0;j<N;j=j+2){
                        int temp=list.get(j);
                        list.set(j,list.get(j+1));
                        list.set(j+1,temp);
                    }
                }else {
                    i++;
                }
            }
        }
    }
}
