package getoffer;

import java.lang.reflect.Array;
import java.util.*;

public class Meituan {

    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        ArrayList<Long> list=new ArrayList<>();
        long n=scanner.nextLong();
        int sum=0;
        for(long i=1;i<=n;i++){
            long m=i;
            long res=0;
            while (m!=0){
                res=res*10+m%10;
                m=m/10;
            }
            if(res==4*i){
                sum++;
                list.add(i);
                list.add(res);
            }
        }
        System.out.println(sum);
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                System.out.print(list.get(i)+" ");
            }
            if(i%2==1){
                System.out.println(list.get(i));
            }
        }
        if(sum==0){
            System.out.print(0);
        }*/

       /* Scanner scanner=new Scanner(System.in);
        ArrayList<TreeSet<Integer>> sumlist=new ArrayList<>();
        boolean isSame=false;
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        for(int i=0;i<m;i++){
            int one=scanner.nextInt();
            int two=scanner.nextInt();
            for (TreeSet<Integer> set:sumlist
                 ) {
                if (set.contains(one)){
                    set.add(two);
                    isSame=true;
                }
                if(set.contains(two)){
                    set.add(one);
                    isSame=true;
                }
            }
            if(!isSame){
                TreeSet<Integer> set=new TreeSet<>();
                set.add(one);
                set.add(two);
                sumlist.add(set);
            }
        }
        System.out.println(sumlist.size());
        for (TreeSet<Integer> set:sumlist
             ) {
            for (int a: set
                 ) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }*/
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(1,2);
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int n=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        ArrayList<Integer> listA=new ArrayList();
        ArrayList<Integer> listB=new ArrayList();
        for(int i=0;i<n;i++){
            listA.add(scanner.nextInt());
            listB.add(scanner.nextInt());
        }
        Collections.sort(listA);
        Collections.sort(listB);
        for(int i=0;i<a;i++){
            sum+=listA.get(listA.size()-1-i);
        }
        for(int i=0;i<b;i++){
            sum+=listB.get(listB.size()-1-i);
        }
        System.out.print(sum);
    }
}
