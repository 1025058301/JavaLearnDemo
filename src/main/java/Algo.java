import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}
class StringDemo{
    public static String getmaxeuqal(String a,String b){//获取两个字符串的最大相等子串
        String max=a.length()>b.length()?a:b;
        String min=a.equals(max)?b:a;
        for(int x=0;x<min.length();x++){
            for(int j=0, z=min.length()-x;z<min.length()+1;j++,z++){//先看min是否为max子串，在看min子串中长为min-1的是否为max子串....;
                String temp=min.substring(j,z);
                if(max.contains(temp))return  temp;

            }
        }
        return null;
    }
    public static int[] height(int s1,int[] s2){
        int seenum=1;
        int lmax=0;
        int rmax=0;
        int [] a=new int[s1];
        for(int i=0;i<s1;i++){
            for(int j=i-1;j>=0;j--){
                if(j==i-1){lmax=s2[j];seenum++;continue;}
                if(s2[j]>lmax){lmax=s2[j];seenum++;}
            }
            for(int k=i+1;k<s1;k++){
                if(k==i+1){rmax=s2[k]; seenum++;continue;}
                if(s2[k]>rmax){rmax=s2[k];seenum++;}
            }
            a[i]=seenum;
            seenum=1;
            rmax=0;
            lmax=0;
        }
        return a;
    }
    public static StringBuffer unzip(String s){
        int numleft=0;
        int numright=0;
        char[] chars=s.toCharArray();
        StringBuffer returnBuffer=new StringBuffer();
        StringBuffer addBuffer=new StringBuffer();
        StringBuffer repeatBuffer=new StringBuffer();
        StringBuffer numBuffer=new StringBuffer();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<chars.length;i++){
            stack.push(chars[i]);
        }
        while(!stack.isEmpty()){
            char a=stack.pop();
            if(Character.isLetter(a)){
                returnBuffer.insert(0,a);
            }
            if(a==']'){
                numleft++;
                while (stack!=null){
                    char b=stack.pop();
                    if(b==']'){
                        numleft++;continue;
                    }
                    if(Character.isLetter(b))addBuffer.insert(0,b);
                    if(Character.isDigit(b)){
                        numBuffer.insert(0,b);
                        b=stack.pop();
                        while (Character.isDigit(b)){
                            numBuffer.insert(0,b);
                            b=stack.pop();
                        }
                        stack.push(b);
                        repeatBuffer.setLength(0);
                        repeatBuffer.append(addBuffer);
                        for(int i=0;i<Integer.parseInt(new String(numBuffer))-1;i++){
                            addBuffer.append(repeatBuffer);
                        }numBuffer.setLength(0); continue;
                    }
                    if(b=='['){
                        numright++;
                        if(numright==numleft){
                            returnBuffer.insert(0,addBuffer);
                            addBuffer.setLength(0);
                            repeatBuffer.setLength(0);
                            numleft= 0;
                            numright=0;
                            break;
                        }
                    }
                }

            }
        }
        return returnBuffer;
    }
    public static  int[] getnum(int n,int[]a,int m,int[]b){
        int d=0;
        int partition=0;
        int num=0;
        int [] returnarr=new int[m];
        for(int i=0;i<m;i++){
            partition=(int) Math.pow(2.0,b[i]);
            while(d<m){
                int repeatnum=partition/2;
                for(int j=d;j<d+repeatnum;j++){
                    int tmp=a[j];
                    a[j]=a[d+partition-(j-d)-1];
                    a[d+partition-(j-d)-1]=tmp;
                }
                d=d+partition;
            }
            d=0;
            for(int i1=0;i1<m;i1++){
                for(int j1=i1+1;j1<m;j1++){
                if(a[i1]>a[j1])num++;
                }

        }
            returnarr[i]=num;
            num=0;
        }
        return returnarr;
    }
    public static int getSleepday(int m,int[] work,int[] sport){
    int [][] dp=new int[m][3];//0表示休息，1表示工作，2表示健身
    dp[0][1]=work[0]==1?1:0;
    dp[0][2]=sport[0]==1?1:0;
    for(int i=1;i<m;i++){
        dp[i][0]=Math.max(Math.max(dp[i-1][0],dp[i-1][1]),dp[i-1][2]);
        if(work[i]==1){dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2])+1;}
        if(sport[i]==1){dp[i][2]=Math.max(dp[i-1][0],dp[i-1][1])+1;}

    }
    return m-Math.max(Math.max(dp[m-1][0],dp[m-1][1]),dp[m-1][2]);
    }
    public static int getleast(int [][]a){
        boolean end=true;
        int no=0;
        int returnnum=0;
        int length=a[0][1];
        int max=0;
        int biaoji=0;
        int lnow=0;int rnow=0;
        while (end){
        for(int i=1;i<a.length;i++) {
            if (a[i][0] <= lnow &&a[i][1]>lnow&& biaoji == 0) {
                max = a[i][1];
                biaoji++;
                no++;
            }
            if (a[i][0] <= lnow &&a[i][1]>lnow&& biaoji != 0) {
                if (a[i][1] > max) {
                    max = a[i][1];
                }
            }
        }
            if(no==0){return -1;}
            no=0;
            lnow=max;
            max=0;
            biaoji=0;
            returnnum++;
            if(lnow>length){return returnnum;}
        }
        return -1;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length=0;
        int num1=0;
        int num2=0;
        ListNode next1=l1;
        ListNode next2=l2;
        ListNode returnNode=new ListNode(0);
        ListNode biaojiNode=returnNode;
        while(next1!=null){
            num1+=next1.val*(int)Math.pow(10,length);
            next1=next1.next;
            length++;
        }length=0;
        while(next2!=null){
            num2+=next2.val*(int)Math.pow(10,length);
            next2=next2.next;
            length++;
        }
        String sum=String.valueOf(num1+num2);
        for(int i=sum.length()-1;i>=0;i--){
            biaojiNode.val=Integer.valueOf(String.valueOf(sum.charAt(i)));
            if(i==0)break;
            biaojiNode.next=new ListNode(0);
            biaojiNode=biaojiNode.next;
        }
        return returnNode;
    }
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            for(int y=0,z=s.length()-i;z<s.length()+1;z++,y++){
                StringBuffer stringBuffer=new StringBuffer(s.substring(y,z));
                if(new String(stringBuffer).equals(new String(stringBuffer.reverse()))){
                    return new String(stringBuffer);
                }
            }
        }
        return "";
    }
}
public class Algo {
    public static void main(String[] args){
        /*String A="bbisjvahfajbvakbvjkav";
        String B="isjhfajakbvjk";
        String get=StringDemo.getmaxeuqal(A,B);
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("aafaf");
        int [] a=StringDemo.height(6,new int[]{5,3,8,3,2,5});
        int []b =StringDemo.getnum(2,new int[]{2,1,4,3},4,new int[]{1,2,0,2});
        int sleepday=StringDemo.getSleepday(8,new int[]{1,1,0,0,0,1,1,0},new int[]{0,1,1,0,0,1,1,1});
        int least=StringDemo.getleast(new int[][]{{4,12},{3,6},{2,4},{0,2},{4,7}});*/
        ListNode listNode=new ListNode(5);
        listNode.next=new ListNode(7);
        listNode.next.next=new ListNode(8);
        ListNode listNode1=new ListNode(3);
        listNode1.next=new ListNode(2);
        listNode1.next.next=new ListNode(9);
        ListNode returnNode=StringDemo.addTwoNumbers(listNode1,listNode);

}
}
