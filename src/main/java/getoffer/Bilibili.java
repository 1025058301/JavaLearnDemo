package getoffer;

import java.util.Random;
import java.util.Stack;

public class Bilibili {

    public static void main(String[] args){
        int [] a={3334,3,3333332};
        quicksort(a,0,a.length-1);
    }
    public static boolean IsValidExp (String s) {
        char[] c=s.toCharArray();
        Stack<Character> stack=new Stack();
        if(c.length%2!=0)return false;
        for(int i=0;i<c.length;i++){
            if(c[i]=='('||c[i]=='{'||c[i]=='['){
                stack.push(c[i]);
                continue;
            }
                if(stack.isEmpty()){
                    return false;
                }
                if((c[i]==')'&&stack.peek()!='(')||(c[i]=='}'&&stack.peek()!='{')||(c[i]==']'&&stack.peek()!='[')){
                    return false;
                }
                stack.pop();
        }
        return stack.isEmpty();
    }
    public static int partition(int[] a,int low,int high){
        int i=low;
        int j=high;
        int temp=a[i];
        while(i<j){
            while(i<j&&Integer.valueOf(a[j]+""+temp)>=Integer.valueOf(temp+""+a[j])){
                j--;
            }
            a[i]=a[j];
            while(i<j&&Integer.valueOf(a[i]+""+temp)<Integer.valueOf(temp+""+a[i])){
                i++;
            }
            a[j]=a[i];
        }
        a[i]=temp;
        return i;
    }
    public static void quicksort(int [] a,int s,int h){
        if(s<h){
            int i=partition(a,s,h);
            quicksort(a,s,i-1);
            quicksort(a,i+1,h);
        }
    }
}
