package aliyunlearn;
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Test {
    private  int min=0;
    private  int now=0;
    public int run(TreeNode root) {
        now++;
        if(root!=null){
            run(root.left);
            run(root.right);
            if(root.left==null&&root.right==null&&(now<min||min==0)){
                min=now;
            }
        }
        now--;return min;
    }
    public int digui(TreeNode root){
        now++;
        if(root!=null){
            run(root.left);
            run(root.right);
            if(root.left==null&&root.right==null&&(now<min||min==0)){
                min=now;
            }
        }
        now--;return min;
    }
    public static void main(String []args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        Test t=new Test();
        int x=t.digui(root);

    }
}
