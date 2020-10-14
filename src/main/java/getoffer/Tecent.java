package getoffer;

import java.util.*;

public class Tecent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String,Integer> treeMap=new TreeMap<>();

    }


    public static void dfs(ArrayList<HashSet<Integer>> list,int val,HashSet<Integer> set){
        for(HashSet<Integer> s:list){
            if(s.contains(val)){
                for(int a:s){
                    if(!set.contains(a)){
                    set.add(a);
                    dfs(list,a,set);
                    }
                }
            }
        }
    }
}
