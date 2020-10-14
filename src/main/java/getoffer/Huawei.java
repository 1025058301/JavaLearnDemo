package getoffer;

import java.util.HashMap;
import java.util.Map;

public class Huawei {
    public static void main(String[] args){
        String s="abcdefghijklmnopqrstuvwxyz";
        String word="cba";
        int a=calculateTime(s,word);
    }
    public static int calculateTime(String keybord,String word){
        Map<Character,Integer> charPositionMap=new HashMap<>();
        int res=0;
        int before=0;
        for(int i=0;i<keybord.length();i++){
            charPositionMap.put(keybord.charAt(i),i);
        }
        for(int i=0;i<word.length();i++){
            int cur=charPositionMap.get(word.charAt(i));
            res+=Math.abs(cur-before);
            before=cur;
        }
        return  res;
    }
    public static int isK(int[] a,int k){
        int length=a.length;
        int max=0;
        int count=0;
        int sum=0;
        for(int i=0;i<length;i++){

            int point=i;
            while (point<length){
                sum+=a[point];
                count++;
                if(sum==k){
                    if(count>max){
                        max=count;
                    }
                }
                point++;
            }
            count=0;
            sum=0;
        }
        return  max;
    }
}
