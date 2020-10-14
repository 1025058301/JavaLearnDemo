package getoffer;

import java.util.HashMap;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}
public class YY {
    static TreeNode res=null;
    public static void main(String[] args){
        TreeNode a=new TreeNode(10);
        TreeNode b=new TreeNode(5);
        TreeNode c=new TreeNode(8);
        TreeNode d=new TreeNode(9);
        TreeNode e=new TreeNode(7);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        getCommonNode(a,d,c);

    }
    public static long nextNarcissisticNumber (int n) {
        int m=0;
        long sum=0;
        for(long i=n+1;i<Long.MAX_VALUE;i++){
            long val=i;
            while(val>0){
                val=val/10;
                m++;
            }
            long num=i;
            while(num>0){
                sum+=Math.pow(num%10,m);
                num/=10;
            }
            if(sum==i)return i;
            sum=0;
            m=0;
        }
        return 0;
    }
    public  static int getCommonNode(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return 0;
        if(root==p||root==q)return 1;
        int right=getCommonNode(root.right,p,q);
        int left=getCommonNode(root.left,p,q);
        if(right==1&&left==1){
            res=root;
            return 0;
        }
        return (right==1||left==1)?1:0;
    }
}
