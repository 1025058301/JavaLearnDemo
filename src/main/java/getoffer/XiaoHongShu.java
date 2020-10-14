package getoffer;

import java.util.HashSet;

public class XiaoHongShu {
    public static void  main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        int a=solution("abacjksdjldnlvlashdjvsvdnlcd");
    }
    static int solution(String s) {
        char[] c=s.toCharArray();
        int res=0;
        int curpoint=1;
        int curbeforpoint=0;
        int curval=c[0];
        while (true){
            if(c[curpoint]==curval){
                curbeforpoint=curpoint;
                curpoint++;
            }else {
                curpoint++;
            }
            if(curpoint==c.length){
                res++;
                curpoint=curbeforpoint+1;
                curbeforpoint=curpoint;
                if(curbeforpoint==c.length){
                    break;
                }else {
                    curval=c[curpoint];
                }
            }
        }
        return res;
    }
}
